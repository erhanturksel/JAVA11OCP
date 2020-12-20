package book.chapter2.annotation;

public @interface Fluffy {
    static final int MAX_VOLTAGE = 11;

    int cuteness();

    abstract int softness() default 11;

    //access modifier conflicts with public...
    //protected Material material();

    //it cannot be marked final...
    //final boolean isBunny();

}
