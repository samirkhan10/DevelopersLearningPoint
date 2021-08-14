package com.example.developerslearningpoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listviewforkotlinactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listviewforkotlinactivity);

        ListView listView = findViewById(R.id.klistview);
        String[] learnkotlin=getResources().getStringArray(R.array.learnkotlin);

        ArrayAdapter<String> adapter= new ArrayAdapter<>(this, R.layout.krow,R.id.t1,learnkotlin);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(listviewforkotlinactivity.this,learnkotlinActivity.class);
                intent.putExtra("key",position);
                startActivity(intent);
            }
        });

    }
}