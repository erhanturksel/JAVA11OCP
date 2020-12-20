package book.chapter1;

public interface Walk {
    static int a() {
        return 11;
    }

    default int getSpeed() {
        return 5;
    }

    abstract int adf();

    private int erhan() {
        return 1;
    }
}
