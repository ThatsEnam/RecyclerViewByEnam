package com.evolutioninc.recyclerview;

import java.util.ArrayList;

/**
 * Created by That's Enam on 6/29/2017.
 */

public class Student {

    String name;
    int iconId;

}

class Section {
    String sectionName;
    ArrayList<Student> students;

    public Section(String sectionName, ArrayList<Student> students) {
        this.sectionName = sectionName;
        this.students = students;
    }
}
