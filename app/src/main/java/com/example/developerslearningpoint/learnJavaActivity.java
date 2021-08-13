package com.example.developerslearningpoint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class learnJavaActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_java);

        webView=findViewById(R.id.webView);


        int position=getIntent().getIntExtra("key",0);

        if (position==0){

            webView.loadUrl("file:///android_asset/whatisjava.html");
        }
        else if (position==1){

            webView.loadUrl("file:///android_asset/feauresofjava.html");
        }
        else if (position==0){

            webView.loadUrl("file:///android_asset/c++vsjava.html");
        }

    }
}