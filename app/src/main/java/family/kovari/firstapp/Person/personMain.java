package family.kovari.firstapp.Person;

/**
 * Created by mark on 2017.06.05..
 *
 */

public class personMain {
    /*
    *
    * This is the pert of the code, that you can run (simplified)
     */
    public static void main(String[] args) {

        Person johnSmith = new Person("John Smith", 180);

        /*
        *
        * This command is writing a line of code, that is inside the parenthesis
         */
        System.out.println(johnSmith.englishGreeting());


        System.out.println(johnSmith.hungarianGreeting());

        /*
        * Because the inner data (name) is public we can reach it
        *
         */

        System.out.println(johnSmith.name);
    }
}
