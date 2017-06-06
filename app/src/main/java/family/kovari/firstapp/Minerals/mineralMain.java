package family.kovari.firstapp.Minerals;

import java.util.ArrayList;

/**
 * Created by mark on 2017.06.05..
 * <p>
 * Main runnapble program with Minerals
 */

public class mineralMain {

    /*
    *Runnable method
     */
    public static void main(String[] args) {

        //TODO @David or @Daniel please correct the values


        /*
        *Creating some Elements
         */


        //TODO this is a new TODO github

        Element sodium = new Element("Sodium", 10);
        Element natrium = new Element("Natrium", 11);
        Element silicium = new Element("Silicium", 11);
        Element oxygen = new Element("Oxygen", 8);


        /*
        *put them into an arrayList
         */

        ArrayList<Element> minerContains = new ArrayList<Element>();

        minerContains.add(sodium);
        minerContains.add(natrium);
        minerContains.add(silicium);
        minerContains.add(oxygen);

        /*
        *
        * Create a Mineral (Albit, with the rigth attributes)
         */

        Mineral NaAlSi3O8Mineral = new Mineral("NátriumAlumíniumSzilícium3Oxigén8 - Albit", minerContains);

        /*
        *Than print what is our object
         */

        System.out.println(NaAlSi3O8Mineral.toString());


        Feldspar NaAlSi3O8Feldspar = new Feldspar("NátriumAlumíniumSzilícium3Oxigén8 - Albit", minerContains, Symmetry.REGULAR);


        /*
        *
        * So the basic difference between the NaAlSi3O8Feldspar and the NaAlSi3O8Mineral that the Feldspar has got one more attribute (symmetry)
         */

        System.out.println(NaAlSi3O8Feldspar.toString());

    }
}
