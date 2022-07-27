package com.example.instagramui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    RecyclerView post_images_rc;
    RecyclerView post_rc;
    ArrayList<Post>postArrayList;
    ArrayList<ImagePost> imagePostArrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);


        //recyclerview1
        post_images_rc = view.findViewById(R.id.post_images_rc);


        imagePostArrayList = new ArrayList<>();
        imagePostArrayList.add(new ImagePost("https://cdns-images.dzcdn.net/images/artist/022787f764f053c0aac3ccc3c75f0dc8/500x500.jpg", "Tatiana manois"));
        imagePostArrayList.add(new ImagePost("https://eu-west-1-classic105.s3.amazonaws.com/wp-content/uploads/2019/06/Kabi-Wa-Jesus-with-his-wife-Millie-1.jpg", "kabi wajesus"));
        imagePostArrayList.add(new ImagePost("https://buzzcentral.co.ke/wp-content/uploads/2022/03/Kabi-and-Milly-Wajesus-660x400.jpg", "Milly wajesus"));
        imagePostArrayList.add(new ImagePost("https://justnaijabase.com/wp-content/uploads/2021/01/Tatiana-Manaois.jpg", "zari"));

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        ImagePostAdapter imagePostAdapter = new ImagePostAdapter(getActivity(), imagePostArrayList);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        post_images_rc.setLayoutManager(layoutManager);
        post_images_rc.setAdapter(imagePostAdapter);

        //recyclerview2
        post_rc = view.findViewById(R.id.post_rc);
        postArrayList  = new ArrayList<>();
        postArrayList.add(new Post("https://lastfm.freetls.fastly.net/i/u/770x0/d2e1186ab664403321ff20281e87d617.jpg","winniekim","students sponsored",
                "https://image.shutterstock.com/image-photo/young-volunteers-children-box-donations-260nw-707940325.jpg","the following students were sponsored by " ,
                "2 hours ago","wow,beautiful"));
        postArrayList.add(new Post("https://upload.wikimedia.org/wikipedia/commons/d/df/Khalid-MTV_smiling.jpg","brian_gee","jobs",
                "https://image.shutterstock.com/image-vector/job-vacancy-templates-we-hire-260nw-1887913108.jpg","interested people to apply the above jobs " ,
                "now","requirements?"));
        postArrayList.add(new Post("https://www.capitalfm.co.ke/thesauce/files/2019/08/Huddah-Monroe.jpg","jackline","vacay",
                "https://www.thecityceleb.com/wp-content/uploads/2021/05/Vera-Sidika-Biography-Age-Net-Worth-Real-Name-Child-House-Instagram-Wikipedia-Boyfriend-Husband-Height.jpg","kenya my motherland",
                "3 days ago","beautiful scenery"));
        postArrayList.add(new Post("https://image.shutterstock.com/image-photo/los-angeles-dec-11-ryan-260nw-544581334.jpg","vincent_khimani","hell's gate Nakuru",
                "https://image.shutterstock.com/image-photo/los-angeles-ca-december-15-260nw-664361332.jpg","weekend was fun ",
                "3:56pm","next time tag us along"));
        postArrayList.add(new Post("https://lastfm.freetls.fastly.net/i/u/770x0/69bfe3c61773c5f29daf07ef699af70d.jpg","njeri","baraka medical hospital",
                "https://www.premierhospital.org/wp-content/uploads/2020/12/Antenatal-Profile-Package.jpg","attached find our delivery package with discounts ",
                "48 mins ago","is this discount for all people or kenyans only? "));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        HomePostAdapter homePostAdapter = new HomePostAdapter(getContext(),postArrayList);
        post_rc.setLayoutManager(linearLayoutManager);
        post_rc.setAdapter(homePostAdapter);


        return view;

    }
}