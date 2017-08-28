package com.job.pruebas.clase2.ej20;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.job.pruebas.R;

public class Main21Activity extends AppCompatActivity {
    private CoordinatorLayout rootLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);

        rootLayout = (CoordinatorLayout) findViewById(R.id.coordinatorLayout);
    }

    public void showSnackbar(View view){
        Snackbar snackbar = Snackbar.make(rootLayout, "Hello, I am Android Snackbar!", Snackbar.LENGTH_LONG);// Snackbar message
        snackbar.setAction("Undo", new View.OnClickListener() {  //Snackbar action text
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Undo proccess!", Toast.LENGTH_SHORT).show();
            }
        });
        snackbar.show();
    }

}
