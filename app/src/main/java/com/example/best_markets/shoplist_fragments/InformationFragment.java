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

import lombok.SneakyThrows;


public class InformationFragment extends Fragment {

    private static final String TAG = "InformationFragment";

    TextView textView;
    int count=2;
    String infor;

    private String shopname;

    public InformationFragment() {
        shopname = "old";
    }

    public InformationFragment(String shopname) {
        this.shopname = shopname;
    }

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

//        myDbHelper mydbHelper = new myDbHelper(getActivity().getApplicationContext());

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

//        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_information, container, false);
//        textView = (TextView) rootView.findViewById(R.id.tyty);


//        SharedPreferences sp1 = getActivity().getPreferences(Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = sp1.edit();
//        editor.putInt("count", count);
//        editor.commit();
//
//        int count1 = sp1.getInt("count",0);
//        Log.i(TAG, "count : " + count1);
//
//        Log.i(TAG, "sel btn clicked");
//        SQLiteDatabase db1 = mydbHelper.getReadableDatabase();
//        Cursor c = db1.rawQuery("SELECT * FROM " + TableInfo.TABLE_NAME, null);
//        if (c.moveToFirst()) {
//            do {
//                String col1 = c.getString(0);
//                String col2 = c.getString(1);
//                String col3 = c.getString(2);
//                String col4 = c.getString(3);
//                Log.i(TAG, "READ, col1: " + col1 + "col2: " + col2 + ", col3:" + col3 + " , col4: " + col4);
//
//                if(col1.equals("왕성식당")){
//                    infor = col1 + " " + col2 + " " + col3 + " " + col4;
//                }
//
//            } while (c.moveToNext());
//        }
//        c.close();
//        db1.close();
//
//        textView.setText(infor);

        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_information, container, false);
        textView = (TextView) rootView.findViewById(R.id.tyty);

        if(shopname == "old"){
            textView.setText("남대문 시장 주소 : 04529 서울특별시 중구 남대문시장4길 21 (남창동) \n영엽 시간 : 오후 9:00에 영업 종료 \n연락처 : 02-753-2805 \n교통 정보 : 4호선 회현역 5번, 6번, 7번 출구 도보 5분 \n");

        }

        if(shopname == "bu"){
            textView.setText("광장 시장 : 조선시대 배오개시장 명맥을 이은 전통시장" +
                    " \n미쉐린 가이드 서울 2022에 선정된 맛집 \n");
        }

        if(shopname == "dack"){
            textView.setText("남대문 시장 주소 : 04529 서울특별시 중구 남대문시장4길 21 (남창동) " +
                    "\n영엽 시간 : 07:00 ~ 21:00 \n연락처 : 02-753-9063 \n교통 정보 : 4호선 회현역 5번, 6번, 7번 출구 도보 5분 \n");
        }

        if(shopname == "eunho"){
            textView.setText("70년 전 남대문시장에 좌판을 펴고 꼬리곰탕을 만들기 시작해서 \n" +
                    "지금까지 3대에 걸쳐 꾸준히 그 맛을 이어 오고 있다. \n" +
                    "꼬리곰탕 이외에도 도가니탕, 설렁탕, 수육 등도 맛볼 수 있다.\n" +
                    "\n남대문 시장 주소 : 04529 서울특별시 중구 남대문시장4길 21 (남창동) " +
                    "\n영엽 시간 : 06:30 ~ 21:00 (토요일 06:30~16:30) \n연락처 : 02-753-3263 \n교통 정보 : 4호선 회현역 5번, 6번, 7번 출구 도보 5분 \n");
        }

        if(shopname == "gangganae"){
            textView.setText("물을 넣지 않고 무로만 국물을 내어 만드는 떡볶이 \n" +
                    "\n광장 시장 : 조선시대 배오개시장 명맥을 이은 전통시장 ");
        }

        if(shopname == "gorocae"){
            textView.setText("영엽 시간 : 월-금 " +
                            "\n연락처 : 02-336-7412 " +
                            "\n위치 : 망원역 2번출구 515m \n" +
                    "\n망원 시장 : 망원1동에 있는 재래시장 ");
        }

        if(shopname == "heelockgalchi"){
            textView.setText("남대문 시장 주소 : 04529 서울특별시 중구 남대문시장4길 21 (남창동) " +
                    "\n찌그러진 양은냄비 집으로 유명한 갈치조림 집. " +
                    "\n냄비에 듬성듬성 썬 무를 바닥에 깔고 물과 양념장, " +
                    "\n갈치를 넣고 끓였다가 " +
                    "\n조금 후에 이를 다시 한 번 끓여서 반쯤 졸여 놓는다. " +
                    "\n그리고 주문이 들어오면 완전히 익혀서 낸다. " +
                    "\n씨를 빼직접 빻아서 쓰는 고춧가루도 이 집의 자랑거리이다. " +
                    "\n밥은 무한정 리필된다. \n" +
                    "\n남대문시장 갈치골목의 원조집이다."+
                    "\n영엽 시간 : 04:00 ~ 21:00 " +
                    "\n연락처 :  02-755-3449 " +
                    "\n위치 : 망원역 2번출구 515m " );
        }

        if(shopname == "hongduggae"){
            textView.setText(
                    "영엽 시간 : 월-금 " +
                    "\n망원 시장 : 망원1동에 있는 재래시장 ");
        }//yes

        if(shopname == "jinokhalmae"){
            textView.setText("- 시원하고 깔끔한 국물이 명품일 닭한마리집" +
                    "\n광장 시장 : 조선시대 배오개시장 명맥을 이은 전통시장 ");
        }//yes

        if(shopname == "maknae"){
            textView.setText("\n남대문 시장 주소 : 04529 서울특별시 중구 남대문시장4길 21 (남창동) " +
                    "\n두툼하게 썬 회 맛을 느낄 수 있는 곳. " +
                    "\n회는 모두 완도산으로, " +
                    "\n이틀에 한 번 현지에서 활어를 직송해 하루 정도 수족관에 보관해 놓고 " +
                    "\n선어로 적정 숙성시켜 식탁 위에 올린다. " +
                    "\n회덮밥을 시키면 매운탕에 고등어조림이 함께 나온다. " +
                    "\n가격 대비 만족도가 높은 곳 중의 하나.\n"+
                    "\n영엽 시간 : 10:00 ~ 23:30 " +
                    "\n연락처 : 02-755-5115 " );
        }//yes

        if(shopname == "monyeo"){
            textView.setText("- 삼모녀가 같이 운영하는 티비 방영 맛집" +
                    "\n광장 시장 : 조선시대 배오개시장 명맥을 이은 전통시장 " );
        }

        if(shopname == "obok"){
            textView.setText("망원 시장 : 망원1동에 있는 재래시장" +
                     "\n영엽 시간 : 화~일 17:00~23:00 " +
                    "\n연락처 : 0507-1312-9873 " );
        }//yes

        if(shopname == "ques"){
            textView.setText("망원 시장 : 망원1동에 있는 재래시장 " +
                     "\n영엽 시간 : 10:00 ~ 20:30 \n" +
                    "-1/3, 2/3 =2가지맛\n" +
                    "-1마리, 1마리반 =3가지맛\n" +
                    "-2마리 = 4가지맛\n"+
                    "맛 : 치즈머스타드, 화이트크림, 달콤\n" +
                    "과일, 깐풍기, 양념 닭똥집도 판매\n");
        }//yes

        if(shopname == "uelock"){
            textView.setText("망원 시장 : 망원1동에 있는 재래시장 " +
                    "\n영엽 시간 : 12:00 ~ 22:00 " +
                    "\n위치: 망원역2번출구 454m"+
                    "\nA세트) 모듬+쫄면+고추튀김3개 -32000원\n" +
                    "B세트) 육전 + 부추쫄면 +고추튀김3개 – 32000원\n" +
                    "C세트) 통새우전 + 부추쫄면 + 고추튀김3개 -31000원\n");
        }//yes

        if(shopname == "wangsung"){
            textView.setText("남대문 시장 주소 : 04529 서울특별시 중구 남대문시장4길 21 (남창동) " +
                    "\n경상도 풍의 뚝배기 갈치조림으로 유명한 집. " +
                    "\n남대문시장의 갈치골목이 생긴 유래가 된 원조집이기도 하다. " +
                    "\n점심 시간에는 줄을 서야 할 정도로 " +
                    "\n뜨거운 뚝배기에 끓여져서 나오는 갈치조림이 일품이다. " +
                    "\n남대문 시장 안의 좁은 골목에 있어 찾기가 어려우니 " +
                    "\n미리 연락해서 위치를 알아두는 것이 좋다.\n"+
                    "\n영엽 시간 : 04:00 ~ 20:00 " +
                    "\n연락처 : 02-752-9476" );
        } //yes

        if(shopname == "wonjonudecheesekimbop"){
            textView.setText("- 티비 방영 많이 한 광장시장 누드치즈김밥의 원조집" +
                    "\n광장 시장 : 조선시대 배오개시장 명맥을 이은 전통시장 " );
        }//yes

        if(shopname == "wonjosunheenae"){
            textView.setText("- 광장시장에서 유명한 저렴하고 맛있는 빈대떡 맛집" +
                    "\n광장 시장 : 조선시대 배오개시장 명맥을 이은 전통시장 " );
        }//yes


        return rootView;


        //return inflater.inflate(R.layout.fragment_information, container, false);
    }
}