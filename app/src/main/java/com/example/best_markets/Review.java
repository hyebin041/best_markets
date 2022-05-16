package com.example.best_markets;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Review {
    private String id;
    private int rating;
    private String day;
    private int img;
    private String text;

    public Review(String s, int i, String s1, int img, String s2) {
        id = s; rating=i; day=s1; img=img; text=s2;
    }

    public String getId() {
        return id;
    }

    public int getRating() {
        return rating;
    }

    public String getDay() {
        return day;
    }

    public int getImg() {
        return img;
    }

    public String getText() {
        return text;
    }
}