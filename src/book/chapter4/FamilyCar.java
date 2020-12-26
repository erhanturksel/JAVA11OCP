package book.chapter4;

import java.io.Closeable;

public class FamilyCar {

    public static void main(String[] args) {
        var d = new Door();
        try (d; var v = new Window()) {
            System.out.println("T");
        } catch (Exception e) {
            System.out.println("E");
        } finally {
            System.out.println("F");
        }

        //TWDEF...
    }

    static class Door implements AutoCloseable {

        @Override
        public void close() {
            System.out.println("D");
        }
    }

    static class Window implements Closeable {

        @Override
        public void close() {
            System.out.println("W");
            throw new RuntimeException();
        }
    }
}
