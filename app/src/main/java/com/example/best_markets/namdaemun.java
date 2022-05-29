package com.example.best_markets;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

public class namdaemun extends AppCompatActivity {
    ViewFlipper v_fllipper;
    Button startBtn, stopBtn;
    Toolbar toolbar;
    Button button1, button2, button3, button4, button5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marketlist_nam);
        setTitle("남대문 시장");


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

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), shoplist_wangsung.class);
                startActivity(intent);
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), shoplist_dackjinme.class);
                startActivity(intent);
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), shoplist_eunho.class);
                startActivity(intent);
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), shoplist_heelockgalchi.class);
                startActivity(intent);
            }
        });

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), shoplist_maknae.class);
                startActivity(intent);
            }
        });

    }
}