package com.example.best_markets;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SingleAdapter extends BaseAdapter {
    private static final String TAG = "SingleAdapter";

    private List<Movie> items=new ArrayList<>();

    public SingleAdapter() {
        items.add(new Movie("짜장면","4000원",R.drawable.img));
        items.add(new Movie("짬뽕","4000원",R.drawable.img));
        items.add(new Movie("볶음밥","4000원",R.drawable.img));
        items.add(new Movie("탕수육","4000원",R.drawable.img));
        items.add(new Movie("짬짜면","4000원",R.drawable.img));
        items.add(new Movie("짬볶밥","4000원",R.drawable.img));
        items.add(new Movie("잡채밥","4000원",R.drawable.img));
        items.add(new Movie("군만두","4000원",R.drawable.img));
        items.add(new Movie("우동","4000원",R.drawable.img));
        items.add(new Movie("마파두부덮밥","4000원",R.drawable.img));
        items.add(new Movie("단무지","4000원",R.drawable.img));
        items.add(new Movie("곱빼기","4000원",R.drawable.img));
    }

    public SingleAdapter(String i) {
        if(i == "bu"){
            items.add(new Movie("육회","17000원",R.drawable.buchon_ukhea));
            items.add(new Movie("육회낙지탕탕이","30000원",R.drawable.buchon_ukheanakji));
            items.add(new Movie("간.천엽","15000원",R.drawable.buchon_gan));
            items.add(new Movie("육회물회","30000원",R.drawable.buchon_mulhea));
            items.add(new Movie("육사시미","4000원",R.drawable.buchon_uksasimi));
            items.add(new Movie("육회비빔밥","8000원",R.drawable.buchon_bibimbop));
            items.add(new Movie("육회비빔밥(특)","12000원",R.drawable.buchon_bibimbop));
            items.add(new Movie("산낙지탕탕이","15000원 ",R.drawable.buchon_nakjitangtang));
        }
        if(i == "dac"){
            items.add(new Movie("닭곰탕","9000원",R.drawable.dac_dacgomtang));
            items.add(new Movie("고기백반","10000원",R.drawable.dac_backban));
            items.add(new Movie("닭고기","9000원",R.drawable.dac_dacgogi));
            items.add(new Movie("통닭","20000원",R.drawable.dac_tongdac));
            items.add(new Movie("소주","4000원",R.drawable.dac_soju));
            items.add(new Movie("맥주","4000원",R.drawable.dac_mackju));
            items.add(new Movie("청하","5000원",R.drawable.dac_chungha));
            items.add(new Movie("백세주","7000원",R.drawable.dac_backsaju));

        }
        if(i == "eunho"){
            items.add(new Movie("꼬리토막","33,000원",R.drawable.img));
            items.add(new Movie("꼬리곰탕","28,000원",R.drawable.img));
            items.add(new Movie("도가니탕","19,000원",R.drawable.img));
            items.add(new Movie("양지탕","15,000원",R.drawable.img));
            items.add(new Movie("소머리국밥 ","12,000원",R.drawable.img));
            items.add(new Movie("설렁탕","11,000원",R.drawable.img));
            items.add(new Movie("꼬리찜","88,000원",R.drawable.img));
            items.add(new Movie("모둠수육","75,000원",R.drawable.img));

        }
        //====================================================
        if(i == "gangganae"){
            items.add(new Movie("무떡볶이","4500원",R.drawable.img));
            items.add(new Movie("튀김1인분(4개)","4500원",R.drawable.img));
            items.add(new Movie("튀김 모듬 (10개)","10000원",R.drawable.img));
            items.add(new Movie("떡볶이 + 튀김","5000원",R.drawable.img));
            items.add(new Movie("소떡소떡 ","3000원",R.drawable.img));
            items.add(new Movie("순대꼬치","2000원",R.drawable.img));

        }
        if(i == "gorocae"){
            items.add(new Movie("야채","1000원",R.drawable.img));
            items.add(new Movie("단팥","700원",R.drawable.img));
            items.add(new Movie("고구마카레","700원",R.drawable.img));
            items.add(new Movie("감자","700원",R.drawable.img));
            items.add(new Movie("참치 ","700원",R.drawable.img));
            items.add(new Movie("찹쌀꽈배기 + 핫도그","1000원",R.drawable.img));
            items.add(new Movie("옛날꽈배기+순찹쌀도너츠","500원 / 1000원",R.drawable.img));
            items.add(new Movie("야채샐러드빵","2500원",R.drawable.img));

        }
        if(i == "heelockgalchi"){
            items.add(new Movie("갈치조림","10,000원",R.drawable.img));
            items.add(new Movie("고등어조림","10,000원",R.drawable.img));
            items.add(new Movie("모듬생선구이","10,000원",R.drawable.img));
            items.add(new Movie("고등어구이","9000원",R.drawable.img));
            items.add(new Movie("코다리 양념구이","9000원",R.drawable.img));
            items.add(new Movie("삼치구이","9000원",R.drawable.img));
            items.add(new Movie("청국장","7000원",R.drawable.img));
            items.add(new Movie("계란찜","2000원",R.drawable.img));

        }
        if(i == "hongduggae"){
            items.add(new Movie("손칼국수","4500원",R.drawable.img));
            items.add(new Movie("손수제비","4500원",R.drawable.img));
            items.add(new Movie("들깨손수제비","5500원",R.drawable.img));
            items.add(new Movie("옛날손짜장","5000원",R.drawable.img));
            items.add(new Movie("들깨손칼국수 ","5500원",R.drawable.img));
            items.add(new Movie("여름/콩국수","8000원",R.drawable.img));
            items.add(new Movie("냉국수","7000원",R.drawable.img));
            items.add(new Movie("비빔국수","7000원",R.drawable.img));

        }
        if(i == "jinokhalmae"){
            items.add(new Movie("닭한마리","25,000원",R.drawable.img));
            items.add(new Movie("닭도리탕","30,000원",R.drawable.img));
            items.add(new Movie("떡사리","1000원",R.drawable.img));
            items.add(new Movie("국수사리","2000원",R.drawable.img));
            items.add(new Movie("버섯사리 ","2000원",R.drawable.img));
            items.add(new Movie("감자사리","2000원",R.drawable.img));
            items.add(new Movie("공기밥","2000원",R.drawable.img));

        }
        if(i == "maknae"){
            items.add(new Movie("광어","70,000원",R.drawable.maknae_flatfish));
            items.add(new Movie("우럭","70,000원",R.drawable.maknae_ureok));
            items.add(new Movie("광어 (대)","65,000원",R.drawable.maknae_flatbig));
            items.add(new Movie("광어 (중)","40,000원",R.drawable.maknae_flatmed));
            items.add(new Movie("모둠 (대) ","55,000원",R.drawable.maknae_modeumbig));
            items.add(new Movie("모둠 (중)","35,000원",R.drawable.maknae_modeummed));

        }
        if(i == "monyeo"){
            items.add(new Movie("마약김밥","3000원",R.drawable.img));
            items.add(new Movie("비빔/물냉면","6000원",R.drawable.img));
            items.add(new Movie("잔치국수","5000원",R.drawable.img));
            items.add(new Movie("열무국수","6000원",R.drawable.img));
            items.add(new Movie("열무냉면 ","6000원",R.drawable.img));
            items.add(new Movie("콩국수","6000원",R.drawable.img));
            items.add(new Movie("순대","7000원",R.drawable.img));
            items.add(new Movie("머리고기","7000원",R.drawable.img));

        }
        if(i == "obok"){
            items.add(new Movie("모듬해산물","45000원",R.drawable.img));
            items.add(new Movie("광어+연어+단새우회","30000원",R.drawable.img));
            items.add(new Movie("우니+관자+단새우","35000원",R.drawable.img));
            items.add(new Movie("전복바지락술찜","28000원",R.drawable.img));

        }
        if(i == "ques"){
            items.add(new Movie("닭강정 컵","3000/4000원",R.drawable.img));
            items.add(new Movie("닭강정 1/3","7000원",R.drawable.img));
            items.add(new Movie("닭강정 2/3","11000원",R.drawable.img));
            items.add(new Movie("닭강정 1마리","14000원",R.drawable.img));
            items.add(new Movie("닭강정 1마리 반","18000원",R.drawable.img));
            items.add(new Movie("닭강정 2마리","22000원",R.drawable.img));

        }
        if(i == "uelock"){
            items.add(new Movie("고추튀김 3/6","8000원/15000원",R.drawable.img));
            items.add(new Movie("육전","19000원",R.drawable.img));
            items.add(new Movie("모듬전 11가지","19000원",R.drawable.img));
            items.add(new Movie("삼색전 (부추전/김치전/감자전)","12000원",R.drawable.img));
            items.add(new Movie("해물파전","15000원",R.drawable.img));
            items.add(new Movie("모듬+쫄면+고추튀김3개","32000원",R.drawable.img));
            items.add(new Movie("육전 + 부추쫄면 +고추튀김3개","32000원",R.drawable.img));
            items.add(new Movie("통새우전 + 부추쫄면 + 고추튀김3개","31000원",R.drawable.img));

        }
        if(i == "wangsung"){
            items.add(new Movie("갈치조림(2인)","18,000원",R.drawable.wangsung_fish));
            items.add(new Movie("자반구이","8,000원",R.drawable.wangsung_zaban));
            items.add(new Movie("조기구이","7,000원",R.drawable.wangsung_jogi));
            items.add(new Movie("김치찌개","6,000원",R.drawable.wangsung_kimchi));
            items.add(new Movie("라면김치찌개 ","7,000원",R.drawable.wangsung_ramen));
            items.add(new Movie("소세지찌개","7,000원",R.drawable.wangsung_sausage));
            items.add(new Movie("된장찌개","6,000원",R.drawable.wangsung_doenjang));
            items.add(new Movie("순두부찌개","6,000원",R.drawable.wangsung_ramen)); //tofu가 안 보임.

        }
        if(i == "wonjonudecheesekimbop"){
            items.add(new Movie("치즈참치김밥","2500원",R.drawable.img));
            items.add(new Movie("잡채김밥","3000원",R.drawable.img));
            items.add(new Movie("세트김밥","4000원",R.drawable.img));
            items.add(new Movie("부산어묵 1개","500원",R.drawable.img));

        }
        if(i == "wonjosunheenae"){
            items.add(new Movie("녹두 빈대떡","15000원",R.drawable.img));
            items.add(new Movie("고기완자 ","3000원",R.drawable.img));
            items.add(new Movie("새우 빈대떡","10000원",R.drawable.img));
            items.add(new Movie("고기 빈대떡","10000원",R.drawable.img));
            items.add(new Movie("반죽 포장 ","12000원",R.drawable.img));
            items.add(new Movie("녹두빈대떡 + 고기완자 +육회 세트","23000원",R.drawable.img));
            items.add(new Movie("녹두빈대떡2 + 고기완자 세트","13000원",R.drawable.img));

        }

    }


    @Override
    public int getCount() { //최초에 화면의 갯수를 설정함
        Log.d(TAG, "getCount: ");
        return items.size();
    }

    @Override
    public Object getItem(int position) { //아이템이 클릭될 때 아이템의 데이터를 도출
        Log.d(TAG, "getItem: "+position);
        return items.get(position);
    }

    @Override
    public long getItemId(int position) { //필수 아님
        Log.d(TAG, "getItemId: "+position);
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.d(TAG, "getView: "+position);
        //레이아웃 인플레이터로 인플레이터 객체 접근
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        //메모리에 아이템 하나 인플레이팅
        View itemView=inflater.inflate(R.layout.row_item,parent,false);

        //뷰 찾기
        TextView tv=itemView.findViewById(R.id.tv_title);
        ImageView imageView=itemView.findViewById(R.id.iv_img_resource);

        TextView tv1=itemView.findViewById(R.id.text_sulmom);

        //뷰 교체
        String title=((Movie)getItem(position)).getTitle();
        int imgResource=((Movie)getItem(position)).getImgResource();
        String sulmom = ((Movie)getItem(position)).getText_1();

        tv.setText(title);
        tv1.setText(sulmom);
        imageView.setImageResource(imgResource);

        return itemView;
    }


}