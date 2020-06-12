package labs.itacademy.skarpen.StreamAPI;

import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task_1 {
    public static void main(String[] args) {

        /**
         *1*. Сформируй часть запроса WHERE используя StringBuilder(не обязательно).
         * Если значение null, то параметр не должен попадать в запрос. Пример:
         * {"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
         * Результат: "name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
         */

        HashMap<String, String> MyMap = new HashMap<>();
        MyMap.put("name", "Ivanov");
        MyMap.put("country", "Ukraine");
        MyMap.put("city", "Kiev");
        MyMap.put("age", null);

        System.out.println(Where(MyMap));
    }

    public static String Where(HashMap<String, String> list) {
        return list.entrySet().stream().filter(x -> x.getValue() != null).flatMap(x -> Stream.of(x.getKey() + " = " + "'" + x.getValue() + "'")).collect(Collectors.joining(" and "));
    }
}


