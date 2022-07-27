package com.example.instagramui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;


public class AccountFragment extends Fragment {


    RecyclerView places_highlights_rc;
    ArrayList<PlacesHighlights>placesHighlightsArrayList;
    TabLayout tab_layout;
    ViewPager2 view_pager;
    ViewPagerAdapter2 viewPagerAdapter2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_account, container, false);

        places_highlights_rc = view.findViewById(R.id.places_highlights_rc);
        placesHighlightsArrayList = new ArrayList<>();
        placesHighlightsArrayList.add(new PlacesHighlights("https://cdns-images.dzcdn.net/images/artist/022787f764f053c0aac3ccc3c75f0dc8/500x500.jpg","mombasa"));
        placesHighlightsArrayList.add(new PlacesHighlights("https://justnaijabase.com/wp-content/uploads/2021/01/Tatiana-Manaois.jpg","maldives"));
        placesHighlightsArrayList.add(new PlacesHighlights("https://buzzcentral.co.ke/wp-content/uploads/2022/03/Kabi-and-Milly-Wajesus-660x400.jpg","newyorkcity"));
        placesHighlightsArrayList.add(new PlacesHighlights("https://eu-west-1-classic105.s3.amazonaws.com/wp-content/uploads/2019/06/Kabi-Wa-Jesus-with-his-wife-Millie-1.jpg","wife"));

        PlacesHighlightsAdapter placesHighlightsAdapter = new PlacesHighlightsAdapter(getContext(),placesHighlightsArrayList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        places_highlights_rc.setLayoutManager(linearLayoutManager);
        places_highlights_rc.setAdapter(placesHighlightsAdapter);

        tab_layout = view.findViewById(R.id.tab_layout);
        tab_layout.addTab(tab_layout.newTab().setText("image posted"));
        tab_layout.addTab(tab_layout.newTab().setText("image tagged"));

        view_pager = view.findViewById(R.id.view_pager);
        viewPagerAdapter2 = new ViewPagerAdapter2(this);
        view_pager.setAdapter(viewPagerAdapter2);

        view_pager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tab_layout.selectTab(tab_layout.getTabAt(position));
                super.onPageSelected(position);
            }
        });


        tab_layout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                view_pager.setCurrentItem(tab_layout.getSelectedTabPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });




       return view;
    }
}