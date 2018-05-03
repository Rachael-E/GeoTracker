package com.example.rachael.geo_tracker.Activities;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.rachael.geo_tracker.R;

public class GeologyMapActivity extends AppCompatActivity {

    private WebView bgsWebView;
    ActionBar actionBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geology_map);

        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#838c6b")));

        bgsWebView = findViewById(R.id.geologyWebViewID);
        WebSettings webSettings = bgsWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        bgsWebView.loadUrl("http://www.largeimages.bgs.ac.uk/iip/mapsportal.html?id=1004374");

    }
}
