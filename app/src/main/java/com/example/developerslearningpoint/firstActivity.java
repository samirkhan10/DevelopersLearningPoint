package com.example.developerslearningpoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class firstActivity extends AppCompatActivity {
    ImageView java,kotlin,flutter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        java=findViewById(R.id.java);
        kotlin=findViewById(R.id.kotlin);
        flutter=findViewById(R.id.flutter);


        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(firstActivity.this,MainActivity.class));
            }
        });

        kotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(firstActivity.this,listviewforkotlinactivity.class));
            }
        });

        flutter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(firstActivity.this,listviewforflutter.class));
            }
        });

    }
}