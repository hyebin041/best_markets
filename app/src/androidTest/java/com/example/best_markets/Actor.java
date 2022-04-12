package com.example.best_markets;

public class Actor {
    private String name;
    private String summary;
    private String thumb_url;

    public Actor(String name, String thumb_url, String summary) {
        this.name = name;
        this.summary = summary;
        this.thumb_url = thumb_url;
    }

    public String getName() {
        return name;
    }

    public String getSummary() {
        return summary;
    }

    public String getThumb_url() {
        return thumb_url;
    }
}