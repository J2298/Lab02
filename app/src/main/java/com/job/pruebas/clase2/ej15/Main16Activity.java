package com.job.pruebas.clase2.ej15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.job.pruebas.R;

public class Main16Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);
    }

    public void action(View view){
        Toast.makeText(this, "FAB Action!", Toast.LENGTH_SHORT).show();
    }
}

