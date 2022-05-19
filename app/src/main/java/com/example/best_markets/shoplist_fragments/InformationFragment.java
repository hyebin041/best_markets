package com.example.best_markets.shoplist_fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.best_markets.R;
import com.example.best_markets.TableInfo;
import com.example.best_markets.myDbHelper;

import lombok.SneakyThrows;


public class InformationFragment extends Fragment {

    private static final String TAG = "InformationFragment";

    TextView textView;

    String              nameSt, depSt;
    int                 ageInt;
    myDbHelper          myHelper;
    SQLiteDatabase      sqlDB;
    int                 count=2;
    String infor;

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

        myDbHelper mydbHelper = new myDbHelper(getActivity().getApplicationContext());

//        Log.i(TAG, "DB에 추가");
//        ContentValues values = new ContentValues();
//        values.put(TableInfo.COLUMN_NAME_SHOPNAME, "왕성식당");
//        values.put(TableInfo.COLUMN_NAME_BUSINESSHOURS, "4:00-20:00");
//        values.put(TableInfo.COLUMN_NAME_CONTACTNUMBER, "02-752-9476");
//        values.put(TableInfo.COLUMN_NAME_WAYTOCOME, "남대문 시장");
//
//        SQLiteDatabase db = mydbHelper.getWritableDatabase();
//        long newRowId = db.insert(TableInfo.TABLE_NAME,null, values);
//        Log.i(TAG,"new row ID: " + newRowId);
//

        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_information, container, false);
        textView = (TextView) rootView.findViewById(R.id.tyty);


        SharedPreferences sp1 = getActivity().getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp1.edit();
        editor.putInt("count", count);
        editor.commit();

        int count1 = sp1.getInt("count",0);
        Log.i(TAG, "count : " + count1);

        Log.i(TAG, "sel btn clicked");
        SQLiteDatabase db1 = mydbHelper.getReadableDatabase();
        Cursor c = db1.rawQuery("SELECT * FROM " + TableInfo.TABLE_NAME, null);
        if (c.moveToFirst()) {
            do {
                String col1 = c.getString(0);
                String col2 = c.getString(1);
                String col3 = c.getString(2);
                String col4 = c.getString(3);
                Log.i(TAG, "READ, col1: " + col1 + "col2: " + col2 + ", col3:" + col3 + " , col4: " + col4);

                if(col1 == "왕성식당"){
                    infor = col1 + col2 + col3 + col4;
                }

            } while (c.moveToNext());
        }
        c.close();
        db1.close();




//        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_information, container, false);
//        textView = (TextView) rootView.findViewById(R.id.tyty);
        textView.setText("남대문 시장 주소 : 04529 서울특별시 중구 남대문시장4길 21 (남창동) \n영엽 시간 : 오후 9:00에 영업 종료 \n연락처 : 02-753-2805 \n교통 정보 : 4호선 회현역 5번, 6번, 7번 출구 도보 5분 \n");

        return rootView;


        //return inflater.inflate(R.layout.fragment_information, container, false);
    }
}