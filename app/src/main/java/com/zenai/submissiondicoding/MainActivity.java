package com.zenai.submissiondicoding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.zenai.submissiondicoding.adapter.ListCourseAdapter;
import com.zenai.submissiondicoding.model.Course;
import com.zenai.submissiondicoding.model.CourseData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCourse;

    private ArrayList<Course> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCourse = findViewById(R.id.rv_course);
        rvCourse.setHasFixedSize(true);

        list.addAll(CourseData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCourse.setLayoutManager(new LinearLayoutManager(this));
        ListCourseAdapter listCourseAdapter = new ListCourseAdapter(list);
        rvCourse.setAdapter(listCourseAdapter);
    }
}
