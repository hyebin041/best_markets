package com.example.best_markets;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.best_markets.shoplist_fragments.InformationFragment;
import com.example.best_markets.shoplist_fragments.MenuFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class shoplist_wangsung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoplist_wangsung);

        // 프래그먼트 객체 선언
        Fragment fragment_menu = new MenuFragment("wangsung");
        Fragment fragment_inform = new InformationFragment("wangsung");


        //제일 처음 띄워줄 뷰를 세팅해줍니다. commit();까지 해줘야 합니다.
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, fragment_menu).commitAllowingStateLoss();

        // 바텀 네비게이션 객체 선언
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // 바텀 네비게이션 클릭 리스너 설정
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.fragment_menu:
                        // replace(프레그먼트를 띄워줄 frameLayout, 교체할 fragment 객체)
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, fragment_menu).commitAllowingStateLoss();
                        return true;
                    case R.id.fragment_information:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, fragment_inform).commitAllowingStateLoss();
                        return true;
                    default:
                        return false;
                }
            }
        });

    }
}