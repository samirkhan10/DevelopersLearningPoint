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

        webView.getSettings().setDisplayZoomControls(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setJavaScriptEnabled(true);


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
        }else if (position==12){

            webView.loadUrl("file:///android_asset/Java Programs.html");
        }else if (position==13){

            webView.loadUrl("file:///android_asset/oops in Java.html");
        }else if (position==14){

            webView.loadUrl("file:///android_asset/Classes And Objects.html");
        }else if (position==15){

            webView.loadUrl("file:///android_asset/Methods in Java.html");
        }else if (position==16){

            webView.loadUrl("file:///android_asset/Constructors in Java.html");
        }else if (position==17){

            webView.loadUrl("file:///android_asset/Java Static Keyword.html");
        }else if (position==18){

            webView.loadUrl("file:///android_asset/This Keyword in Java.html");
        }

    }
}