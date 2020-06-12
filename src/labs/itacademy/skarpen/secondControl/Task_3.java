package labs.itacademy.skarpen.secondControl;

/**
 * Created by user on 04.03.2020.
 */
public class Task_3 {

    public static final String ThePathToTheFileWriter = "C:\\Users\\Admin\\IdeaProjects\\M-JC1-25-19\\src\\skarpen\\Write.txt";
    public static final String ThePathToTheFileRead = "C:\\Users\\Admin\\IdeaProjects\\M-JC1-25-19\\src\\skarpen\\Read.txt";
    static int randoAarrayLength = 30;

    public static void main(String[] args) {
/*
        File fileWrite = ArrayCreationWriteToFile();

        List<Integer> listInt = readAndWriteInNewArray(fileWrite);

        sortListAndWriteInNewFile(listInt);
    }

    /**
     * @param fileWrite
     * @return считываем значения с файла и записываем в новый массив для дальнейшей сортирвоки;
     */
 /*   private static List<Integer> readAndWriteInNewArray(File fileWrite) {
        List<Integer> listInt = new ArrayList();
        try {
            FileReader fileReader = new FileReader(fileWrite);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try (FileReader fileReader = new FileReader(fileWrite)) {
            int ch;
            while ((ch = fileReader.read()) != -1) {
                listInt.add(ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listInt;
    }

    /**
     * @param listInt сортируем согласно условиям задачи массив и записываем его в новый фаил
     */
 /*   private static void sortListAndWriteInNewFile(List<Integer> listInt) {
        listInt.stream().filter(p -> p % 2 != 0).sorted().collect(Collectors.toList());

        File fileRead = new File(ThePathToTheFileRead);
        try (FileWriter fileWriter = new FileWriter(fileRead)) {
            for (int i : listInt) {
                fileWriter.write(i);
            }
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @return создаем массив рандомных значений и записываем его в фаил
     */
 /*   private static File ArrayCreationWriteToFile() {
        File fileWrite = new File(ThePathToTheFileWriter);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < randoAarrayLength; i++) {
            list.add((int) (Math.random() * randoAarrayLength));
        }

        try (FileWriter fileWriter = new FileWriter(fileWrite)) {
            for (int i : list) {
                fileWriter.write(i);
            }
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileWrite;
*/
    }
}

