package com.example.best_markets;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.best_markets.DB.MarketTableInfo;
import com.example.best_markets.DB.myDbHelperMk;

public class MarketActivity extends AppCompatActivity {
    private static final String TAG = "MarketActivity";
    int count=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);

        TextView market_name = findViewById(R.id.textView1);
        TextView market_intro = findViewById(R.id.textView2);
        TextView market_name1 = findViewById(R.id.textView3);
        TextView market_intro1 = findViewById(R.id.textView4);
        TextView market_name2 = findViewById(R.id.textView5);
        TextView market_intro2 = findViewById(R.id.textView6);



        myDbHelperMk mydbHelper = new myDbHelperMk(getApplicationContext());

//        Log.i(TAG, "DB에 추가");
//        ContentValues values = new ContentValues();
//        values.put(MarketTableInfo.COLUMN_NAME_M_NAME, "남대문 시장");
//        values.put(MarketTableInfo.COLUMN_NAME_M_INTRO, "숭례문 근처의 시장");
//        values.put(MarketTableInfo.COLUMN_NAME_M_NAME, "망원 시장");
//        values.put(MarketTableInfo.COLUMN_NAME_M_INTRO, "망원1동에 있는 재래시장");
//        values.put(MarketTableInfo.COLUMN_NAME_M_NAME, "광장 시장");
//        values.put(MarketTableInfo.COLUMN_NAME_M_INTRO, "조선시대 배오개시장 명맥을 이은 전통시장");

        //VALUES('남대문 시장', '숭례문 근처의 시장');
        //VALUES('망원 시장', '망원1동에 있는 재래시장');
        //VALUES('광장 시장', '조선시대 배오개시장 명맥을 이은 전통시장');

//        SQLiteDatabase db = mydbHelper.getWritableDatabase();
//        long newRowId = db.insert(MarketTableInfo.TABLE_NAME,null, values);
//        Log.i(TAG,"new row ID: " + newRowId);
//


        SharedPreferences sp1 = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp1.edit();
        editor.putInt("count", count);
        editor.commit();

        int count1 = sp1.getInt("count",0);
        Log.i(TAG, "count : " + count1);

        Log.i(TAG, "sel btn clicked");
        SQLiteDatabase db1 = mydbHelper.getReadableDatabase();
        Cursor c = db1.rawQuery("SELECT * FROM " + MarketTableInfo.TABLE_NAME, null);
        if (c.moveToFirst()) {
            do {
                String col1 = c.getString(0);
                String col2 = c.getString(1);
                Log.i(TAG, "READ, col1: " + col1 + "col2: " + col2 );

                if(col1.equals("광장 시장")){
                    market_name.setText(col1);
                    market_intro.setText(col2);
                }
                else if(col1.equals("망원 시장")){
                    market_name1.setText(col1);
                    market_intro1.setText(col2);
                }
                else if(col1.equals("남대문 시장")){
                    market_name2.setText(col1);
                    market_intro2.setText(col2);
                }

            } while (c.moveToNext());
        }
        c.close();
        db1.close();

        market_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), Shoplist_Activity2.class); /////////////////////////////////
                startActivity(intent1);
            }
        });

        market_name1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), Shoplist_Activity2.class); /////////////////////////////////
                startActivity(intent1);
            }
        });

        market_name2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), Shoplist_Activity2.class); /////////////////////////////////
                startActivity(intent1);
            }
        });

    }
}