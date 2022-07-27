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

public class PlacesHighlightsAdapter extends RecyclerView.Adapter<PlacesHighlightsAdapter.PlacesHighlightsViewHolder> {

    Context context;
    ArrayList<PlacesHighlights>placesHighlightsArrayList;

    public PlacesHighlightsAdapter(Context context, ArrayList<PlacesHighlights> placesHighlightsArrayList) {
        this.context = context;
        this.placesHighlightsArrayList = placesHighlightsArrayList;
    }

    @NonNull
    @Override
    public PlacesHighlightsAdapter.PlacesHighlightsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.placeshighlightsview,parent,false);
        return new PlacesHighlightsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlacesHighlightsAdapter.PlacesHighlightsViewHolder holder, int position) {

        PlacesHighlights placesHighlights = placesHighlightsArrayList.get(position);
        holder.topic.setText(placesHighlights.getTopic());
        Glide.with(context).load(placesHighlights.Image_url).placeholder(R.drawable.test).into(holder.places_image_posted);
    }

    @Override
    public int getItemCount() {
        return placesHighlightsArrayList.size();
    }

    public class PlacesHighlightsViewHolder extends RecyclerView.ViewHolder{
        CircleImageView places_image_posted;
        TextView topic;
        public PlacesHighlightsViewHolder(@NonNull View itemView) {
            super(itemView);

            places_image_posted = itemView.findViewById(R.id.places_image_posted);
            topic = itemView.findViewById(R.id.topic);
        }
    }
}
