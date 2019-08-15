package com.example.android.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

//    String[] color = {"Red", "Orange", "Yellow", "Green", "Blue", "Violet"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = findViewById(R.id.listView);

        final ArrayList<String> color = new ArrayList();
        color.add("Red");
        color.add("Orange");
        color.add("Yellow");
        color.add("Green");
        color.add("Blue");
        color.add("Violet");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, color);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this, "Number " + i + " * " + color.get(i), Toast.LENGTH_SHORT).show();
            }
        });



    }
}
