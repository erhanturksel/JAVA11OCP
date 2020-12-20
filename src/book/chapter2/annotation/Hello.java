package book.chapter2.annotation;

public class Hello<T> {
    T t;

    public Hello(T t){
        this.t = t;
    }

    @Override
    public String toString() {
       return t.toString();
    }
    private <T> void println(T message){
        System.out.println(message.toString());
    }

    public static void main(String[] args) {
        new Hello<Integer>(5).println(true);
    }
}
