package labs.itacademy.skarpen.StreamAPI;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_4 {
    public static void main(String[] args) throws FileNotFoundException {
//  4*.Считать с консоли имя файла. Файл содержит слова, разделенные знаками препинания. Вывести в консоль количество слов "world", которые встречаются в файле. Закрыть потоки.

        String separator = File.separator;
        String path = separator + "Users" + separator + "Admin" + separator + "IdeaProjects" + separator + "M-JC1-25-19" + separator + "src" + separator + "skarpen" + separator + "StreamAPI" + separator + "findWords";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        System.out.println("There is word 'world' in the text was found: " + FindTheWorld(scanner) + " repetitions.");
        scanner.close();
        System.out.println("The end");
    }

    /**
     * @param scanner
     * @return
     */
    public static int FindTheWorld(Scanner scanner) {
        while (scanner.hasNextLine()) {
            Pattern pattern = Pattern.compile("\\bworld\\b");
            Matcher matcher = pattern.matcher(scanner.nextLine().toLowerCase());
            while (matcher.find()) {
                Variable.NumberOfWordValue++;
            }
        }
        return Variable.NumberOfWordValue;
    }

    /**
     * New fail Variable
     */
    static class Variable {
        public static int NumberOfWordValue;
    }

}



