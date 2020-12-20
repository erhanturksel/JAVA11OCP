package book.chapter2.annotation;

import java.util.Arrays;
import java.util.UUID;

@Excersice(hoursPerDay = 11)
public class Cheetah {

    @SafeVarargs
    public static  void eat(int... a){
        UUID.randomUUID();
    }

    @SafeVarargs
    protected final void drink(String...cup){

    }
}
