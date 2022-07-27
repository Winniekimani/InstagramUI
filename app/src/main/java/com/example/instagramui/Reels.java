package com.example.instagramui;

public class Reels {
    String image_url;
    String no_Of_likes;
    String no_of_reels_messages;
    String image_profile_url;
    String name;

    public Reels(String image_url, String no_Of_likes, String no_of_reels_messages, String image_profile_url, String name) {
        this.image_url = image_url;
        this.no_Of_likes = no_Of_likes;
        this.no_of_reels_messages = no_of_reels_messages;
        this.image_profile_url = image_profile_url;
        this.name = name;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getNo_Of_likes() {
        return no_Of_likes;
    }

    public void setNo_Of_likes(String no_Of_likes) {
        this.no_Of_likes = no_Of_likes;
    }

    public String getNo_of_reels_messages() {
        return no_of_reels_messages;
    }

    public void setNo_of_reels_messages(String no_of_reels_messages) {
        this.no_of_reels_messages = no_of_reels_messages;
    }

    public String getImage_profile_url() {
        return image_profile_url;
    }

    public void setImage_profile_url(String image_profile_url) {
        this.image_profile_url = image_profile_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
