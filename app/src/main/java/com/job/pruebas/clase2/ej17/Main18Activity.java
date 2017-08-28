package com.job.pruebas.clase2.ej17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.job.pruebas.R;

public class Main18Activity extends AppCompatActivity {

    private TextView textView;
    private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);

        textView = (TextView) findViewById(R.id.count);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        // seekBar.setProgress(2);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView.setText("Progress: " + progress + " / " + seekBar.getMax());
                Toast.makeText(getApplicationContext(),"SeekBar Progress Change",Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"SeekBar Touch Started",Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "SeekBar Touch Stop ", Toast.LENGTH_SHORT).show();
            }

        });
    }
}

