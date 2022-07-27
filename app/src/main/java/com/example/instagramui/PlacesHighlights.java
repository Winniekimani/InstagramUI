package com.example.instagramui;

public class PlacesHighlights {
    String Image_url;
    String topic;

    public PlacesHighlights(String image_url, String topic) {
        Image_url = image_url;
        this.topic = topic;
    }

    public String getImage_url() {
        return Image_url;
    }

    public void setImage_url(String image_url) {
        Image_url = image_url;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
