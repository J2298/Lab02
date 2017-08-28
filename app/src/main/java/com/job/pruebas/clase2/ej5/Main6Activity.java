package com.job.pruebas.clase2.ej5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.job.pruebas.R;

public class Main6Activity extends AppCompatActivity {


    private EditText firstName, lastName;
    private TextView displayname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        firstName = (EditText) findViewById(R.id.firstName);
        lastName = (EditText) findViewById(R.id.lastName);
        displayname = (TextView) findViewById(R.id.displayName);
    }

    public void register(View view) {
        String getFirstName = firstName.getText().toString();
        String getLastName = lastName.getText().toString();
        if(getFirstName.length() == 0 || getLastName.length() == 0)
            displayname.setText("These fields are required");
        else
            displayname.setText("Your username is " + getFirstName + " " + getLastName);
    }
}

