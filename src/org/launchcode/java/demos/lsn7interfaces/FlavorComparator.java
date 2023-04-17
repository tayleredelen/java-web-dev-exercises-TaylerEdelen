package org.launchcode.java.demos.lsn7interfaces;
import java.util.Comparator;


//To display a menu for your customers, you need to sort the ice cream flavors alphabetically by their name field.

public class FlavorComparator implements Comparator<Flavor> {
    //new class called FlavorComparator that implements the Comparator interface

    @Override
    //@Override method that compares two Flavor objects
    public int compare(Flavor o1, Flavor o2) {
        return o1.getName().compareTo(o2.getName());
        //This returns an integer (negative, positive, or zero)
        //depending on whether Flavor object o1 or o2 comes first, alphabetically.
    }

}
