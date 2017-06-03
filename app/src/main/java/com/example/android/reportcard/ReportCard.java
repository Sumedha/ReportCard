package com.example.android.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ReportCard extends AppCompatActivity {

    // Log Tag for logging messages
    private static final String LOG_TAG = ReportCard.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_list);

        // Create an ArrayList of Subjects
        ArrayList<GradeList> gradeList = new ArrayList<GradeList>();
        gradeList.add(new GradeList("Intro to Programming", "A", R.drawable.champ));
        gradeList.add(new GradeList("VR Developer", "B", R.drawable.champ));
        gradeList.add(new GradeList("Robotics", "A", R.drawable.champ));
        gradeList.add(new GradeList("Digital Marketing", "C", R.drawable.champ));
        gradeList.add(new GradeList("Deep Learning Foundations", "D", R.drawable.champ));


        GradeListAdapter gradeAdapter = new GradeListAdapter(this, gradeList);


        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_grades);
        listView.setAdapter(gradeAdapter);
        listView.setTextFilterEnabled(true);

    }

}

