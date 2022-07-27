package com.example.instagramui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ReelsAdapter extends RecyclerView.Adapter<ReelsAdapter.ReelsViewHolder> {
    Context context;
    ArrayList<Reels>reelsArrayList;

    public ReelsAdapter(Context context, ArrayList<Reels> reelsArrayList) {
        this.context = context;
        this.reelsArrayList = reelsArrayList;
    }

    @NonNull
    @Override
    public ReelsAdapter.ReelsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.reelsview,parent,false);
        return new ReelsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReelsAdapter.ReelsViewHolder holder, int position) {
        Reels reels = reelsArrayList.get(position);
        holder.no_of_likes.setText(reels.getNo_Of_likes());
        holder.no_of_reels_messages.setText(reels.getNo_of_reels_messages());
        holder.name_of_the_reel.setText(reels.getName());
        Glide.with(context).load(reels.image_url).placeholder(R.drawable.test).into(holder.reels_frag_image);
        Glide.with(context).load(reels.image_profile_url).placeholder(R.drawable.test).into(holder.reels_circle_imageview);
    }

    @Override
    public int getItemCount() {
        return reelsArrayList.size();
    }

    public static class ReelsViewHolder extends RecyclerView.ViewHolder{

        ImageView reels_frag_image;
        TextView no_of_likes;
        TextView no_of_reels_messages;
        CircleImageView reels_circle_imageview;
        TextView name_of_the_reel;

        public ReelsViewHolder(@NonNull View itemView) {
            super(itemView);
            reels_frag_image = itemView.findViewById(R.id.reels_frag_image);
            no_of_likes = itemView.findViewById(R.id.no_of_likes);
            no_of_reels_messages = itemView.findViewById(R.id.no_of_reels_messages);
            reels_circle_imageview = itemView.findViewById(R.id.reels_circle_imageview);
            name_of_the_reel = itemView.findViewById(R.id.name_of_the_reel);

        }
    }
}
