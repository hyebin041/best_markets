package com.example.best_markets;

import android.widget.RatingBar;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Review {
    private String title_id;
    private RatingBar rt;
    private String month_day;
    private int imgResource;
    private String text;

    public Review(String 짜장면, int i, String month_day, int img, String 사랑해요_짜장면) {
    }
}