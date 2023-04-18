package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;
public class Main {

    // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
    //  field.
    public static void main(String[] args) {
        Case menu = new Case();
        //To sort the flavors list, first create a new FlavorComparator object.
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        System.out.println("Before: ");
        for(Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }

        Comparator comparator = new FlavorComparator();
        flavors.sort(comparator);
        //these lines could be replaced with the below line, it creates a new instance directly into sort method
        //flavors.sort(new FlavorComparator());

        System.out.println("After: ");

        for(Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }


        System.out.println("Before: ");
        for(Cone cone : cones) {
            System.out.println(cone.getCost());
        }

        cones.sort(new ConeComparator());

        System.out.println("After: ");
        for(Cone cone : cones) {
            System.out.println(cone.getCost());
        }
    }

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.


}

