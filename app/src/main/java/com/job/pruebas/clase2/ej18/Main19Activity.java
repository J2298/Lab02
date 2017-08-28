package com.job.pruebas.clase2.ej18;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.job.pruebas.R;

public class Main19Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);
    }

    public void showDialog(View view){

        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Alert Dialog Title");
        alertDialog.setMessage("Here is android alert dialog message");
        // Alert dialog button
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Alert dialog action goes here
                        dialog.dismiss();// use dismiss to cancel alert dialog
                    }
                });
        alertDialog.show();

    }

}

