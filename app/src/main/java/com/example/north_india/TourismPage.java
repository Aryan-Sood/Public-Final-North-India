package com.example.north_india;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TourismPage extends AppCompatActivity {

    List<TourismModalClass> list;
    RecyclerView rv;
    LinearLayoutManager lm;

    TourismAdapter adapter;
    final int UPI_PAYMENT=0;
    String txid="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourism_page);

        initDataCategory();
        initRecyclerViewCategory();


    }


    private void initDataCategory() {
        System.out.println("reloaded");
        list = new ArrayList<>();
        list.add(new TourismModalClass("AGRA", R.drawable.unnamed, "Rs. 250", "This is a good place to visit."));
        list.add(new TourismModalClass("RED FORT", R.drawable.kashmir,"Rs. 520", "Tjhis is also a nice place to visit"));
    }
    private void initRecyclerViewCategory() {
        rv = findViewById(R.id.recyclerview);
        lm = new LinearLayoutManager(this);
        adapter = new TourismAdapter(list);
        rv.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }


    void payusingupi(String name, String upiId, String note, String amount) {
        Log.e("main","name: " + name + "--id--" + upiId + "--" + note + "--" + amount);
        Uri uri = Uri.parse("upi://pay").buildUpon()
                .appendQueryParameter("pa", upiId)
                .appendQueryParameter("pn", name)
                .appendQueryParameter("tr","25584584")
                .appendQueryParameter("tn", note)
                .appendQueryParameter("am", amount)
                .appendQueryParameter("cu","INR")
                .build();
        Intent upiPayIntent = new Intent(Intent.ACTION_VIEW);
        upiPayIntent.setData(uri);

        Intent chooser = Intent.createChooser(upiPayIntent, "Pay With");

        if (null != chooser.resolveActivity(getPackageManager())) {
            startActivityForResult(chooser, UPI_PAYMENT);
        } else {
            Toast.makeText(this, "No UPI App Installed", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.e("main","response "+resultCode);  // -1 result code = tr happened but not sure successfully
        switch (requestCode) {
            case UPI_PAYMENT:
                if ((RESULT_OK == resultCode) || (resultCode == 11)) {
                    if (data != null) {
                        String text = data.getStringExtra("response");
                        Log.e("UPI", "onActivityResult: " + text);
                        ArrayList<String> dataList = new ArrayList<>();
                        dataList.add(text);
                        upiPaymentDataOperation(dataList);
                    } else {
                        Log.e("UPI", "onActivityResult: " + "Return Data Is null");
                        ArrayList<String> dataList = new ArrayList<>();
                        dataList.add("nothing");
                        upiPaymentDataOperation(dataList);
                    }
                } else {
                    Log.e("UPI", "onActivityResult: " + "Return Data is null");
                    ArrayList<String> dataList = new ArrayList<>();
                    dataList.add("nothing");
                    upiPaymentDataOperation(dataList);
                }
                break;
        }
    }

    private void upiPaymentDataOperation(ArrayList<String> data)
    {
        if (isConnectionAvailable(TourismPage.this))
        {
            String str = data.get(0);
            Log.e("UPIPAY","upiPaymentDataOperation: " + str);
            String paymentCancel = "";
            if (str==null)
            {
                str = "discard";
            }


            String status = "";
            String approvalRefNo = "";
            String response[] = str.split("&");
            //response = [txnid, responsecode, status,ref]
            for (int i=0;i<response.length;i++)
            {
                String equalStr[] = response[i].split("=");
                //equalstr = [responsecode,code]

                if (equalStr.length>=2)
                {
                    if (equalStr[0].toLowerCase().equals("Status".toLowerCase()))
                    {
                        status = equalStr[1].toLowerCase(); // Success or Failure
                    }
                    else if (equalStr[0].toLowerCase().equals("ApprovalRefNo".toLowerCase()) || equalStr[0].toLowerCase().equals("txnRef".toLowerCase()))
                    {
                        approvalRefNo = equalStr[1];
                    }
                    else if (equalStr[0].toLowerCase().equals("txnId".toLowerCase())){
                        txid = equalStr[1];
                    }
                }
                else
                {
                    paymentCancel = "Payment cancelled by user";
                }
            }
        }
        else
        {
            Toast.makeText(this, "Internet connection is not available. Please check and try again", Toast.LENGTH_SHORT).show();
        }
    }

    public static boolean isConnectionAvailable(Context context)
    {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager!=null)
        {
            NetworkInfo netInfo = connectivityManager.getActiveNetworkInfo();
            if (netInfo!=null && netInfo.isConnected() && netInfo.isConnectedOrConnecting() && netInfo.isAvailable())
            {
                return true;
            }
        }
        return false;
    }

    private void sendSMS(){
        Intent t = getIntent();
        String s1 = t.getStringExtra("name").toUpperCase(Locale.ROOT);
        String s2 = t.getStringExtra("sqsize");
        String s3 = t.getStringExtra("phn");
        String s4 = t.getStringExtra("date");
        String s5 = t.getStringExtra("time");
        String s6 = t.getStringExtra("address").toUpperCase(Locale.ROOT);

        String SMS = "YOUR ROOM IS BOOKED \n NAME: "+s1+"\n ADDRESS: "+s6+"\n SQUAD SIZE: "+s2+"\n DATE & TIME: "+s4+"  "+s5+"\n TXN NO. : " + txid;
        try {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(s3,null,SMS,null,null);
            Toast.makeText(this, "Message Sent", Toast.LENGTH_SHORT).show();
        }
        catch (Exception e){
            e.printStackTrace();
            Toast.makeText(this, "Message Not Sent", Toast.LENGTH_SHORT).show();
        }
    }
}