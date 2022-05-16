package com.example.best_markets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;
import android.widget.ViewFlipper;

public class MarketListActivity extends AppCompatActivity {
    ViewFlipper v_fllipper;
    Button startBtn, stopBtn;
    Toolbar toolbar;
    Button button1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("oo 시장");


        button1 = (Button) findViewById(R.id.button1);




        startBtn = findViewById(R.id.startBtn);     //슬라이드 버튼
        stopBtn = findViewById(R.id.stopBtn);

        v_fllipper = findViewById(R.id.image_slide);

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v_fllipper.startFlipping();
                v_fllipper.setFlipInterval(1000);
            }
        });

        stopBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v_fllipper.stopFlipping();

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BackActivity.class);
                startActivity(intent);
            }
        });




    }
}