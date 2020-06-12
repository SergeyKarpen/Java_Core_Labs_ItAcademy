package labs.itacademy.skarpen.StreamAPI;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task_3 {
    /**
     * Считать с консоли данные. Вывести во вторую переменную все числа, которые есть в первом файле.
     * Числа выводить через пробел. Пример - 12 text var2 14 8v 1 Результат: 12 14 1
     */

private final static String DEFAULT_LINE = "12 text var2 14 8v 1";

    public static void main(String[] args) {

        String string = getString();
        ApplyStreamAPI(string);
    }

    /**
     * @param string возращает измененную строку
     */
    private static void ApplyStreamAPI(String string) {
        String EndLine = Stream.of(string.split(" +"))
                .filter(i -> i.matches("\\d+"))
                .collect(Collectors.joining(" "));
        System.out.println(EndLine);
    }

    /**
     * @return возравается строка введенная либо по умолчанию
     */
    private static String getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a random string with numbers or press \"Enter\" then the default string will be accepted \"12 text var2 14 8v 1\"");
        String InputString = scanner.nextLine();
        if (InputString.equals("")) InputString = DEFAULT_LINE;
        return InputString;
    }
}
