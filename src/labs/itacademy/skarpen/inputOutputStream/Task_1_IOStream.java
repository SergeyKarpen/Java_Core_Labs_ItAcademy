package labs.itacademy.skarpen.inputOutputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * 1. Ввести с консоли имя файла. Найти байт или байты с максимальным количеством повторов.
 * Вывести их на экран через пробел. Закрыть поток ввода-вывода.
 * путь абсолютный C:\Users\Admin\IdeaProjects\M-JC1-25-19\src\skarpen\inputOutputStream\byte
 */

public class Task_1_IOStream {
    private static final int DIMENSIONOFDATAFLOW = 1024;

    public static void main(String[] args) throws IOException {
/**
 * Метод main всё методы которые используется в задаче:
 * getString - вызывает Sсanner для ввода имени файла;
 * getIntegers - считываем информацию с фала и записывает в ArrayList<Integer> list;
 * DuplicateByteSortMethod - ищет наиболее часто встречаемый byte (смю условие задачи).
 */
        String ValueInputScanner = getString();
        ArrayList<Integer> list = getIntegers(ValueInputScanner);
        DuplicateByteSortMethod(list);
    }

    /**
     * @param valueInputScanner считываем информацию с файла;
     * @return возвращает ArrayList<Integer> list с информацией из фалйла.
     * @throws IOException ловит ошибку на непрвильный ввод пути к файлу;
     */
    private static ArrayList<Integer> getIntegers(String valueInputScanner) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(valueInputScanner);
        ArrayList<Integer> list = new ArrayList<>();
        byte[] bytes = new byte[DIMENSIONOFDATAFLOW];
        int i = 0;
        while ((i = fileInputStream.read(bytes)) >= 0) {
            list.add(i);
        }
        fileInputStream.close();
        return list;
    }

    /**
     * С помощью Stream API находим наиболее повторяющееся значение байта и выводим на экран;
      * @param list используем ранее ArrayList<Integer> list и вносим в Integer word значение наиболее повторяющегося байта и выводим на экран.
     */
    private static void DuplicateByteSortMethod(ArrayList<Integer> list) {
        Integer word = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println("Most popular byte is " + word);
    }

    /**
     * Вызывается Scanner для ввода имени фала, т.к фаил уже создан предлагается просто вписать путь к нему;
     * @return возвращает созданный ранее фаил "byte.txt" по абсолютному пути.
     */
    private static String getString() {
        System.out.println("Input Enter file path: C:\\Users\\Admin\\IdeaProjects\\M-JC1-25-19\\src\\skarpen\\inputOutputStream\\byte");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}








