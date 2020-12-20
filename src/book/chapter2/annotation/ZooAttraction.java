package book.chapter2.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.CONSTRUCTOR,ElementType.METHOD,ElementType.TYPE_USE})
public @interface ZooAttraction {
}
