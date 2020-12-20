package book.chapter2.annotation;

public @interface Injured {

    String veterinarian() default "unassigned";

    String value() default "folt";

    int age() default 1;
}
