package book.chapter2.annotation;

public @interface Hazard {
    public static final int UNKNOWN = -1;

    int danger();

    public String description() default "Fire";
}
