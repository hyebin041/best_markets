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

public class ReviewAdapter extends BaseAdapter {
    private static final String TAG = "ReviewAdapter";

    private List<Review> items=new ArrayList<>();

    public ReviewAdapter() {
//        items.add(new Review("짜장면",5,"12.24",R.drawable.img,"사랑해요 짜장면"));
//        items.add(new Review("짜장면",5,"12.24",R.drawable.img,"사랑해요 짜장면"));
//        items.add(new Review("짜장면",5,"12.24",R.drawable.img,"사랑해요 짜장면"));
//        items.add(new Review("짜장면",5,"12.24",R.drawable.img,"사랑해요 짜장면"));
//        items.add(new Review("짜장면",5,"12.24",R.drawable.img,"사랑해요 짜장면"));
        items.add(new Review("짜장면조아","12.24",R.drawable.img,"사랑해요 짜장면"));
        items.add(new Review("짬뽕사랑","12.24",R.drawable.img,"사랑해요 짜장면"));
        items.add(new Review("사랑해여","12.24",R.drawable.img,"사랑해요 짜장면"));
        items.add(new Review("삼시육끼","12.24",R.drawable.img,"사랑해요 짜장면"));
        items.add(new Review("미슐랭입맛","12.24",R.drawable.img,"사랑해요 짜장면"));
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
        View itemView=inflater.inflate(R.layout.shoplist_review_item,parent,false);

        //뷰 찾기
//        TextView tv = itemView.findViewById(R.id.review_id);
//        //RatingBar rb = itemView.findViewById(R.id.review_rating);
//        TextView tv1 = itemView.findViewById(R.id.review_day);
//        ImageView imageView = itemView.findViewById(R.id.review_image);
//        TextView tv2 = itemView.findViewById(R.id.review_text);
        TextView tv = itemView.findViewById(R.id.review_id);
        //RatingBar rb = itemView.findViewById(R.id.review_rating);
        TextView tv1 = itemView.findViewById(R.id.review_day);
        ImageView imageView = itemView.findViewById(R.id.review_image);
        TextView tv2 = itemView.findViewById(R.id.review_text);

        //뷰 교체
        String review_id = ((Review)getItem(position)).getId();
        //RatingBar review_rating = ((Review)getItem(position)).getRating();
        String review_day = ((Review)getItem(position)).getDay();
        int review_img = ((Review)getItem(position)).getImg();
        String review_text = ((Review)getItem(position)).getText();

        tv.setText(review_id);
        tv1.setText(review_day);

        imageView.setImageResource(review_img);

        tv2.setText(review_text);

        //rb.setNumStars(review_rating);
        //rb.setRating(review_rating);


        return itemView;
    }
}
