package com.example.instagramui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ImageTaggedFragment extends Fragment {
    RecyclerView image_tagged_rc;
    ArrayList<ImageTagged>imageTaggedArrayList;

    public ImageTaggedFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_image_tagged, container, false);

        image_tagged_rc = view.findViewById(R.id.image_tagged_rc);
        imageTaggedArrayList = new ArrayList<>();

        imageTaggedArrayList.add(new ImageTagged("https://image.shutterstock.com/image-photo/los-angeles-dec-11-ryan-260nw-544581334.jpg"));
        imageTaggedArrayList.add(new ImageTagged("https://image.shutterstock.com/image-photo/los-angeles-ca-december-15-260nw-664361332.jpg"));
        imageTaggedArrayList.add(new ImageTagged("https://lastfm.freetls.fastly.net/i/u/770x0/69bfe3c61773c5f29daf07ef699af70d.jpg"));

        ImageTaggedAdapter imageTaggedAdapter = new ImageTaggedAdapter(getActivity(),imageTaggedArrayList);
        int numberOfColumns = 3;
        image_tagged_rc.setLayoutManager(new GridLayoutManager(getActivity(), numberOfColumns));
        image_tagged_rc.setAdapter(imageTaggedAdapter);

        return view;
    }
}