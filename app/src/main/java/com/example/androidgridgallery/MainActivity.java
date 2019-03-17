package com.example.androidgridgallery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridView = (GridView) findViewById(R.id.gridview);
        final PhotoAdapter photoAdapter = new PhotoAdapter(this, photos);
        gridView.setAdapter(photoAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent myIntent= new Intent(MainActivity.this, Gallery.class);
            myIntent.putExtra("photo", 1);
            startActivity(myIntent);
            }
        });
    }

    private Photo[] photos = {
            new Photo(R.string.photo1, R.mipmap.ph1, 1),
            new Photo(R.string.photo2, R.mipmap.ph2, 2),
            new Photo(R.string.photo3, R.mipmap.ph3, 3),
            new Photo(R.string.photo4, R.mipmap.ph4, 4),
            new Photo(R.string.photo5, R.mipmap.ph5, 5),
            new Photo(R.string.photo6, R.mipmap.ph6, 6),
            new Photo(R.string.photo7, R.mipmap.ph7, 7),
            new Photo(R.string.photo8, R.mipmap.ph8, 8),
            new Photo(R.string.photo9, R.mipmap.ph9, 9),
            new Photo(R.string.photo10, R.mipmap.ph10, 10)
    };
}
