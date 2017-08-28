package com.job.pruebas.clase2.ej10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.job.pruebas.R;

public class Main11Activity extends AppCompatActivity {

    private RatingBar ratingBar;
    private TextView rateDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        rateDisplay = (TextView) findViewById(R.id.ratingDisplay);
        rateDisplay.setText("Rate:");

    }

    public void rateSubmit(View view) {
        String ratingValue = String.valueOf(ratingBar.getRating());
        rateDisplay.setText("Rate: " + ratingValue);
        Toast.makeText(getApplicationContext(), "Rate: " + ratingValue, Toast.LENGTH_LONG).show();
    }
}

