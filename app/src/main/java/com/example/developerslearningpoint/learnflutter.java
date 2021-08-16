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

        webView.getSettings().setDisplayZoomControls(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setJavaScriptEnabled(true);


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
        }else if (position==5){

            webView.loadUrl("file:///android_asset/widgets in Flutter.html");
        }else if (position==6){

            webView.loadUrl("file:///android_asset/Layouts in Flutter.html");
        }else if (position==7){

            webView.loadUrl("file:///android_asset/Gestures in flutter.html");
        }else if (position==8){

            webView.loadUrl("file:///android_asset/State Management in flutter.html");
        }else if (position==9){

            webView.loadUrl("file:///android_asset/IDE for Flutter.html");
        }else if (position==10){

            webView.loadUrl("file:///android_asset/Scafhold widgets in Flutter.html");
        }else if (position==11){

            webView.loadUrl("file:///android_asset/containers in flutter.html");
        }else if (position==12){

            webView.loadUrl("file:///android_asset/row and column in flutter.html");
        }else if (position==13){

            webView.loadUrl("file:///android_asset/text in flutter.html");
        }else if (position==14){

            webView.loadUrl("file:///android_asset/EditText in flutter.html");
        }else if (position==15){

            webView.loadUrl("file:///android_asset/Buttons in flutter.html");
        }

    }
}