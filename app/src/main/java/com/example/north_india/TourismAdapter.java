package com.example.north_india;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TourismAdapter extends RecyclerView.Adapter<TourismAdapter.ViewHolder> {

    List<TourismModalClass> userList;


    public TourismAdapter(List<TourismModalClass> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public TourismAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tourist_palette, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TourismAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {

        int resource = userList.get(position).getImage();
        String price = userList.get(position).getPrice();
        String text2 = userList.get(position).getName();

        holder.setData(resource, price,text2 );

        holder.moreinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(v.getRootView().getContext());
                View dv = LayoutInflater.from(v.getRootView().getContext()).inflate(R.layout.tourism_dialogue,null);
                TextView name, description;
                Button button;
                name = dv.findViewById(R.id.textView2);
                description = dv.findViewById(R.id.textView5);
                button = dv.findViewById(R.id.button);

                name.setText(userList.get(position).getName());
                description.setText(userList.get(position).getTripDescription());

                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // payment Window
                    }
                });

                builder.setView(dv);
                builder.setCancelable(true);
                builder.show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView text, moreinfo, name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageView);
            text = itemView.findViewById(R.id.textView);
            moreinfo = itemView.findViewById(R.id.textView4);
            name = itemView.findViewById(R.id.name);

        }

        public void setData(int resource, String text1, String text2) {
            image.setImageResource(resource);
            text.setText(text1);
            name.setText(text2);
        }
    }


}
