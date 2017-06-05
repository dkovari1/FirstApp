package family.kovari.firstapp.Minerals;

import java.util.ArrayList;

/**
 * Created by mark on 2017.06.05..
 * <p>
 * Let's add some attributes to the Mineral //symmetry
 */

public class Feldspar extends Mineral {

    private Symmetry symmetry;

    public Feldspar(String name, ArrayList<Element> elements, Symmetry symmetry) {
        super(name, elements);
    }

    /*
    *@Override
    *
    * because we have a toString funtion without parameter so we have to overwrite it (Override)
    *
     */

    @Override
    public String toString() {

        String ownDescribe = "Feldspar name: " + name;

        String describeOfElements = " it contains: \n";

        for (int index = 0; index < elements.size(); index++) {
            describeOfElements += elements.get(index).toString() + "\n";
        }

        return ownDescribe + describeOfElements + " and the symmetry is :" + symmetry;
    }

}
