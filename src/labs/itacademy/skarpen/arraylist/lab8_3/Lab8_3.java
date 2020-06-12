package labs.itacademy.skarpen.arraylist.lab8_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lab8_3 {
    public static void main(String[] args) {
        //Создать список оценок учеников с помощью ArryList, заполнить случайными оценками. Найти самую высокую оценку с использованием итератора.
        List<Integer> numder = new ArrayList<>();

        int bak = 0;

        System.out.println("Original array with assessments: ");
        for (int i = 0; i < 20; i++) {
            bak = (int) (Math.random() * 15);
            numder.add(bak);
            System.out.print(bak + " ");
        }

        numder.sort(Comparator.comparing(Integer::longValue).reversed());
        System.out.println("\n" + "Max number: " + numder.get(0));

    }
}
