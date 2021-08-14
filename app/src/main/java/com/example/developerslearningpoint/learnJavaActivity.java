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
        else if (position==2){

            webView.loadUrl("file:///android_asset/c++vsjava.html");
        }

        else if (position==3){

            webView.loadUrl("file:///android_asset/first Program In Java.html");
        }
        else if (position==4){

            webView.loadUrl("file:///android_asset/Data types in java.html");
        }else if (position==5){

            webView.loadUrl("file:///android_asset/Control Statement in Java.html");
        }else if (position==6){

            webView.loadUrl("file:///android_asset/if else in java.html");
        }else if (position==7){

            webView.loadUrl("file:///android_asset/Switch case in java.html");
        }else if (position==8){

            webView.loadUrl("file:///android_asset/For loop in java.html");
        }else if (position==9){

            webView.loadUrl("file:///android_asset/While loop in java.html");
        }else if (position==10){

            webView.loadUrl("file:///android_asset/do while loop in java.html");
        }else if (position==11){

            webView.loadUrl("file:///android_asset/Break Statement in java.html");
        }

    }
}