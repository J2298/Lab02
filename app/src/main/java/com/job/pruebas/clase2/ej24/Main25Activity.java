package com.job.pruebas.clase2.ej24;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.job.pruebas.R;

public class Main25Activity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main25);

        webView = (WebView)findViewById(R.id.webview);
        webView.loadUrl("https://material.io/");
    }
}

