package labs.itacademy.skarpen.date_lessons;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * Узнать день недели и вывести его, если у нас есть дана дата в String формате или timeStamp
 */

public class Task_1_Date {

    public static void main(String[] args) {

        Date date = new Date();
        Scanner scanner = new Scanner(System.in);
        System.out.println("I'm glad to see you! Today is " + date + "\n" + "Input your happy date: dd.MM.yyy");
        SOURCEDATE.SOURCEDATEMY = scanner.nextLine();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.ENGLISH);
        LocalDate localDate = LocalDate.parse(SOURCEDATE.SOURCEDATEMY, dateFormat);
        System.out.println("Your happy day is " + localDate.getDayOfWeek());

        // String DayOfTheWeek = dateFormat.format(new Timestamp(System.currentTimeMillis()));
        // System.out.println("Today is " + DayOfTheWeek);
    }

    static class SOURCEDATE {
        public static String SOURCEDATEMY;
    }
}
