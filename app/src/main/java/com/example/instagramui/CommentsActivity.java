package com.example.instagramui;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import de.hdodenhof.circleimageview.CircleImageView;

public class CommentsActivity extends AppCompatActivity {

    private Post post;
    private TextView name, post_desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);

        findViewById(R.id.arrow_icon).setOnClickListener(view -> super.onBackPressed());
        name = findViewById(R.id.name);
        post_desc = findViewById(R.id.post_desc);
        post = (Post) getIntent().getExtras().getSerializable("post");


      CircleImageView profile_image = findViewById(R.id.profile_image);
      Glide.with(this).load(post.getUser_profile_url()).into(profile_image);
      name.setText(post.getName());

        post_desc.setText(post.getContent_posted());




    }
}