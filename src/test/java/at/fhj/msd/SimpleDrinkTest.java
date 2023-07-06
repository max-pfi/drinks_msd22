/**
 * This is a Test class for the SimpleDrink class.
 * It provides a set of test cases to check the behavior of methods of the SimpleDrink class.
 *
 * @author Max Pfisterer
 */
package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleDrinkTest {
    private Liquid water;
    private Liquid rum;
    private Liquid cola;
    private SimpleDrink rumGlass;
    private SimpleDrink waterGlass;

    /**
     * Sets up the test environment by creating instances of Liquid and SimpleDrink objects.
     */
    @BeforeEach
    public void setUp() {
        water = new Liquid("Water", 0.5, 0);
        rum = new Liquid("Rum", 0.2, 30);

        rumGlass = new SimpleDrink("rumGlass", rum);
        waterGlass = new SimpleDrink("WaterGlass", water);
    }

    /**
     * Tests the getVolume() method of the SimpleDrink class.
     * Asserts that the volume of the drink matches the expected value.
     */
    @Test
    public void testGetVolume() {
        Assertions.assertEquals(0.5, waterGlass.getVolume());
    }

    /**
     * Tests the getAlcoholPercent() method of the SimpleDrink class for a drink with alcohol.
     * Asserts that the alcohol percentage of the drink matches the expected value.
     */
    @Test
    public void testGetAlcoholPercentWithAlcohol() {
        Assertions.assertEquals(30, rumGlass.getAlcoholPercent());
    }

    /**
     * Tests the getAlcoholPercent() method of the SimpleDrink class for a drink without alcohol.
     * Asserts that the alcohol percentage of the drink is 0.
     */
    @Test
    public void testGetAlcoholPercentWithoutAlcohol() {
        Assertions.assertEquals(0, waterGlass.getAlcoholPercent());
    }

    /**
     * Tests the isAlcoholic() method of the SimpleDrink class for a drink with alcohol.
     * Asserts that the drink is considered alcoholic.
     */
    @Test
    public void testIsAlcoholicWithAlcohol() {
        Assertions.assertTrue(rumGlass.isAlcoholic());
    }

    /**
     * Tests the isAlcoholic() method of the SimpleDrink class for a drink without alcohol.
     * Asserts that the drink is not considered alcoholic.
     */
    @Test
    public void testIsAlcoholicWithoutAlcohol() {
        Assertions.assertFalse(waterGlass.isAlcoholic());
    }
}