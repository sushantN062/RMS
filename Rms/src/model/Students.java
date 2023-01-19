package model;

public class Students {
    public Students(int id, String name, int class_no, int age) {
        this.id = id;
        this.name = name;
        this.class_no = class_no;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClass_no() {
        return class_no;
    }

    public void setClass_no(int class_no) {
        this.class_no = class_no;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int id;
    String name;
    int class_no;
    int age;
}
