package labs.itacademy.skarpen.date_lessons;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Станция Небула-1 принимает звездолёты только по нечётным дням стандартного земного года (когда количество дней с начала года — нечётно).
 * Выясним, можем ли мы сегодня отдохнуть на Небуле-1.
 * Для этого реализуем метод isDateOdd(String date), возвращающий true, если количество дней с начала года — нечётное число, иначе false.
 */

public class Task_2_Date {
    public static void main(String[] argst) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date in format from 01.01.2020: dd.MM.yyyy");
        String date = scanner.nextLine();
        try {
            Variables.CHECKTERMS = isDateOdd(date);
        } catch (NullPointerException a) {
            Variables.CHECKTERMS = false;
        }
        System.out.println("False!Today we are not going to 'Небул-1'");
    }

    /**
     * @param date String (Воодный параметр с консоли)
     * @return true or false (result % 2 != 0;) (Находим какой по счету день от 01.01.2020) и возвращаем true при нечетном значении и false при четном;
     */
    public static boolean isDateOdd(String date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Variables.dateSource = simpleDateFormat.parse("01.01.2020");
            Variables.dateInput = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            System.out.println("Is it date?-No!");
        }
        Variables.dateInMilliseconds = Variables.dateInput.getTime() - Variables.dateSource.getTime();
        if (Variables.dateInMilliseconds < 0) {
            System.out.println("Written date without entering the range of 01.01.2020");
        }
        Variables.conversionInDays = (int) (Variables.dateInMilliseconds / Constants.NUMBEROFHOURSINDAY * Constants.NUMBEROFMINUTESINHOUR * Constants.NUMBEROFMILLISECONDSINSECONDS * Constants.NUMBEROFSECONDSINMINUTE);
        return Variables.conversionInDays % 2 != 0;
    }

    /**
     * New class Variables
     */
    public static class Variables {
        public static Date dateInput;
        public static Date dateSource;
        public static long dateInMilliseconds;
        public static int conversionInDays;
        public static boolean CHECKTERMS = true;
    }

    /**
     * Ney class
     */
    public static final class Constants {
        public static final int NUMBEROFHOURSINDAY = 24;
        public static final int NUMBEROFMILLISECONDSINSECONDS = 1000;
        public static final int NUMBEROFSECONDSINMINUTE = 60;
        public static final int NUMBEROFMINUTESINHOUR = 60;
    }
}