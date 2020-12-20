package book.chapter1;

import book.chapter1.functionalinterface.Dive;

import java.util.function.Predicate;

public class Cat implements Walk, Run {

    public static void main(String[] args) {
        Dive dive  = (a, b) -> 10;
        System.out.println(dive.sum(3,4));

    }

    int getWalkSpeed() {

        return Walk.super.getSpeed();
    }

/*
    public void variables(int a){
        int b = 1;
        Predicate<Integer> p1 = a->{
            int b = 0;
            int c = 0;
            return b == c;
        };
    }*/

    @Override
    public int getSpeed() {
        return 100;
    }

    @Override
    public int adf() {
        return 0;
    }
}
