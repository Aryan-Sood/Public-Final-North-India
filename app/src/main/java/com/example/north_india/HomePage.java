package com.example.north_india;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.bumptech.glide.request.RequestOptions;
import com.glide.slider.library.SliderLayout;
import com.glide.slider.library.slidertypes.BaseSliderView;
import com.glide.slider.library.slidertypes.TextSliderView;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {


    SliderLayout sliderLayout;

    MaterialCardView materialCardView, materialCardView2, materialCardView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

    sliderLayout = findViewById(R.id.imageSlider);

    materialCardView = findViewById(R.id.materialCardView);
    materialCardView2 = findViewById(R.id.materialCardView2);
    materialCardView3 = findViewById(R.id.materialCardView3);

        ArrayList<Integer> images = new ArrayList<>();
        images.add(R.drawable.tourism);
        images.add(R.drawable.clothes);
        images.add(R.drawable.food);

        RequestOptions requestOptions = new RequestOptions();
        requestOptions.centerCrop();

        for (int i = 0; i < images.size(); i++) {

            TextSliderView sliderView = new TextSliderView(this);

            sliderView.image(images.get(i))
                    .setProgressBarVisible(false)
                    .setRequestOption(requestOptions);

            sliderView.bundle(new Bundle());
            sliderLayout.addSlider(sliderView);
        }


        materialCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(HomePage.this, "Cuisine", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(HomePage.this, Food_Activity.class);
                startActivity(intent);
            }
        });

        materialCardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(HomePage.this, "Tourism", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(HomePage.this, TourismPage.class);
                startActivity(intent);
            }
        });

        materialCardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomePage.this, "Coming Soon", Toast.LENGTH_SHORT).show();
            }
        });


    }
}