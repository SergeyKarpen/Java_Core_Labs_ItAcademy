package labs.itacademy.skarpen.StreamAPI;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task_2 {

    public static void main(String[] args) {

        /**
         * 2. Считать с консоли данные(массив слов).
         * Записать в другую переменную String строку(через запятую слова),
         * длина которых строго больше 6. В конце запятой не должно быть.
         */
        System.out.println("Enter lines to create an array: ");
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        InputInformationAboutArray(arrayList, scanner);
    }

    /**
     * Отдельный фаил
     *
     * @param arrayList собирает вводные данные
     * @param scanner   используется как ввод данных
     */
    private static void  InputInformationAboutArray(ArrayList<String> arrayList, Scanner scanner) {
        do {
            System.out.println("You can add a line:");
            arrayList.add(scanner.nextLine());
            System.out.println("continue: Yes/No ? Press Enter for No!");
            if (scanner.nextLine().equals("")) {
                VariablesInStream.variableTrueOrFalse = false;
            } else System.out.println("OK!");
        }
        while (VariablesInStream.variableTrueOrFalse);
        {
            System.out.println(StreamOfFunction(arrayList));
        }
        scanner.close();
    }

    /**
     * Отдельный фаил
     *
     * @param arrayList с помощью Stream преобразуем вводные данные
     * @return String через запятую строки более 6 символов в конце запятой нету
     */
    private static String StreamOfFunction(ArrayList<String> arrayList) {
        return arrayList.stream().filter(x -> x.length() > 6).sorted().map(Object::toString).collect(Collectors.joining(","));
    }

    /**
     * Отдельный фаил с переменными
     */
    public static class VariablesInStream {
        static boolean variableTrueOrFalse = true;
    }
}




