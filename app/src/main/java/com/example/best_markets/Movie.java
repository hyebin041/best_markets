package com.example.best_markets;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder

public class Movie {
    private String title;
    private String text_1;
    private int imgResource;

    public Movie(String s1, String s2, int img) {
        title = s1;
        text_1 = s2;
        imgResource = img;
    }

    public String getTitle() {
        return title;
    }

    public String getText_1() {
        return text_1;
    }

    public int getImgResource() {
        return imgResource;
    }
}