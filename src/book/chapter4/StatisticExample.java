package book.chapter4;

import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.*;

/**
 * IntStream,DoubleStram,LongStream
 */
public class StatisticExample {

    public static void main(String[] args) {

        IntStream numbersIntStream = IntStream.range(0,10);
        var average = numbersIntStream.average();
        System.out.println(average.getAsDouble());

        //this doublestream generate infinite stream.But we can terminate by using limit...
        DoubleStream numberDoubleStream = DoubleStream.generate((()-> Math.random()));
        var maxDoubleStram = numberDoubleStream.limit(2).max();
        System.out.println(maxDoubleStram.getAsDouble());

        LongStream numberLongStream = LongStream.builder().build();
        System.out.println(numberLongStream.max());

        var ohMy = Stream.of("lions","tigers","bears");
        Double result = ohMy.collect(Collectors.averagingInt(String::length));
        System.out.println(result);

        var ohMy2 = Stream.of("lions","tigers","bears");
        TreeMap<Integer,String> map = ohMy2.collect(Collectors.toMap(String::length,k->k,(s1,s2)->s1 + "," + s2,TreeMap::new));
        System.out.println(map);


    }


}
