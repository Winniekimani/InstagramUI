package com.example.instagramui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ImagePostAdapter extends RecyclerView.Adapter<ImagePostAdapter.ImagePostViewHolder> {

    Context context;
    ArrayList<ImagePost>imagePostArrayList;

    public ImagePostAdapter(Context context, ArrayList<ImagePost> imagePostArrayList) {
        this.context = context;
        this.imagePostArrayList = imagePostArrayList;
    }

    @NonNull
    @Override
    public ImagePostAdapter.ImagePostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.imagepostview,parent,false);
        return new ImagePostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImagePostAdapter.ImagePostViewHolder holder, int position) {

        ImagePost  imagePost= imagePostArrayList.get(position);
        holder.poster_name.setText(imagePost.getName());
        Glide.with(context).load(imagePost.image_url).placeholder(R.drawable.test).into(holder.image_posted);
    }

    @Override
    public int getItemCount() {
        return imagePostArrayList.size();
    }

    public class ImagePostViewHolder extends RecyclerView.ViewHolder {
        CircleImageView image_posted;
        TextView poster_name;
        public ImagePostViewHolder(@NonNull View itemView) {
            super(itemView);
            image_posted = itemView.findViewById(R.id.image_posted);
            poster_name = itemView.findViewById(R.id.poster_name);
        }
    }
}
