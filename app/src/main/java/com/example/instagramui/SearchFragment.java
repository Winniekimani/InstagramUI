package com.example.instagramui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class SearchFragment extends Fragment {

    RecyclerView search_rc;
    ArrayList<Search>searchArrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search, container, false);


         search_rc = view.findViewById(R.id.search_rc);
         searchArrayList = new ArrayList<>();
         searchArrayList.add(new Search("https://cdns-images.dzcdn.net/images/artist/022787f764f053c0aac3ccc3c75f0dc8/500x500.jpg"));
         searchArrayList.add(new Search("https://eu-west-1-classic105.s3.amazonaws.com/wp-content/uploads/2019/06/Kabi-Wa-Jesus-with-his-wife-Millie-1.jpg"));
         searchArrayList.add(new Search("https://buzzcentral.co.ke/wp-content/uploads/2022/03/Kabi-and-Milly-Wajesus-660x400.jpg"));
         searchArrayList.add(new Search("https://justnaijabase.com/wp-content/uploads/2021/01/Tatiana-Manaois.jpg"));
         searchArrayList.add(new Search("https://upload.wikimedia.org/wikipedia/commons/d/df/Khalid-MTV_smiling.jpg"));
         searchArrayList.add(new Search("https://www.capitalfm.co.ke/thesauce/files/2019/08/Huddah-Monroe.jpg"));
         searchArrayList.add(new Search("https://image.shutterstock.com/image-photo/los-angeles-ca-december-15-260nw-664361332.jpg"));


         SearchAdapter searchAdapter = new SearchAdapter(getContext(),searchArrayList);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);

        search_rc.setAdapter(searchAdapter);
        search_rc.setLayoutManager(staggeredGridLayoutManager);
        return view;
    }
}