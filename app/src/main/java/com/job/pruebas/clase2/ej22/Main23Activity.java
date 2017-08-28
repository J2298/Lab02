package com.job.pruebas.clase2.ej22;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.job.pruebas.R;

public class Main23Activity extends AppCompatActivity {
    private int[] photos = {
            R.drawable.img_pikachu,
            R.drawable.img_kirby,
            R.drawable.img_hamtaro,
    };
    private int index = 0;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);

        imageView = (ImageView)findViewById(R.id.imageview);
    }

    public void nextImage(View view) {
        if(++index > photos.length-1)
            index = 0;
        imageView.setImageResource(photos[index]);
    }
    public void previousImage(View view) {
        if(--index < 0)
            index = photos.length-1;
        imageView.setImageResource(photos[index]);
    }

}

