package com.example.developerslearningpoint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class learnkotlinActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learnkotlin);

        webView=findViewById(R.id.kwebView);


        int position=getIntent().getIntExtra("key",0);

        if (position==0){

            webView.loadUrl("file:///android_asset/what is Kotlin.html");
        }
        else if (position==1){

            webView.loadUrl("file:///android_asset/Data types in Kotlin.html");
        }else if (position==2){

            webView.loadUrl("file:///android_asset/syntax of Kotlin.html");
        }else if (position==3){

            webView.loadUrl("file:///android_asset/Operators in Kotlin.html");
        }else if (position==4){

            webView.loadUrl("file:///android_asset/Taking Input In Kotlin.html");
        }else if (position==5){

            webView.loadUrl("file:///android_asset/Comments in Kotlin.html");
        }

    }
}
