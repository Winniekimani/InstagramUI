package com.example.instagramui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ImagePostedAdapter extends RecyclerView.Adapter<ImagePostedAdapter.ImagesStoredViewHolder> {
    Context context;
    ArrayList<ImagePosted> imagePostedArrayList;

    public ImagePostedAdapter(Context context, ArrayList<ImagePosted> imagePostedArrayList) {
        this.context = context;
        this.imagePostedArrayList = imagePostedArrayList;
    }

    @NonNull
    @Override
    public ImagePostedAdapter.ImagesStoredViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.imagesstoredview,parent,false);
        return new ImagesStoredViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImagePostedAdapter.ImagesStoredViewHolder holder, int position) {

        ImagePosted imagePosted = imagePostedArrayList.get(position);
        Glide.with(context).load(imagePosted.Image_url).placeholder(R.drawable.test).into(holder.images_stored);
    }

    @Override
    public int getItemCount() {
        return imagePostedArrayList.size();
    }

    public static class ImagesStoredViewHolder  extends RecyclerView.ViewHolder{
        ImageView images_stored;
        public ImagesStoredViewHolder(@NonNull View itemView) {
            super(itemView);
            images_stored = itemView.findViewById(R.id.images_stored);
        }
    }
}
