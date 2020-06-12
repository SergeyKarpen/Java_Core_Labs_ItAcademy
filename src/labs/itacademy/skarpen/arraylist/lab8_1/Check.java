package labs.itacademy.skarpen.arraylist.lab8_1;

import java.util.ArrayList;
import java.util.Iterator;

import static labs.itacademy.skarpen.arraylist.lab8_1.Constants.MINIMALPOSITIVEEVALUATION;

public class Check {
    public static void main(String[] args) {
        //1. Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками. Удалить неудовлетворительные оценки из списка.

        ArrayList<Integer> students = new ArrayList<>();

        int vak = 0;

        System.out.println("Original array: ");
        for (int i = 0; i < 10; i++) {
            vak = (int) (Math.random() * 11);
            students.add(vak);
            System.out.print(vak + " ");
        }

        System.out.println(" " + students.contains(2) + " " + students.get(2));
        System.out.println("\n" + "Sort array: ");


        Iterator<Integer> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            Integer nextStudent = studentIterator.next();
            if (nextStudent <= MINIMALPOSITIVEEVALUATION) {
                studentIterator.remove();
            }
        }
        System.out.println(students);
    }
}








