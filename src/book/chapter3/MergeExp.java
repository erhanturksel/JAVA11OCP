package book.chapter3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MergeExp {
    public static void main(String[] args) {
        BiFunction<String, String, String> mapper = (v1, v2) -> v2.length() > v2.length() ? v1 : v2;

        Map<String,String> favorites = new HashMap<>();
        favorites.put("Jenny","Bus Tour");
        favorites.put("Tom",null);

        String jenny = favorites.merge("Jenny","Skyride",mapper);
        String tom = favorites.merge("Tom","Skyride",mapper);
        System.out.println(favorites);
        System.out.println(jenny);
        System.out.println(tom);
    }
}
