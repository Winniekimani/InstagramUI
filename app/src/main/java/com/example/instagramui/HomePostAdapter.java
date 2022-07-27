package com.example.instagramui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class HomePostAdapter extends RecyclerView.Adapter<HomePostAdapter.PostViewHolder> {

    Context context;
    ArrayList<Post> postArrayList;

    public HomePostAdapter(Context context, ArrayList<Post> postArrayList) {
        this.context = context;
        this.postArrayList = postArrayList;
    }


    @NonNull
    @Override
    public HomePostAdapter.PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.postview, parent, false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomePostAdapter.PostViewHolder holder, int position) {

        Post post = postArrayList.get(position);
        holder.user_name.setText(post.getName());
        holder.user_topic.setText(post.getTopic());
        holder.poster_name_appearance.setText(post.getName());
        holder.content_posted.setText(post.getContent_posted());
        holder.view_comments.setText(post.getComment());
        holder.time_posted.setText(post.getTime_posted());
        Glide.with(context).load(post.user_profile_url).placeholder(R.drawable.test).into(holder.user_profile);
        Glide.with(context).load(post.user_image_posted).placeholder(R.drawable.test).into(holder.image_posted_2);

        holder.message_icon.setOnClickListener(view -> {

         Intent intent = new Intent(context,CommentsActivity.class);
         Bundle bundle = new Bundle();

         bundle.putSerializable("post",post);
         intent.putExtras(bundle );
         context.startActivity(intent);
        });



        holder.like_icon.setOnClickListener(view -> {

            if (!holder.isLiked){
                holder.like_icon.setImageResource(R.drawable.heart_red);
                holder.isLiked = true;
            }else {
                holder.like_icon.setImageResource(R.drawable.heart_customized_icon);
                holder.isLiked = false;
            };


        });
    }

    @Override
    public int getItemCount() {
        return postArrayList.size();
    }

    public static class PostViewHolder extends RecyclerView.ViewHolder {
        CircleImageView user_profile;
        TextView user_name;
        TextView user_topic;
        ImageView image_posted_2,message_icon,like_icon;
        TextView poster_name_appearance;
        TextView content_posted;
        boolean isLiked = false;
        TextView view_comments;
        TextView time_posted;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            user_profile = itemView.findViewById(R.id.user_profile);
            user_name = itemView.findViewById(R.id.user_name);
            user_topic = itemView.findViewById(R.id.user_topic);
            image_posted_2 = itemView.findViewById(R.id.image_posted_2);
            poster_name_appearance = itemView.findViewById(R.id.poster_name_appearance);
            content_posted = itemView.findViewById(R.id.content_posted);
            view_comments = itemView.findViewById(R.id.view_comments);
            time_posted = itemView.findViewById(R.id.time_posted);
            message_icon = itemView.findViewById(R.id.message_icon);
            like_icon = itemView.findViewById(R.id.like_icon);

        }

    }
}
