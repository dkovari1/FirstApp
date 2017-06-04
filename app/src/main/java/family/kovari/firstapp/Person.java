package family.kovari.firstapp;

/**
 * Created by mark on 2017.06.05..
 * Person class tutorial
 */

public class Person {

    public String name;
    public Integer height;

    public Person(String name, Integer height) {
        this.name = name;
        this.height = height;
    }

    public String englishGreeting() {

        return "Hi, I am " + name + " nice to meet you. ";
    }

    public String hungarianGreeting() {
        return "Szia, a nevem " + name + ", örülök, hogy megismerhettelek.";
    }
}
