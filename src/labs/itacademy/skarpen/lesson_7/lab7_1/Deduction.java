package labs.itacademy.skarpen.lesson_7.lab7_1;

import java.util.ArrayList;

public class Deduction {
    public static void main(String[] args) {

        int SCORE = 5; //  passing score above 5

        ArrayList<Student> students = new ArrayList<>();
        Student studentFirst = new Student("Bob", 5);
        Student studentSecond = new Student("Mark", 7);
        Student studentThree = new Student("Pol", 2);
        Student studentFour = new Student("Tom", 4);
        Student studentFive = new Student("Billi", 10);

        students.add(studentFirst);
        students.add(studentSecond);
        students.add(studentThree);
        students.add(studentFour);
        students.add(studentFive);


        for (Student s: students) {
            if(s.getAccount()>SCORE) {
                System.out.println("Passing score above 5: " + s.getStudentName());
            }
        }

    }}
