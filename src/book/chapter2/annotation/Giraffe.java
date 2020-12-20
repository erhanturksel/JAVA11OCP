package book.chapter2.annotation;

import java.lang.annotation.Target;

public class Giraffe {
    @Music(genres = {"Rock and roll"}) String mostDisliked;
    @Music(genres = "Classical") String favorite;
}
