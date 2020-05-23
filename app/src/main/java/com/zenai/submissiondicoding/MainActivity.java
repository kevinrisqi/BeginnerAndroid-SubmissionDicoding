package com.zenai.submissiondicoding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.about_menu:
                Toast.makeText(this, "About Menu", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void showRecyclerList(){
        rvCourse.setLayoutManager(new LinearLayoutManager(this));
        ListCourseAdapter listCourseAdapter = new ListCourseAdapter(list);
        rvCourse.setAdapter(listCourseAdapter);

        listCourseAdapter.setOnItemClickCallback(new ListCourseAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Course data) {
                showSelectedCourse(data);
            }
        });
    }

    private void showSelectedCourse(Course course) {
//        Toast.makeText(this, "Kamu memilih " + course.getName(), Toast.LENGTH_SHORT).show();
        String name = course.getName();
        String category = course.getCategory();
        String rating = course.getRating();
        String detail = course.getDetail();
        String explanation = course.getExplanation();
        int photo = course.getPhoto();

        Intent intent = new Intent(this,ContentActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("NAME_KEY",name);
        bundle.putString("CATEGORY_KEY",category);
        bundle.putString("RATING_KEY",rating);
        bundle.putString("DETAIL_KEY",detail);
        bundle.putString("EXPLANATION_KEY",explanation);
        bundle.putInt("PHOTO_KEY",photo);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
