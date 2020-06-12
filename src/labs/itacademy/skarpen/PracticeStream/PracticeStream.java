package labs.itacademy.skarpen.PracticeStream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PracticeStream {
    public static void main(String[] args) {

        /**Операторы Stream API!

         /**
         * of(T value)/ of(T... values)
         * Стрим для одного или нескольких перечисленных элементов
         */
        Stream.of(1, 2, 3)
                .forEach(System.out::print);

        /**
         * ofNullable(T t)
         * Появился в Java 9. Возвращает пустой стрим, если в качестве аргумента передан null,
         * противном случае, возвращает стрим из одного элемента.
         */
        String str = Math.random() > 0.5 ? "I'm feeling lucky" : null;
        Stream.ofNullable(str)
                .forEach(System.out::print);

        /**
         *generate(Supplier s)!!!!
         * Обязательно ограничивать или будет бесконечный цикл
         *Возвращает стрим с бесконечной последовательностью элементов, генерируемых функцией Supplier s.
         */
        Stream.generate(() -> 6)
                .limit(6)
                .forEach(System.out::print);
        /**
         * iterate​(T seed, UnaryOperator f)
         * Возвращает бесконечный стрим с элементами,
         * которые образуются в результате последовательного применения функции f к итерируемому значению.
         * Первым элементом будет seed, затем f(seed), затем f(f(seed)) и так далее.
         * */
        Stream.iterate(2, x -> x + 6)
                .limit(6)
                .forEach(System.out::println);


        /**
         * iterate​(T seed, Predicate hasNext, UnaryOperator f)
         * Появился в Java 9. Всё то же самое, только добавляется ещё один аргумент hasNext:
         * если он возвращает false,
         * то стрим завершается. Это очень похоже на цикл for:
         */
        Stream.iterate(2, x -> x < 25, x -> x + 6)
                .forEach(System.out::println);

        /**
         * concat(Stream a, Stream b)
         * Объединяет два стрима так, что вначале идут элементы стрима A,
         * а по его окончанию последуют элементы стрима B.
         */
        Stream.concat(
                Stream.of(1, 2, 3),
                Stream.of(4, 5, 6))
                .forEach(System.out::print);

        /**
         * builder()
         * Создаёт мутабельный объект для добавления элементов
         * в стрим без использования какого-либо контейнера для этого.
         */
        Stream.Builder<Integer> streamBuider = Stream.<Integer>builder()
                .add(0)
                .add(1);
        for (int i = 2; i <= 8; i += 2) {
            streamBuider.accept(i);
        }
        streamBuider
                .add(9)
                .add(10)
                .build()
                .forEach(System.out::println);

        /**
         * IntStream.range​(int startInclusive, int endExclusive)
         * LongStream.range​(long startInclusive, long endExclusive)
         * Создаёт стрим из числового промежутка [start..end), то есть от start (включительно) по end.

         */
        IntStream.range(0, 10)
                .forEach(System.out::println);

        LongStream.range(-10L, -5L)
                .forEach(System.out::println);

        /**
         * IntStream.rangeClosed​(int startInclusive, int endInclusive)
         * LongStream.range​Closed(long startInclusive, long endInclusive)
         * Создаёт стрим из числового промежутка [start..end], то есть от start (включительно) по end (включительно).
         */

        IntStream.rangeClosed(0, 5)
                .forEach(System.out::println);

        LongStream.range(-8L, -5L)
                .forEach(System.out::println);


        /**
         * Промежуточные операторы
         */

        /**filter​(Predicate predicate)
         * Фильтрует стрим, принимая только те элементы,
         * которые удовлетворяют заданному условию.
         */
        Stream.of(120, 410, 85, 32, 314, 12)
                .filter(x -> x > 100)
                .forEach(System.out::println);// 120, 410, 314

        /**
         * map​(Function mapper)
         * Применяет функцию к каждому элементу и затем возвращает стрим,
         * в котором элементами будут результаты функции.
         * map можно применять для изменения типа элементов.
         */
        Stream.of("3", "4", "5")
                .map(Integer::parseInt)
                .map(x -> x + 10)
                .forEach(System.out::println);// 13, 14, 15

        Stream.of(120, 410, 85, 32, 314, 12)
                .map(x -> x + 11)
                .forEach(System.out::println);// 131, 421, 96, 43, 325, 23

        /**
         * limit​(long maxSize)
         * Ограничивает стрим maxSize элементами.
         */
        Stream.of(120, 410, 85, 32, 314, 12)
                .limit(4)
                .forEach(System.out::println);// 120, 410, 85, 32

        /**
         * skip​(long n)
         * Пропускает n элементов стрима.
         */
        Stream.of(120, 410, 85, 32, 314, 12)
                .skip(2)
                .forEach(System.out::println);// 85, 32, 314,
        /**
         * sorted​() / sorted​(Comparator comparator)
         * Сортирует элементы стрима
         */
        IntStream.range(0, 100000000)
                .sorted()
                .limit(3)
                .forEach(System.out::println);// 0, 1, 2

        /**
         * distinct​()
         * Убирает повторяющиеся элементы и возвращаем стрим с уникальными элементами.
         */
        IntStream.concat(
                IntStream.range(2, 5),
                IntStream.range(0, 4))
                .distinct();

        /**
         * peek​(Consumer action)
         *Выполняет действие над каждым элементом стрима и при этом возвращает стрим с элементами исходного стрима.
         * Служит для того, чтобы передать элемент куда-нибудь,
         * не разрывая при этом цепочку операторов
         */
        Stream.of(0, 3, 0, 0, 5)
                .peek(x -> System.out.format("before distinct: %d%n", x))
                .distinct()
                .peek(x -> System.out.format("after distinct: %d%n", x))
                .map(x -> x * x)
                .forEach(x -> System.out.format("after map: %d%n", x));

        /**
         * takeWhile​(Predicate predicate)
         * Появился в Java 9. Возвращает элементы до тех пор, пока они удовлетворяют условию, то есть функция-предикат возвращает true. Это как limit, только не с числом, а с условием.
         */
        Stream.of(1, 2, 3, 4, 2, 5)
                .takeWhile(x -> x < 3)
                .forEach(System.out::println); // 1, 2

        /**!!!!!!!!!!!!!!
         * dropWhile​(Predicate predicate)
         * Пропускает элементы до тех пор, пока они удовлетворяют условию,
         * затем возвращает оставшуюся часть стрима. Если предикат вернул для первого элемента false,
         * то ни единого элемента не будет пропущено.
         * Оператор подобен skip, только работает по условию.
         */
        Stream.of(1, 2, 3, 4, 2, 5)
                .dropWhile(x -> x >= 3)
                .forEach(System.out::println);// 1, 2, 3, 4, 2, 5

        Stream.of(1, 2, 3, 4, 2, 5)
                .dropWhile(x -> x < 3)
                .forEach(System.out::println);// 3, 4, 2, 5

        /**
         * boxed()
         * Преобразует примитивный стрим в объектный.
         * */
        DoubleStream.of(0.1, Math.PI)
                .boxed()
                .map(Object::getClass)
                .forEach(System.out::println);
        // class java.lang.Double
        // class java.lang.Double


    }
}
