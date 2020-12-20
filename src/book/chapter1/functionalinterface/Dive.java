package book.chapter1.functionalinterface;

@FunctionalInterface
public interface Dive {
    String toString();

    boolean equals(Object a);

    int sum(int a, int b);


}
