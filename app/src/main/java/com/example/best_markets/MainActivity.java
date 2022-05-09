package com.example.best_markets;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap googleMap;

    private String test;
    private URLConnector task;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Button mypage = findViewById(R.id.button2);
        mypage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), Shoplist_Activity2.class);
                startActivity(intent1);
            }
        });


        test = "192.168.219.103";
        task = new URLConnector(test);

        task.start();

        try{
            task.join();
            System.out.println("waiting... for result");
        }
        catch(InterruptedException e){

        }

        String result = task.getResult();

        System.out.println(result);



    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        this.googleMap = googleMap;
        LatLng latLng = new LatLng(37.57004, 126.999604); //광장시장
        LatLng latLng1 = new LatLng(37.558919, 126.977057); //남대문
        LatLng latLng2 = new LatLng(37.5566024, 126.9060595); //망원시장
        LatLng latLng3 = new LatLng(37.5618538, 126.960907); //카메라 위치 경도위도 설정
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng3));
        googleMap.moveCamera(CameraUpdateFactory.zoomTo(12)); //카메라 줌
        MarkerOptions markerOptions = new MarkerOptions().position(latLng).title("광장시장").snippet("핫한 시장 음식의 집합소");
        MarkerOptions markerOptions1 = new MarkerOptions().position(latLng1).title("남대문시장").snippet("남대문의 필수코스!!");
        MarkerOptions markerOptions2 = new MarkerOptions().position(latLng2).title("망원시장").snippet("젊은이들의 성지");
        googleMap.addMarker(markerOptions);
        googleMap.addMarker(markerOptions1);
        googleMap.addMarker(markerOptions2);

    }

}