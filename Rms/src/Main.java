import model.Grades;
import model.Students;
import model.Subjects;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Students s1 = new Students(1, "Ram", 220, 18);
        Students s2 = new Students(2, "Hari", 203, 19);


        ArrayList<Students> stukogrades = new ArrayList<>();
        stukogrades.add(s1);

        ArrayList<Students> stukogrades1 = new ArrayList<>();
        stukogrades1.add(s2);

        Grades g1 = new Grades(stukogrades, 4, 67, 25, "A");
        Grades g2 = new Grades(stukogrades1, 4, 70,25, "B");

        ArrayList<Grades> grade1 = new ArrayList<>();
        grade1.add(g1);

        ArrayList<Grades> grade2 = new ArrayList<>();
        grade2.add(g2);

        Subjects sub1 = new Subjects(grade1, 4, "Mathematics", 2012);
        Subjects sub2 = new Subjects(grade2, 4, "Computer", 2020);


    }
}