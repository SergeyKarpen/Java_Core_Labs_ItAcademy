package labs.itacademy.skarpen.inputOutputStream;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task_4_IOStream {
    /**
     * Считать из одного файла текст НА РУССКОМ и НА АНГЛ. и вывести в другой. Нагенерить(создать) файл минимум 100мб. В репозиторий GIT не закидывать!!!!
     */

    public static final String FILE_FOR_THE_READER = "C:\\Users\\Admin\\IdeaProjects\\M-JC1-25-19\\src\\skarpen\\inputOutputStream\\fileForRead.txt";
    public static final String FILE_FOR_THE_WRITER = "C:\\Users\\Admin\\IdeaProjects\\M-JC1-25-19\\src\\skarpen\\inputOutputStream\\fileForWrite.txt";

    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            try {
                inputStream = new FileInputStream(FILE_FOR_THE_READER);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            outputStream = new FileOutputStream(FILE_FOR_THE_WRITER);

            int element;
            while ((element = inputStream.read()) != -1) {
                outputStream.write(element);
            }

            System.out.println("Copying information completed!");
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (inputStream != null) {
                outputStream.close();
            }
        }
    }
}


