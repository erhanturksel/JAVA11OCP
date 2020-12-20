package book.chapter2.annotation;

public @interface Excersice {

    int hoursPerDay();

    int startHour() default 9;

}
