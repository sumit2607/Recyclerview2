package com.sumit.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<String> courseList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

courseList = new ArrayList<>();
    courseList.add("java");
        courseList.add("java");
        courseList.add("c++");
        courseList.add("c");
        courseList.add("python");
        courseList.add("c#");
        courseList.add("javascript");
        courseList.add("Go");
        courseList.add("Ruby");
        courseList.add("Dart");
        courseList.add("Docker");
        courseList.add("Docker");
        courseList.add("java");
        courseList.add("c++");
        courseList.add("c");
        courseList.add("python");
        courseList.add("c#");
        courseList.add("javascript");
        courseList.add("Go");
        courseList.add("Ruby");
        courseList.add("Dart");
        courseList.add("Docker");
        courseList.add("Docker");
        courseList.add("java");
        courseList.add("c++");
        courseList.add("c");
        courseList.add("python");
        courseList.add("c#");
        courseList.add("javascript");
        courseList.add("Go");
        courseList.add("Ruby");
        courseList.add("Dart");
        courseList.add("Docker");
        courseList.add("Docker");
        courseList.add("java");
        courseList.add("c++");
        courseList.add("c");
        courseList.add("python");
        courseList.add("c#");
        courseList.add("javascript");
        courseList.add("Go");
        courseList.add("Ruby");
        courseList.add("Dart");
        courseList.add("Docker");
        courseList.add("Docker");

        CourseAdapter adapter = new CourseAdapter(courseList);
        recyclerView.setAdapter(adapter);

    }
}