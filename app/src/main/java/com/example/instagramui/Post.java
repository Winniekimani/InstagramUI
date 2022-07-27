package com.example.instagramui;

import java.io.Serializable;

public class Post implements Serializable {
    String user_profile_url;
    String name;
    String topic;
    String user_image_posted;
    String Content_posted;
    String time_posted;
    String comment;

    public Post(String user_profile_url, String name, String topic, String user_image_posted, String content_posted, String time_posted, String comment) {
        this.user_profile_url = user_profile_url;
        this.name = name;
        this.topic = topic;
        this.user_image_posted = user_image_posted;
        Content_posted = content_posted;
        this.time_posted = time_posted;
        this.comment = comment;
    }

    public String getUser_profile_url() {
        return user_profile_url;
    }

    public void setUser_profile_url(String user_profile_url) {
        this.user_profile_url = user_profile_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getUser_image_posted() {
        return user_image_posted;
    }

    public void setUser_image_posted(String user_image_posted) {
        this.user_image_posted = user_image_posted;
    }

    public String getContent_posted() {
        return Content_posted;
    }

    public void setContent_posted(String content_posted) {
        Content_posted = content_posted;
    }

    public String getTime_posted() {
        return time_posted;
    }

    public void setTime_posted(String time_posted) {
        this.time_posted = time_posted;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
