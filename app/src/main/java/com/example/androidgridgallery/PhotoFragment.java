package com.example.androidgridgallery;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class PhotoFragment extends Fragment {

    ImageView myView;

    public PhotoFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                        Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.photo_layout, container, false);
        myView= view.findViewById(R.id.photo);
        Bundle bundle= getArguments();
        int setter=bundle.getInt("pos");

        switch(setter){

            case 1:
                myView.setImageResource(R.mipmap.ph1);
                break;

            case 2:
                myView.setImageResource(R.mipmap.ph2);
                break;

            case 3:
                myView.setImageResource(R.mipmap.ph3);
                break;

            case 4:
                myView.setImageResource(R.mipmap.ph4);
                break;

            case 5:
                myView.setImageResource(R.mipmap.ph5);
                break;

            case 6:
                myView.setImageResource(R.mipmap.ph6);
                break;

            case 7:
                myView.setImageResource(R.mipmap.ph7);
                break;

            case 8:
                myView.setImageResource(R.mipmap.ph8);
                break;

            case 9:
                myView.setImageResource(R.mipmap.ph9);
                break;

            case 10:
                myView.setImageResource(R.mipmap.ph10);
                break;
        }

        return view;
    }


}
