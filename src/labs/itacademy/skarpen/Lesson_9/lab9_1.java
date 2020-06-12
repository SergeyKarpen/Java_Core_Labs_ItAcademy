package labs.itacademy.skarpen.Lesson_9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class lab9_1 {
    public static void main(String[] args) {
        //Пользователь вводит набор чисел в виде одной строки (“1, 2, 3, 4, 4, 5”). Избавиться от повторяющихся элементов в строке и вывести результат на экран.
        HashSet<String> hashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        hashSet.addAll(Arrays.asList(numbers.split(" ")));
        System.out.println(hashSet);
        String e = "dsfdsf";


    }
}
