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