package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class CocktailTest {

    private Cocktail cocktail;
    private Liquid l1;
    private Liquid l2;

    /**
     * Sets up the test environment by creating instances of Cocktail and Liquid objects.
     */
    @BeforeEach
    public void setUp() {
        l1 = new Liquid("Rum", 0.04, 40);
        l2 = new Liquid("Cola", 0.15, 0);
        cocktail = new Cocktail("RumCola", Arrays.asList(l1, l2));
    }

    /**
     * Tests the getVolume() method of the Cocktail class.
     * Calculates the expected volume as the average of the volumes of the liquids
     * and asserts that it is equal to the actual volume of the cocktail.
     */
    @Test
    public void testGetVolume() {
        double expected = (l1.getVolume() + l2.getVolume()) / 2;
        Assertions.assertEquals(expected, cocktail.getVolume());
    }

    /**
     * Tests the getAlcoholPercent() method of the Cocktail class.
     * Calculates the expected alcohol percent as the average of the alcohol percentages of the liquids
     * and asserts that it is equal to the actual alcohol percent of the cocktail.
     */
    @Test
    public void testGetAlcoholPercent() {
        double expected = (l1.getAlcoholPercent() + l2.getAlcoholPercent()) / 2;
        Assertions.assertEquals(expected, cocktail.getAlcoholPercent());
    }

    /**
     * Tests the isAlcoholic() method of the Cocktail class.
     * Asserts that the cocktail is considered alcoholic.
     */
    @Test
    public void testIsAlcoholic() {
        Assertions.assertTrue(cocktail.isAlcoholic());
    }

    /**
     * Tests the getIngredients() method of the Cocktail class.
     * Asserts that the returned list of ingredients matches the original list.
     */
    @Test
    public void testGetIngredients() {
        Assertions.assertEquals(Arrays.asList(l1, l2), cocktail.getIngredients());
    }

    /**
     * Tests the setIngredients() method of the Cocktail class.
     * Creates a new Liquid object and sets it as the only ingredient of the cocktail.
     * Asserts that the new ingredient is correctly set.
     */
    @Test
    public void testSetIngredients() {
        Liquid l3 = new Liquid("Gin", 0.05, 40);
        cocktail.setIngredients(Arrays.asList(l3));
        Assertions.assertEquals(Arrays.asList(l3), cocktail.getIngredients());
    }
}