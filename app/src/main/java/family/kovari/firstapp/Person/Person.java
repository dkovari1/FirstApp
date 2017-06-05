package family.kovari.firstapp.Person;

/**
 * Created by mark on 2017.06.05..
 * Person class tutorial
 */

public class Person {

    /*
    *
    *public inner data
    *
    * A string name
    * An integer height
     */

    public String name;
    public Integer height;


    /*
    *Contsructor - this function is called, when a new object is created
    *@param name : name of the person
    *@param height : height of the person
     */
    public Person(String name, Integer height) {
        this.name = name;
        this.height = height;
    }

    /*
    *
    * A function with no parameters
    * return value String (english greeting)
     */

    public String englishGreeting() {

        return "Hi, I am " + name + " nice to meet you. ";
    }

     /*
    *
    * A function with no parameters
    * return value String (hungarian greeting)
     */


    public String hungarianGreeting() {
        return "Szia, a nevem " + name + ", örülök, hogy megismerhettelek.";
    }
}
