package family.kovari.firstapp.Mammals;

/**
 * Created by mark on 2017.06.05..
 */

public class Dog extends Mammals {

    /*
    *
    * @Constructor of the Dog class
     */

    public Dog(String name, Double weight) {
        super(name, weight);
    }


    /*
    *
    * void funtion -> no return value
    *
    * It is writing out some funny content
     */
    public void bark() {
        System.out.println("My name is " + getName() + ", I am a dog and my weight is: " + getWeight() + " kg.\n BARK!");
    }
}
