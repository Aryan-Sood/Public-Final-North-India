package com.example.north_india;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class Food_Activity extends AppCompatActivity {

    ImageView im6,im7,im8,im9,im10,im11,im12,im13;
    Button b6;
    final int UPI_PAYMENT=0;
    String txid="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        im6 = findViewById(R.id.imageView6);
        im7 = findViewById(R.id.imageView7);
        im8 = findViewById(R.id.imageView8);
        im9 = findViewById(R.id.imageView9);
        im10 = findViewById(R.id.imageView10);
        im11 = findViewById(R.id.imageView11);
        im12 = findViewById(R.id.imageView12);
        im13 = findViewById(R.id.imageView13);

        im6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getRootView().getContext());
                View dv = LayoutInflater.from(v.getRootView().getContext()).inflate(R.layout.dialogue_box_food,null);
                b6 = dv.findViewById(R.id.button6);
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        payusingupi("Android Club", "airtel.payu@hdfcbank", "", "1");
                    }
                });
                builder.setView(dv);
                builder.setCancelable(true);
                builder.show();
            }
        });

        im7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getRootView().getContext());
                View dv = LayoutInflater.from(v.getRootView().getContext()).inflate(R.layout.dialogue_box_food,null);
                b6 = dv.findViewById(R.id.button6);
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        payusingupi("Android Club", "airtel.payu@hdfcbank", "", "1");
                    }
                });
                builder.setView(dv);
                builder.setCancelable(true);
                builder.show();
            }
        });

        im8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getRootView().getContext());
                View dv = LayoutInflater.from(v.getRootView().getContext()).inflate(R.layout.dialogue_box_food,null);
                b6 = dv.findViewById(R.id.button6);
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        payusingupi("Android Club", "airtel.payu@hdfcbank", "", "1");
                    }
                });
                builder.setView(dv);
                builder.setCancelable(true);
                builder.show();
            }
        });

        im9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getRootView().getContext());
                View dv = LayoutInflater.from(v.getRootView().getContext()).inflate(R.layout.dialogue_box_food,null);
                b6 = dv.findViewById(R.id.button6);
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        payusingupi("Android Club", "airtel.payu@hdfcbank", "", "1");
                    }
                });
                builder.setView(dv);
                builder.setCancelable(true);
                builder.show();
            }
        });

        im10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getRootView().getContext());
                View dv = LayoutInflater.from(v.getRootView().getContext()).inflate(R.layout.dialogue_box_food,null);
                b6 = dv.findViewById(R.id.button6);
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        payusingupi("Android Club", "airtel.payu@hdfcbank", "", "1");
                    }
                });
                builder.setView(dv);
                builder.setCancelable(true);
                builder.show();
            }
        });


        im11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getRootView().getContext());
                View dv = LayoutInflater.from(v.getRootView().getContext()).inflate(R.layout.dialogue_box_food,null);
                b6 = dv.findViewById(R.id.button6);
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        payusingupi("Android Club", "airtel.payu@hdfcbank", "", "1");
                    }
                });
                builder.setView(dv);
                builder.setCancelable(true);
                builder.show();
            }
        });

        im12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getRootView().getContext());
                View dv = LayoutInflater.from(v.getRootView().getContext()).inflate(R.layout.dialogue_box_food,null);
                b6 = dv.findViewById(R.id.button6);
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        payusingupi("Android Club", "airtel.payu@hdfcbank", "", "1");
                    }
                });
                builder.setView(dv);
                builder.setCancelable(true);
                builder.show();
            }
        });

        im13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getRootView().getContext());
                View dv = LayoutInflater.from(v.getRootView().getContext()).inflate(R.layout.dialogue_box_food,null);
                b6 = dv.findViewById(R.id.button6);
                b6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        payusingupi("Android Club", "airtel.payu@hdfcbank", "", "1");
                    }
                });
                builder.setView(dv);
                builder.setCancelable(true);
                builder.show();
            }
        });


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
        if (isConnectionAvailable(Food_Activity.this))
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