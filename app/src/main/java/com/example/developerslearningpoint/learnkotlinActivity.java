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

        webView.getSettings().setDisplayZoomControls(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setJavaScriptEnabled(true);


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
        }else if (position==6){

            webView.loadUrl("file:///android_asset/If Statement in kotlin.html");
        }else if (position==7){

            webView.loadUrl("file:///android_asset/when Statement in kotlin.html");
        }else if (position==8){

            webView.loadUrl("file:///android_asset/For loop in Kotlin.html");
        }else if (position==9){

            webView.loadUrl("file:///android_asset/While Loop in Kotlin.html");
        }else if (position==10){

            webView.loadUrl("file:///android_asset/Return and Jump Statement  in Kotlin.html");
        }else if (position==11){

            webView.loadUrl("file:///android_asset/Continue Jump Structure in Kotlin.html");
        }else if (position==12){

            webView.loadUrl("file:///android_asset/Function in Kotlin.html");
        }else if (position==13){

            webView.loadUrl("file:///android_asset/Recursion Function in Kotlin.html");
        }else if (position==14){

            webView.loadUrl("file:///android_asset/Lambda in Kotlin.html");
        }else if (position==15){

            webView.loadUrl("file:///android_asset/Higher Order in Kotlin.html");
        }else if (position==16){

            webView.loadUrl("file:///android_asset/Inline Function in Kotlin.html");
        }else if (position==17){

            webView.loadUrl("file:///android_asset/Array in Kotlin.html");
        }else if (position==18){

            webView.loadUrl("file:///android_asset/String in Kotlin.html");
        }

    }
}
