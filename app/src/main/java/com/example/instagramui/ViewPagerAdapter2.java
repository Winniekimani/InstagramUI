package com.example.instagramui;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter2 extends FragmentStateAdapter{
    public ViewPagerAdapter2(@NonNull AccountFragment fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
            return new ImagePostedFragment();
            case 1:
                return  new ImageTaggedFragment();
        }

        return new ImagePostedFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
