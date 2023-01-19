package model;

import java.util.ArrayList;

//subejct gpa
//subjects
//subjects codes
public class Subjects {

    ArrayList<Grades> grades;

    float subject_gpa;
    String subjects;

    public ArrayList<Grades> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Grades> grades) {
        this.grades = grades;
    }

    public float getSubject_gpa() {
        return subject_gpa;
    }

    public void setSubject_gpa(float subject_gpa) {
        this.subject_gpa = subject_gpa;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public int getSubject_codes() {
        return subject_codes;
    }

    public void setSubject_codes(int subject_codes) {
        this.subject_codes = subject_codes;
    }

    public Subjects(ArrayList<Grades> grades, float subject_gpa, String subjects, int subject_codes) {
        this.grades = grades;
        this.subject_gpa = subject_gpa;
        this.subjects = subjects;
        this.subject_codes = subject_codes;
    }

    int subject_codes;
}
