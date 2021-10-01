package fi.ithou.javacore.packages.pkg1;

public class GenericCar {

    private String model;

    public GenericCar (String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        String ret = "Generic Car. Model: " + this.model;
        return ret;
    }

}
