package com.example.developerslearningpoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listview);
        String[] learnJava=getResources().getStringArray(R.array.learnjava);

        ArrayAdapter<String> adapter= new ArrayAdapter<>(this, R.layout.row,R.id.t1,learnJava);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this,learnJavaActivity.class);
                intent.putExtra("key",position);
                startActivity(intent);
            }
        });

    }
}