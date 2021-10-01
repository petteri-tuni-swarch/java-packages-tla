package fi.ithou.javacore.packages.dependent;

import fi.ithou.javacore.packages.pkg1.*;

public class App {

    public static void main(String[] args) {

        System.out.println("TLA Java-Core demo: Using external Maven projects - "+App.class);
        TiTeCar car = new TiTeCar("Tite X21");
        System.out.println(car.toString());

    }
}
