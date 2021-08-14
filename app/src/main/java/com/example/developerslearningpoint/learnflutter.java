package com.example.developerslearningpoint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class learnflutter extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learnflutter);

        webView=findViewById(R.id.fwebView);


        int position=getIntent().getIntExtra("key",0);

        if (position==0){

            webView.loadUrl("file:///android_asset/What is Flutter.html");
        }else if (position==1){

            webView.loadUrl("file:///android_asset/Installation of Flutter.html");
        }else if (position==2){

            webView.loadUrl("file:///android_asset/First Program in Flutter.html");
        }else if (position==3){

            webView.loadUrl("file:///android_asset/Flutter vs React Native.html");
        }else if (position==4){

            webView.loadUrl("file:///android_asset/Dart Programming.html");
        }

    }
}