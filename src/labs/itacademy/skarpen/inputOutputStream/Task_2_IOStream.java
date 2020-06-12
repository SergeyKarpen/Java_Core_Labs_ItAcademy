package labs.itacademy.skarpen.inputOutputStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;


/**
 * Написать программу, которая создаст текстовый файл и запишет в него список файлов (путь, имя, дата создания) из заданного каталога.
 */


public class Task_2_IOStream {
public static final String THEPATHTOTHEFILE = "C:\\Users\\Admin\\IdeaProjects\\M-JC1-25-19\\src\\skarpen\\inputOutputStream\\Ex.txt";
public static final String THEWAYOFDIRECTORIES = "C:\\Users\\Admin\\IdeaProjects\\M-JC1-25-19\\src\\skarpen";

    public static void main(String[] args) throws IOException {
        FileDirectoryAndWriteToFile();
    }

    /**
     * Создаем фаил новый! - 'file';
     * Опрделяем директорию откуда будем считывать информацию - 'direct';
     * @throws IOException ловит ошибку на ненахождение фала.
     */
    private static void FileDirectoryAndWriteToFile() throws IOException {
        File file = new File(THEPATHTOTHEFILE);
        File direct = new File(THEWAYOFDIRECTORIES);
        File[] allFiles = direct.listFiles(); //<!--?-->
        FileWriter fileWriter = new FileWriter(file);
        StringBuilder stringBuilder = getStringBuilder(allFiles);
        fileWriter.write(String.valueOf(stringBuilder));
        fileWriter.close();
    }

    /**
     * @param allFiles переносим всю информайию о директории (каталоге);
     * @return возвращает данные для записи в фаил;
     * @throws IOException ловит ошибку на ненахождение фала.
     */
    private static StringBuilder getStringBuilder(File[] allFiles) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        for (File variableFile : allFiles) {
            BasicFileAttributes attr = Files.readAttributes(Paths.get("C:\\Users\\Admin\\IdeaProjects\\M-JC1-25-19\\src\\skarpen"), BasicFileAttributes.class);
            stringBuilder.append(variableFile);
            stringBuilder.append(" ");
            stringBuilder.append(attr.lastModifiedTime());
            stringBuilder.append(" ");
            stringBuilder.append(attr.creationTime()).append(" ").append("\n");
        }
        return stringBuilder;
    }
}

