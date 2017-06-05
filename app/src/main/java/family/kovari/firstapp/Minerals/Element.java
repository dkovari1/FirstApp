package family.kovari.firstapp.Minerals;

/**
 * Created by mark on 2017.06.05..
 * <p>
 * <p>
 * A class to represent elements
 */


/*
*
* @Class Element
* @name name of the element
* @numberOFAtoms number of atoms
*
*
 */
public class Element {

    public String name;

    public Integer numberOFAtoms;

    /*
    *
    * @Constructor with inner data
     */

    public Element(String name, Integer numberOFAtoms) {
        this.name = name;
        this.numberOFAtoms = numberOFAtoms;
    }

    @Override
    public String toString() {
        return "element name: " + name + ", number of atoms : " + numberOFAtoms;
    }
}
