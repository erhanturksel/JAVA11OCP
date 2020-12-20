package book.chapter2.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class RetentionExp {

    public static void main(String[] args) {
        @RetentionSource
        class B {
        }
        assert B.class.getAnnotations().length == 0;
        @RetentionClass
        class C {
        }
        assert C.class.getAnnotations().length == 0;
        @RetentionRuntime
        class D {
        }
        assert D.class.getAnnotations().length == 0;

    }

    @Retention(RetentionPolicy.SOURCE)
    @interface RetentionSource {
    }


    @Retention(RetentionPolicy.CLASS)
    @interface RetentionClass {
    }

    @Retention(RetentionPolicy.RUNTIME)
    @interface RetentionRuntime {
    }


}
