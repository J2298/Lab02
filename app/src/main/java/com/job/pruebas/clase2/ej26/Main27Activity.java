package com.job.pruebas.clase2.ej26;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;
import android.widget.Toast;

import com.job.pruebas.R;

public class Main27Activity extends AppCompatActivity {

    private CalendarView calendarView;
    private TextView dateDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main27);

        calendarView = (CalendarView) findViewById(R.id.calendarview);
        dateDisplay = (TextView) findViewById(R.id.date_display);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int i, int i1, int i2) {
                dateDisplay.setText("Date: " + i2 + " / " + (i1+1) + " / " + i);
                Toast.makeText(getApplicationContext(), "Selected Date:\n" + "Day = " + i2 + "\n" + "Month = " + (i1+1) + "\n" + "Year = " + i, Toast.LENGTH_LONG).show();
            }
        });
    }
}

