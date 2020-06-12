package labs.itacademy.skarpen.inputOutputStream;

import java.io.*;
import java.util.ArrayList;

public class Task_3_IOStream {
    /**
     * 3.Организовать построчное считывание данных, введенных с консоли, и их запись в файл.
     * Признаком окончания записи (конец работы программы) является строка со словом «#ESC».
     */
    public final static String WAY_TO_CREATED_FILE = "C:\\Users\\Admin\\IdeaProjects\\M-JC1-25-19\\src\\skarpen\\inputOutputStream\\#ESC.txt";
    public static String INPUT_LINE = null;

    public static void main(String[] args) throws IOException {
        File file = new File(WAY_TO_CREATED_FILE);
        Writer writer = new FileWriter(file);
        ArrayList<String> arrayStringInput = new ArrayList<>();
        BufferedReader bufferedReader = getBufferedReader();
        writeToDataFile(bufferedReader, writer, arrayStringInput);
        outputToTheConsole(arrayStringInput);
    }

    /**
     * @param bufferedReader   полученная информация с консоли;
     * @param writer           записываем bufferedReader в создаваемый фаил «#ESC»;
     * @param arrayStringInput записываем bufferedReader в создаваемый массив arrayStringInput (для последующего вывода в консоль);
     * @throws IOException ошибка на отсутствие файла.
     */
    private static void writeToDataFile(BufferedReader bufferedReader, Writer writer, ArrayList<String> arrayStringInput) throws IOException {
        while (true) {
            try {
                INPUT_LINE = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (INPUT_LINE.equalsIgnoreCase("#ESC")) break;
            writer.write(INPUT_LINE + "\n");
            arrayStringInput.add(INPUT_LINE);
        }
        writer.close();
        bufferedReader.close();
    }

    /**
     * @param arrayStringInput вывод данных в консоль
     */
    private static void outputToTheConsole(ArrayList<String> arrayStringInput) {
        System.out.println("It is your strings: ");
        for (String NewString : arrayStringInput) System.out.println(NewString);
    }

    /**
     * @return возрващаем считанную информацию с консоли.
     */
    private static BufferedReader getBufferedReader() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input text: ");
        System.out.println("Input '#ESC' for the finish program!");
        return bufferedReader;
    }


}

