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
}