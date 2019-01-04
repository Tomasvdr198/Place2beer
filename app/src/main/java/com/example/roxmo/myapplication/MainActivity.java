package com.example.roxmo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);




        WebView webb = (WebView)findViewById(R.id.web1);
        webb.setWebViewClient(new WebViewClient());
        webb.loadUrl("INSERT LINK HERE!!!!");
        webb.getSettings().setLoadWithOverviewMode(true);
        webb.getSettings().setUseWideViewPort(true);
        webb.getSettings().setDomStorageEnabled(true);
        webb.getSettings().setJavaScriptEnabled(true);



    }
}
