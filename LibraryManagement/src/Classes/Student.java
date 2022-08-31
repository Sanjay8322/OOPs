package Classes;

import Enums.Gender;

public class Student{
    String name;
    int age;
    Gender gender;
    int studentId;
    String yearOfCollege;
    public Student(){

    }
    public Student(String name, int age, Gender gender, int studentId, String yearOfCollege) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.studentId = studentId;
        this.yearOfCollege = yearOfCollege;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getYearOfCollege() {
        return yearOfCollege;
    }
}
