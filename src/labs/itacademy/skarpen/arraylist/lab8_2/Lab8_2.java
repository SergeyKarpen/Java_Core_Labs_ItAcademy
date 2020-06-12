package labs.itacademy.skarpen.arraylist.lab8_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Lab8_2 {
    public static void main(String[] args) {
//Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.

        List<Integer> students = new ArrayList<>();

        int vak = 0;

        System.out.println("Original array: ");
        for (int i = 0; i < 10; i++) {
            vak = (int) (Math.random() * 11);
            students.add(vak);
            System.out.print(vak + " ");
        }

        students = students.stream().distinct().collect(Collectors.toList());

        System.out.print("\n" + "Sort list: " + students);

    }
}
