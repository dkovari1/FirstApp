package family.kovari.firstapp.Mammals;

/**
 * Created by mark on 2017.06.05..
 * <p>
 * Mammal class representing the mammals
 */

public class Mammals {

    private String name;
    private Double weight;

    public Mammals(String name, Double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
