package book.chapter1.functionalinterface;

import java.util.function.Predicate;

public class Crow {
    private String color;

    public void caw(String name) {
        String volume = "loundly";
        color = "allowed";
        name = "not allowed";
        volume = "not allowed";

        String finalName = name;
        String finalVolume = volume;
        Predicate<String> p = s -> (finalName + finalVolume + color).length() == 9;
    }
}
