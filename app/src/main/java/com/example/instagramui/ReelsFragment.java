package com.example.instagramui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class ReelsFragment extends Fragment {
    ViewPager2 reels_vp;
    ArrayList<Reels>reelsArrayList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_reels, container, false);

        reels_vp = view.findViewById(R.id.reels_vp);
        reelsArrayList = new ArrayList<>();

        reelsArrayList.add(new Reels("http://www.spyghana.com/wp-content/uploads/2014/06/wpid-Huddah-Monroe.jpg",
                "60.9k","478","http://www.spyghana.com/wp-content/uploads/2014/06/wpid-Huddah-Monroe.jpg",
                "huddah_monroewsedrftgyb"));
        reelsArrayList.add(new Reels("https://litkenya.com/wp-content/uploads/2020/09/we_cant_get_enoug5e60ecce9503d.jpg",
                "50k","600","https://citizentv.s3.amazonaws.com/9919/conversions/WaJesus-family-og_image.jpg",
                "wajesus family"));
        reelsArrayList.add(new Reels("http://www.spyghana.com/wp-content/uploads/2014/06/wpid-Huddah-Monroe.jpg",
                "20k","270","http://www.spyghana.com/wp-content/uploads/2014/06/wpid-Huddah-Monroe.jpg",
                "jacky_matubia"));
        reelsArrayList.add(new Reels("http://www.spyghana.com/wp-content/uploads/2014/06/wpid-Huddah-Monroe.jpg",
                "120k","980","http://www.spyghana.com/wp-content/uploads/2014/06/wpid-Huddah-Monroe.jpg",
                "vera_sidika"));
        reelsArrayList.add(new Reels("http://www.spyghana.com/wp-content/uploads/2014/06/wpid-Huddah-Monroe.jpg",
                "589.6k","1020","http://www.spyghana.com/wp-content/uploads/2014/06/wpid-Huddah-Monroe.jpg",
                "rihanna"));



        ReelsAdapter reelsAdapter = new ReelsAdapter(getContext(),reelsArrayList);
        reels_vp.setAdapter(reelsAdapter);

        return view;

    }
}