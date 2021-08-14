package com.example.developerslearningpoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listviewforflutter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listviewforflutter);
        ListView listView = findViewById(R.id.flistview);
        String[] learnflutter=getResources().getStringArray(R.array.learnflutter);

        ArrayAdapter<String> adapter= new ArrayAdapter<>(this, R.layout.frow,R.id.t1,learnflutter);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(listviewforflutter.this,learnflutter.class);
                intent.putExtra("key",position);
                startActivity(intent);
            }
        });

    }
}