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
    //private RatingBar rating;
    private String day;
    private int img;
    private String text;

}