package book.chapter4;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Grouping,Partitioning and mapping exp...
 */
public class GroupingExp {

    public static void main(String[] args) {
        var ohMy = Stream.of("lions","tigers","bears");

        Map<Integer, List<String>> map = ohMy.collect(Collectors.groupingBy(String::length));
        System.out.println(map); //{5=[lions, bears], 6=[tigers]}


        var ohMy2 = Stream.of("lions","tigers","bears");

        Map<Boolean, List<String>> map2 = ohMy2.collect(Collectors.partitioningBy(s -> s.length() <= 5));
        System.out.println(map2); //{false=[tigers], true=[lions, bears]}


        var ohMy3 = Stream.of("lions", "tigers", "bears");

        Map<Integer, Long> map3 = ohMy3.collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(map3); // {5=2, 6=1}

        //infinite stream
        Stream<Integer> infiniteStream = Stream.iterate(1, i -> i + 2);
        infiniteStream.limit(3).forEach(System.out::println);


        Predicate<String> predicate = s -> s.length() > 3;
        var iterateStream = Stream.iterate("-", s -> !s.isEmpty(), (s) -> s + s);
        var b1 = iterateStream.noneMatch(predicate);
        var b2 = iterateStream.anyMatch(predicate);
        System.out.println(b1 + " " + b2);


    }
}
