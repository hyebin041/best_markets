package com.example.best_markets.shoplist_fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.best_markets.R;
import com.opencsv.CSVReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

import lombok.SneakyThrows;


public class InformationFragment extends Fragment {

    private static final String TAG = "InformationFragment";

    TextView textView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @SneakyThrows
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

//        View view = inflater.inflate(R.layout.fragment_review, container, false);
//        TextView tv = view.findViewById(R.id.tyty);
//        tv.setText("sdhgkjfhkjsdhfjk");
//        return view;


        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_information, container, false);
        textView = (TextView) rootView.findViewById(R.id.tyty);

        HashMap<String,StringBuilder> map1 = new HashMap<String,StringBuilder>(); //HashMap생성

        StringBuilder builder = new StringBuilder();
        String name = new String();

        InputStreamReader is = new InputStreamReader(getResources().openRawResource(R.raw.information));
        BufferedReader reader = new BufferedReader(is);
        CSVReader read = new CSVReader(reader);
        String[] record = null;

        while ((record = read.readNext()) != null){
            for(int i=0; i< record.length; i++){
                if(i == 0){
                    name = record[i];
                }
                System.out.print(i + " " + record[i] + " ");
                builder.append(record[i]).append(" ");
            }
            System.out.println();
        }


//        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_information, container, false);
//        textView = (TextView) rootView.findViewById(R.id.tyty);
//        textView.setText("남대문 시장 주소 : 04529 서울특별시 중구 남대문시장4길 21 (남창동) \n영엽 시간 : 오후 9:00에 영업 종료 \n연락처 : 02-753-2805 \n교통 정보 : 4호선 회현역 5번, 6번, 7번 출구 도보 5분 \n");
        return rootView;


        //return inflater.inflate(R.layout.fragment_information, container, false);
    }
}