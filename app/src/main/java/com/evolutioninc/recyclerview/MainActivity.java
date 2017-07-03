package com.evolutioninc.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager manager;
    ArrayList<Section> sections;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView = (RecyclerView) findViewById(R.id.recyler);
        SectionAdapter myAdapter = new SectionAdapter(this, getData());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(myAdapter);
        //udated from gitHub
        //edit from gk

    }

    public ArrayList<Section> getData() {
        ArrayList<Section> sectionList = new ArrayList<>();
        ArrayList<Student> studentList = new ArrayList<>();
        Section section = null;
        String[] name = {"Enam", "Andy", "Alex", "Vivz", "Gosling", "Ritchi"};
        for (int x = 0; x < 5; x++) {
            //  int[] icn = {R.drawable.icon1, R.drawable.ic_action_name, R.drawable.icon1, R.drawable.ic_action_name, R.drawable.icon1, R.drawable.ic_action_name};

            for (int i = 0; i < name.length; i++)

            {
                Student student = new Student();
                student.name = name[i];
                studentList.add(student);


            }
            section = new Section("Section " + x, studentList);
            sectionList.add(section);
        }

        return sectionList;
    }


}

