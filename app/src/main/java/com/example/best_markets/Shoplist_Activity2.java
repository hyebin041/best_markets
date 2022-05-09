package com.example.best_markets;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListAdapter;
import android.widget.RatingBar;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.best_markets.shoplist_fragments.InformationFragment;
import com.example.best_markets.shoplist_fragments.MenuFragment;
import com.example.best_markets.shoplist_fragments.ReviewFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class Shoplist_Activity2 extends AppCompatActivity {

    String myJSON;
    private static final String TAG_RESULTS = "result";
    private static final String TAG_MarketName = "marketname";
    private static final String TAG_MarketIntro = "marketintro";

    JSONArray markets = null;

    ArrayList<HashMap<String, String>> marketList;

    TextView shop_name;
    TextView shop_intro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoplist2);

        marketList = new ArrayList<HashMap<String, String>>();
        getData("http://192.168.219.103/PHP_connection.php");

        RatingBar ratingBar = findViewById(R.id.ratingBar1);
        ratingBar.bringToFront();


        // 프래그먼트 객체 선언
        Fragment fragment_menu = new MenuFragment();
        Fragment fragment_inform = new InformationFragment();
        Fragment fragment_review = new ReviewFragment();

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
                    case R.id.fragment_review:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, fragment_review).commitAllowingStateLoss();
                        return true;
                    default:
                        return false;
                }
            }
        });

    }

    protected void showList(){
        try {
            JSONObject jsonObj = new JSONObject(myJSON);
            markets = jsonObj.getJSONArray(TAG_RESULTS);

            for(int i=0; i<markets.length(); i++){
                JSONObject c = markets.getJSONObject(i);
                String market_name = c.getString(TAG_MarketName);
                String market_intro = c.getString(TAG_MarketIntro);

                HashMap<String, String> markets = new HashMap<String, String>();

                markets.put(TAG_MarketName, market_name);
                markets.put(TAG_MarketIntro, market_intro);

                marketList.add(markets);
            }

            ListAdapter adapter = new SimpleAdapter(
              Shoplist_Activity2.this, marketList, R.layout.activity_shoplist2,
              new String[]{TAG_MarketName, TAG_MarketIntro},
              new int[]{R.id.shop_name, R.id.shop_intro}
            );

            shop_name.setText(TAG_MarketName);
            shop_intro.setText(TAG_MarketIntro);


        } catch(JSONException e){
            e.printStackTrace();
        }
    }

    public void getData(String url){
        class GetDataJSON extends AsyncTask<String, Void, String> {


            @Override
            protected String doInBackground(String... strings) {
                String uri = strings[0];

                BufferedReader bufferedReader = null;
                try{
                    URL url = new URL(uri);
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    StringBuilder sb = new StringBuilder();

                    bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()));

                    String json;
                    while((json=bufferedReader.readLine())!=null){
                        sb.append(json+"/n");
                    }
                    return sb.toString().trim();

                } catch (Exception e) {
                    return null;
                }
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                myJSON = s;
                showList();
            }
        }
        GetDataJSON g = new GetDataJSON();
        g.execute(url);
    }
}