package com.example.yy.algorithm_lab.activities.UserActivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.yy.algorithm_lab.R;

public class UserMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_main);

        Button siteDistr = (Button)findViewById(R.id.activity_user_main_siteDistr_btn);
        Button siteSearch = (Button)findViewById(R.id.activity_user_main_siteSearch_btn);
        Button guidline = (Button)findViewById(R.id.activity_user_main_guidline_btn);
        Button shortest = (Button)findViewById(R.id.activity_user_main_shortestRoad_btn);
        Button parking = (Button)findViewById(R.id.activity_user_main_parking_btn);


        siteDistr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SiteDistrActivity.class);
                startActivity(intent);
            }
        });

        siteSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SiteSearch.class);
                startActivity(intent);
            }
        });

        guidline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), GuidlineActivity.class);
                startActivity(intent);
            }
        });

        shortest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), shortestRoadActivity.class);
                startActivity(intent);
            }
        });

        parking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ParkingActivity.class);
                startActivity(intent);
            }
        });
    }
}