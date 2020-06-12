package labs.itacademy.skarpen.secondControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by user on 04.03.2020.
 */
public class Task_2 {

    static int randoAarrayLength = 20;

    public static void main(String[] args) {

        List<Integer> list = getRandomList();

        Integer MostPopularNumber = getIntegerSortedNumber(list);

        System.out.println("Most popular number is " + MostPopularNumber );
    }


    /**
     *
     * @param list сортируем согласно условиям задачи исходный list;
     * @return возраващем сортированный массив;
     */
    private static Integer getIntegerSortedNumber(List<Integer> list) {
        return list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    /**
     *
     * @return возвращаем ранодомный массив значений
     */
    private static List<Integer> getRandomList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= randoAarrayLength; i++) {
            list.add((int) (Math.random() * randoAarrayLength));
        } return list;
    }}
