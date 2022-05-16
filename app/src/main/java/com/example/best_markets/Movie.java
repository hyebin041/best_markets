package com.example.best_markets;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Movie {
    private String title;
    private String text_1;
    private int imgResource;

    public Movie() {
    }

    public Movie(String title, String text_1, int imgResource) {
        this.title = title;
        this.text_1 = text_1;
        this.imgResource = imgResource;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText_1() {
        return text_1;
    }

    public void setText_1(String text_1) {
        this.text_1 = text_1;
    }

    public int getImgResource() {
        return imgResource;
    }

    public void setImgResource(int imgResource) {
        this.imgResource = imgResource;
    }
}