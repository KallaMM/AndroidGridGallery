package com.example.androidgridgallery;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import java.util.Set;

public class Gallery extends FragmentActivity {

    ViewPager myView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_pager_layout);

        Intent prev=getIntent();

        myView=findViewById(R.id.vp);

        int setter=prev.getIntExtra("photo",1);
        SwipeAdapter myAdapter = new SwipeAdapter(getSupportFragmentManager());
        myView.setAdapter(myAdapter);
        myView.setCurrentItem(setter-1);
    }
}