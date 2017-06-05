package family.kovari.firstapp.Minerals;

import java.util.ArrayList;

/**
 * Created by mark on 2017.06.05..
 * <p>
 * Basic Mineral class, that holds elements
 */


/*
*
* Mineral class
* @name String : name of the mineral
* @elements  ArrayList<Element> : list of elements
 */

public class Mineral {

    //TODO make the data private and add getters-setters

    public String name;

    public ArrayList<Element> elements;

    //TODO add more attributes and funtions

    /*
    *@Constructor
    * @parameter inner data
     */

    public Mineral(String name, ArrayList<Element> elements) {
        this.name = name;
        this.elements = elements;
    }

    /*
    * @Override
    * toString()  return value, the characteric representation of class
     */
    @Override
    public String toString() {
        String ownDescibe = "Mineral name: " + name;

        String describeOfElements = " it contains: \n";

        for (int index = 0; index < elements.size(); index++) {
            describeOfElements += elements.get(index).toString() + "\n";
        }

        return ownDescibe + describeOfElements;
    }

}
