package com.example.androidgridgallery;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class SwipeAdapter extends FragmentStatePagerAdapter {

    public SwipeAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment myFragment= new PhotoFragment();
        Bundle myBundle= new Bundle();
        myBundle.putInt("pos",position+1);
        myFragment.setArguments(myBundle);
        return myFragment;
    }

    @Override
    public int getCount() {
        return 10;
    }
}
