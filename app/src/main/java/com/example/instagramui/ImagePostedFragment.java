package com.example.instagramui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class ImagePostedFragment extends Fragment {
    RecyclerView image_posted_rc;
    ArrayList<ImagePosted>imagePostedArrayList;

    public ImagePostedFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_image_posted, container, false);

        image_posted_rc = view.findViewById(R.id.image_posted_rc);
        imagePostedArrayList = new ArrayList<>();

        imagePostedArrayList.add(new ImagePosted("https://eu-west-1-classic105.s3.amazonaws.com/wp-content/uploads/2019/06/Kabi-Wa-Jesus-with-his-wife-Millie-1.jpg"));
        imagePostedArrayList.add(new ImagePosted("https://image.shutterstock.com/image-photo/los-angeles-dec-11-ryan-260nw-544581334.jpg"));
        imagePostedArrayList.add(new ImagePosted("https://image.shutterstock.com/image-photo/los-angeles-ca-december-15-260nw-664361332.jpg"));
        imagePostedArrayList.add(new ImagePosted("https://lastfm.freetls.fastly.net/i/u/770x0/69bfe3c61773c5f29daf07ef699af70d.jpg"));

        ImagePostedAdapter imagePostedAdapter = new ImagePostedAdapter(getActivity(),imagePostedArrayList);
        int numberOfColumns = 3;
        image_posted_rc.setLayoutManager(new GridLayoutManager(getActivity(), numberOfColumns));
        image_posted_rc.setAdapter(imagePostedAdapter);
        return view;
    }
}