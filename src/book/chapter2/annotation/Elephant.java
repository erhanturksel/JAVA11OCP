package book.chapter2.annotation;

public abstract class Elephant {

    //there must be value() method to use this feature.
    @Injured("Legs") public void fallDown(){}
    @Injured(value = "Legs") public abstract  int trip();
    @Injured String injures[];

}
