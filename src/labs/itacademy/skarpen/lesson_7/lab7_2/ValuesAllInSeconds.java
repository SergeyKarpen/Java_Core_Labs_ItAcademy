package labs.itacademy.skarpen.lesson_7.lab7_2;

public class ValuesAllInSeconds implements Result{

    private int NUM (Date date) {
        return ((date.getHours() * Constants.TRASLATERFIRST) + date.getMinutes() * Constants.TRASLATERSECOND) + (date.getSeconds());
    }

    @Override
    public String Comparison (Date dateFirst, Date dateSecond) {
        return (NUM(dateFirst) > NUM(dateSecond)) ? NUM(dateFirst)-NUM(dateSecond) + " The first number is greater by the value: " : NUM(dateSecond) - NUM(dateFirst) + " The second number is greater by the value: ";
}
}




