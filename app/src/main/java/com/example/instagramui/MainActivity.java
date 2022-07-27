package com.example.instagramui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottom_nav;
    ViewPager2 pager;
    private static final String TAG = "MAIN_ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Activity created");

        bottom_nav = findViewById(R.id.bottom_nav);
        pager = findViewById(R.id.pager);
        PagerAdapter pagerAdapter = new PagerAdapter(this);
        pager.setAdapter(pagerAdapter);

        pager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                switch (position){
                    case 0:
                        bottom_nav.setSelectedItemId(R.id.home);
                        break;
                        case 1:
                        bottom_nav.setSelectedItemId(R.id.search);
                        break;
                        case 2:
                        bottom_nav.setSelectedItemId(R.id.reels);
                        break;
                        case 3:
                        bottom_nav.setSelectedItemId(R.id.shop);
                        break;
                        case 4:
                        bottom_nav.setSelectedItemId(R.id.account);
                        break;

                }
            }
        });

        bottom_nav.setOnItemSelectedListener(item -> {

            switch (item.getItemId()) {

                case R.id.home:
                    pager.setCurrentItem(0);
                    break;
                case R.id.search:
                    pager.setCurrentItem(1);
                    break;
                case R.id.reels:
                    pager.setCurrentItem(2);
                    break;
                case R.id.shop:
                    pager.setCurrentItem(3);
                    break;
                case R.id.account:
                    pager.setCurrentItem(4);
                    break;
            }
            return true;
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Activity started");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Activity resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Activity paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Activity stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Activity destroyed");
    }
}