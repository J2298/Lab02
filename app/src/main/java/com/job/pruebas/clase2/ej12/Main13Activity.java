package com.job.pruebas.clase2.ej12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.job.pruebas.R;

public class Main13Activity extends AppCompatActivity {

    private EditText numbertext;
    private ProgressBar progressbar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        numbertext = (EditText) findViewById(R.id.numberText);
        progressbar1 = (ProgressBar) findViewById(R.id.progressbar1);
        progressbar1.setProgress(30);

    }

    public void show(View view){
        int value = Integer.parseInt(numbertext.getText().toString());
        progressbar1.setProgress(value);
    }

}

