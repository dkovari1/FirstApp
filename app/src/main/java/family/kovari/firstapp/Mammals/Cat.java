package family.kovari.firstapp.Mammals;

/**
 * Created by mark on 2017.06.05..
 * Simple Cat class extends Mammals
 */

public class Cat extends Mammals {


    /*
    *
    * @Constructor of the Cat class
     */
    public Cat(String name, Double weight) {
        super(name, weight);
    }


    /*
    *
    * void funtion -> no return value
    *
    * It is writing out some funny content
     */
    public void meow() {
        System.out.println("My name is " + getName() + ", I am cat and my wright is : " + getWeight() + " kg.\n Meow!");
    }


}
