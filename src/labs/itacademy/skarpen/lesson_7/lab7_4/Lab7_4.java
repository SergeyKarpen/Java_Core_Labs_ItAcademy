package labs.itacademy.skarpen.lesson_7.lab7_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Lab7_4 {
    public static void main(String[] args) {

//.Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
// Напишите еще один метод, который выбирает из заполненного списка элемент наугад 10000 раз.
// Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие.

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        Random random = new Random();
        for (int i = 0; i < Constants.NUBMERSIZILIST; i++) {
            arrayList.add(random.nextInt());
            linkedList.add(random.nextInt());
        }

        long startProcess = System.currentTimeMillis();
        for (int i = 0; i < Constants.NUMBEREIEMENTS; i++) {
            arrayList.get((int) (Math.random() * Constants.NUBMERSIZILIST));
        }
        long finishProcess = System.currentTimeMillis();
        System.out.println("Time for ArrayList: " + (finishProcess - startProcess) + " ms");

        long startProcess2 = System.currentTimeMillis();
        for (int i = 0; i < Constants.NUMBEREIEMENTS; i++) {
            linkedList.get((int) (Math.random() * Constants.NUBMERSIZILIST));
        }
        long finishProcess2 = System.currentTimeMillis();
        System.out.println("Time for LinkedList: " + (finishProcess2 - startProcess2) + " ms");

    }
}
