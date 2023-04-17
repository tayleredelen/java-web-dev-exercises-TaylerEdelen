package org.launchcode.java.demos.lsn7interfaces;
import java.util.Comparator;


//To display a menu for your customers, you need to sort the ice cream prices in order

public class ConeComparator implements Comparator<Cone> {
    //new class called ConeComparator that implements the Comparator interface

    @Override
    //@Override method that compares two Cone objects
    public int compare(Cone o1, Cone o2) {
        if (o1.getCost() - o2.getCost() < 0) {
            return -1;
        } else if (o1.getCost() - o2.getCost() > 0) {
            return 1;
        } else {
            return 0;
        }
    }

}