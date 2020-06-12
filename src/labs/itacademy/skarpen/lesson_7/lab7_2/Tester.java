package labs.itacademy.skarpen.lesson_7.lab7_2;

public class Tester {
    public static void main(String[] args) {

        //Создать класс и объекты описывающие промежуток времени. Сам промежуток
        //в классе должен задаваться тремя свойствами: секундами, минутами, часами.
        //Сделать методы для получения полного количества секунд в объекте, сравнения
        //двух объектов (метод должен работать аналогично compareTo в строках). Создать
        //два конструктора: получающий общее количество секунд, и часы, минуты и секунды
        //по отдельности. Сделать метод для вывода данных. Прочее на ваше усмотрение.

        Date dateFirst = new Date(3, 30, 2);
        Date dateSecond = new Date(2, 45, 15);

        ValuesAllInSeconds service = new ValuesAllInSeconds();
        System.out.println(service.Comparison(dateFirst, dateSecond));
    }
}
