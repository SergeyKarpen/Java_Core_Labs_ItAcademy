package labs.itacademy.skarpen.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson_1_Exceptions {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обрабатываем исключение в main");
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("asd");
        Scanner scanner = new Scanner(file);
    }

}

