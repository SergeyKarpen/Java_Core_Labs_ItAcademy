package labs.itacademy.skarpen.lesson_6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab6_2_1 {
    public static void main(String[] args) {
//1. Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество
        System.out.println("Input please string");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("[!.,;:?/\\-]");
        Matcher matcher = pattern.matcher(input);

        int num = 0;
        while (matcher.find()) {
            num++;
        }

        System.out.println("Найденные знаки препинания в количестве - " + num + " штук");
    }
}
