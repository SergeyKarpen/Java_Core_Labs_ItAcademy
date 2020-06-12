package labs.itacademy.skarpen.secondControl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 04.03.2020.
 */
public class Task_1 {
    static int randoAarrayLength = 15;
    static int sumMaxAndMinimum;

    public static void main(String[] args) {
        List<Integer> list = getIntegers();

        Integer maxValue = getMaxValue(list);

        Integer minValue = getMinValue(list);

        Integer getSumWithOutMaxMin = getSumWithOutMaxMin(list, maxValue, minValue);
        System.out.println("MinValue - " + maxValue + "\n" + "MinValue - " + minValue + "\n" + "getSumWithOutMaxMin - " + getSumWithOutMaxMin);
    }

    /**
     *
     * @param list
     * @param maxValue
     * @param minValue
     * @return возвращаем сумму чисел массива кроме максимального и минимального значения;
     */
    private static Integer getSumWithOutMaxMin(List<Integer> list, Integer maxValue, Integer minValue) {
        sumMaxAndMinimum = maxValue + minValue;
        return list.stream().reduce(-sumMaxAndMinimum, ((p1, p2) -> p1 + p2));
    }

    /**
     *
     * @param list
     * @return возвращаем минимальное значение;
     */
    private static Integer getMinValue(List<Integer> list) {
        return list.stream().min(Integer::compareTo).get();
    }

    /**
     *
     * @param list
     * @return возрващеам максимальное значение;
     */
    private static Integer getMaxValue(List<Integer> list) {
        return list.stream().max(Integer::compareTo).get();
    }

    /**
     *
     * @return сощдаем рандомный массив значений
     */
    private static List<Integer> getIntegers() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= randoAarrayLength; i++) {
            list.add((int) (Math.random() * randoAarrayLength));
        }
        return list;
    }
}
