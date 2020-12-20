package book.chapter2.annotation;

import java.util.*;

public class QuestionExp {

    public static void main(String[] args) {
        var greetings = new LinkedList<String>();
        greetings.offer("hello");
        greetings.offer("hi");
        greetings.offer("ola");

        greetings.pop();
        greetings.peek();
        while (greetings.peek() != null) {
            System.out.println(greetings.pop());
        }

        var map = Map.of(1, 2, 3, 6);
        var list = List.copyOf(map.entrySet());

       Set<?> set = Set.of("lion","tiger","bear");
       var s = Set.copyOf(set);
       s.forEach(System.out::println);

    }
}
