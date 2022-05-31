package com.example.lec_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.list);

        ArrayList<Student> arrayList = new ArrayList<Student>();

        arrayList.add(new Student("Dar","1","CS",R.drawable.zed));

        MyAdapter myAdapter = new MyAdapter(this,0,arrayList);

        lv.setAdapter(myAdapter);



    }
}