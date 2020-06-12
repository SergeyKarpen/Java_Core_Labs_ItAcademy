package labs.itacademy.skarpen.Lesson_9;

import java.util.*;

public class lab9_2 {
    public static void main(String[] args) {
        // Решить задачу подсчета повторяющихся элементов в массиве с помощью HashMap.
        // исходный массив
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Number 1");
        map.put(2, "Number 10");
        map.put(3, "Number 1");
        map.put(4, "Number 1");
        map.put(5, "Number 3");
        map.put(6, "Number 4");
        map.put(7, "Number 3");

        // создание коллекции уникальных значений
        Set<String> mySet = new HashSet<String>();
        for (Integer key : map.keySet()) {
            mySet.add(map.get(key));
        }

        // определение частоты повторов значений из коллекции uniqueSet
        List<String> list = new ArrayList<String>(map.values());
        for (String temp : mySet) {
            System.out.println(temp + ": " + Collections.frequency(list, temp));
        }

    }
}
