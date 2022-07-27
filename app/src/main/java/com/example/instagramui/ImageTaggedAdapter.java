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

public class ImageTaggedAdapter extends RecyclerView.Adapter<ImageTaggedAdapter.ImageTaggedViewHolder> {
    Context context;
    ArrayList<ImageTagged>imageTaggedArrayList;

    public ImageTaggedAdapter(Context context, ArrayList<ImageTagged> imageTaggedArrayList) {
        this.context = context;
        this.imageTaggedArrayList = imageTaggedArrayList;
    }

    @NonNull
    @Override
    public ImageTaggedAdapter.ImageTaggedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.imagetaggedview,parent,false);
        return new ImageTaggedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageTaggedAdapter.ImageTaggedViewHolder holder, int position) {

        ImageTagged imageTagged = imageTaggedArrayList.get(position);
        Glide.with(context).load(imageTagged.image_url).placeholder(R.drawable.test).into(holder.image_tagged);
    }

    @Override
    public int getItemCount() {
        return imageTaggedArrayList.size();
    }

    public class ImageTaggedViewHolder extends RecyclerView.ViewHolder {
        ImageView image_tagged;
        public ImageTaggedViewHolder(@NonNull View itemView) {
            super(itemView);
             image_tagged = itemView.findViewById(R.id.image_tagged);
        }
    }
}
