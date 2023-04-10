package org.launchcode.java.demos.lsn5unittesting.test;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

public class CarTest {

    Car test_car;
    @Before
    public void createCarObject() {
        Car test_car = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)

//    @Test
//    public void emptyTest() {
//        assertEquals(10,10,.001);
//    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank() {
//        Car test_car = new Car("Toyota", "Prius", 10, 50);
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }

    //Write another version of testInitialGasTank() using assertFalse(), comparing the value to 0.
    @Test
    public void testInitialGasTankFalse() {
        assertFalse(test_car.getGasTankLevel() == 0);
    }

    //Write another version of testInitialGasTank() using assertTrue()
    @Test
    public void testInitialGasTankTrue() {
        assertTrue(test_car.getGasTankLevel() == 10);
    }

    //TODO: gasTankLevel is accurate after driving within tank range

    @Test
    public void testGasTankAfterDriving() {
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(), .001); //delta means "is it + or - .001 from what we expect?"
    }

    //TODO: gasTankLevel is accurate after attempting to drive past tank range

    @Test
    public void testGasTankAfterExceedingTankRange() {
        //simulate the Car travelling farther than it's gasTankLevel allows
        //Total Miles = miles per gallon * tank size
        //Total miles we can travel is 500 (10 * 50 from test_car)
        //Expected odometer is 500 when tank is empty
        test_car.drive(600);
        assertEquals(500, test_car.getOdometer(), .001); //delta means "is it + or - .001 from what we expect?"

    }

    //TODO: can't have more gas than tank size, expect an exception

    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException() {
        test_car.addGas(5);
        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank.");
    }


}
