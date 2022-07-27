package com.example.instagramui;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.SearchViewHolder> {
    Context context;
    ArrayList<Search>searchArrayList;

    public SearchAdapter(Context context, ArrayList<Search> searchArrayList) {
        this.context = context;
        this.searchArrayList = searchArrayList;
    }

    @NonNull
    @Override
    public SearchAdapter.SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.searchview,parent,false);
        return new SearchViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchAdapter.SearchViewHolder holder, int position) {

        Search search = searchArrayList.get(position);
        Glide.with(context).load(search.image_url)
                .optionalCenterCrop().placeholder(R.drawable.test).into(holder.image_posted_on_search);
    }

    @Override
    public int getItemCount() {
        return searchArrayList.size();
    }

    public class SearchViewHolder extends RecyclerView.ViewHolder{
        ImageView image_posted_on_search;
        public SearchViewHolder(@NonNull View itemView) {
            super(itemView);
            image_posted_on_search = itemView.findViewById(R.id.image_posted_on_search);
        }
    }
}
