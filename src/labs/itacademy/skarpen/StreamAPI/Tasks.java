package labs.itacademy.skarpen.StreamAPI;

public class Tasks {
    public static void main(String[] args) {

/*
        IntStream.concat(
                IntStream.range(2, 6),
                IntStream.rangeClosed(-1, 2))
                .forEach(x -> System.out.format("%s, ", +x));

        System.out.println("\n");

        IntStream.range(5, 30)
                .limit(12)
                .skip(3)
                .limit(6)
                .skip(2)
                .forEach(x -> System.out.format("%s, ", +x));

        System.out.println("\n");

        IntStream.range(0, 10)
                .skip(2)
                .dropWhile(x -> x < 5)
                .limit(3)
                .forEach(x -> System.out.print(x + ", ")); // 5 6 7

        System.out.println("\n");

        IntStream.range(0, 10)
                .skip(3)
                .takeWhile(a -> a < 5)
                .limit(3)
                .forEach(a -> System.out.print(a + ", "));//3, 4

        System.out.println("\n");

        IntStream.range(1, 5)
                .flatMap(i -> IntStream.generate(() -> i).limit(i))
                .forEach(i -> System.out.print(i + " "));

        System.out.println("\n");

        int x = IntStream.range(-2, 2)
                .map(i -> i * 5)
                .reduce(10, Integer::sum);
        System.out.println(x); //x : 0


        String str = Math.random() > 0.5 ? "I'm feeling lucky" : null;
        Stream.ofNullable(str)
                .forEach(System.out::println);

        Stream.generate(() -> Math.random() * 11)
                .limit(6)
                .forEach(System.out::println);

        Stream.of("10", "11", "32")
                .map(x -> Integer.parseInt(x, 16))
                .forEach(System.out::println);

        Stream.of(1, 2, 3, 4, 2, 5)
                .dropWhile(x -> x >= 4)
                .forEach(System.out::println);

        long aza = IntStream.range(0, 10)
                .count();
        System.out.println(aza);


        int product = IntStream.range(0, 10)
                .filter(x -> x++ % 4 == 0)
                .reduce((acc, x) -> acc * x)
                .getAsInt();
        System.out.println(product);

        int min = Stream.of(20, 11, 45, 78, 13)
                .min(Integer::compare).get();
        System.out.println(min);

        int max = Stream.of(20, 11, 45, 78, 13)
                .max(Integer::compare).get();
        System.out.println(max);


        LongSummaryStatistics stats = LongStream.range(2, 16)
                .summaryStatistics();
        System.out.format("  count: %d%n", stats.getCount());
        System.out.format("    sum: %d%n", stats.getSum());
        System.out.format("average: %.1f%n", stats.getAverage());
        System.out.format("    min: %d%n", stats.getMin());
        System.out.format("    max: %d%n", stats.getMax());


        Deque<Integer> deque = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toCollection(ArrayDeque::new));


        Set<Integer> set = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        Map<Character, String> map3 = Stream.of(50, 54, 55, 56)
                .collect(Collectors.toMap(
                        i -> (char) i.intValue(),
                        i -> String.format("<%d>", i)
                ));

        ArrayList<Integer> list = new ArrayList<>();


        IntStream.range(1, 5)
                .flatMap(i -> IntStream.generate(() -> i).limit(i))
                .forEach(System.out::println);

        IntStream.range(0, 10)
                .boxed()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0))
                .entrySet().forEach(System.out::println);


        IntStream.range(-5, 0)
                .flatMap(i -> IntStream.of(i, -i))
                .sorted()
                .forEach(System.out::print);
*/
     }
}


