package model;

import java.util.ArrayList;

public class Grades {
    ArrayList<Students> students;
    float GPA;
    int theory_marks;
    int practical_marks;

    public Grades(ArrayList<Students> students, float GPA, int theory_marks, int practical_marks, String subject_grades) {
        this.students = students;
        this.GPA = GPA;
        this.theory_marks = theory_marks;
        this.practical_marks = practical_marks;
        this.subject_grades = subject_grades;
    }

    public ArrayList<Students> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Students> students) {
        this.students = students;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public int getTheory_marks() {
        return theory_marks;
    }

    public void setTheory_marks(int theory_marks) {
        this.theory_marks = theory_marks;
    }

    public int getPractical_marks() {
        return practical_marks;
    }

    public void setPractical_marks(int practical_marks) {
        this.practical_marks = practical_marks;
    }

    public String getSubject_grades() {
        return subject_grades;
    }

    public void setSubject_grades(String subject_grades) {
        this.subject_grades = subject_grades;
    }

    String subject_grades;


    //GPA; //THEORY-MARKS //PRACTICAL MARKS; //SUBJRCT GRADES;
}
