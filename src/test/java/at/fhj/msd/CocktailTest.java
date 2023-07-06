package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CocktailTest {

    private Cocktail cocktail;
    private List<Liquid> ingredients;

    /**
     * Sets up the test environment by creating instances of Cocktail and Liquid objects.
     */
    @BeforeEach
    public void setup() {
        Liquid l1 = new Liquid("Rum", 0.5, 40);
        Liquid l2 = new Liquid("Cola", 1.5, 0);
        ingredients = Arrays.asList(l1, l2);
        cocktail = new Cocktail("Cuba Libre", ingredients);
    }

    /**
     * Tests the getVolume() method of the Cocktail class.
     * Calculates the expected volume as the average of the volumes of the liquids
     * and asserts that it is equal to the actual volume of the cocktail.
     */
    @Test
    public void testGetVolume() {

        assertEquals(1.0, cocktail.getVolume(), "Expected volume of the cocktail to be 1.0");

    }

    /**
     * Tests the getAlcoholPercent() method of the Cocktail class.
     * Calculates the expected alcohol percent as the average of the alcohol percentages of the liquids
     * and asserts that it is equal to the actual alcohol percent of the cocktail.
     */
    @Test
    public void testGetAlcoholPercent() {

        assertEquals(20, cocktail.getAlcoholPercent(), "Expected alcohol percent of the cocktail to be 20");

    }

    /**
     * Tests the isAlcoholic() method of the Cocktail class.
     * Asserts that the cocktail is considered alcoholic.
     */
    @Test
    public void testIsAlcoholicTrue() {
        assertTrue(cocktail.isAlcoholic(), "Expected the cocktail to be alcoholic");
    }

    /**

     Tests the isAlcoholic() method of the Cocktail class for a non-alcoholic cocktail.

     Creates two Liquid objects representing non-alcoholic ingredients (juice and water),

     sets them as the ingredients of the cocktail, and asserts that the cocktail is considered non-alcoholic.
     */
    @Test
    public void testIsAlcoholicFalse() {
        Liquid l1 = new Liquid("Juice", 0.5, 0);
        Liquid l2 = new Liquid("Water", 1.5, 0);
        List<Liquid> ingredients = Arrays.asList(l1, l2);
        cocktail.setIngredients(ingredients);

        assertFalse(cocktail.isAlcoholic(), "Expected the cocktail to be non-alcoholic");
    }
    /**
     * Tests the getIngredients() method of the Cocktail class.
     * Asserts that the returned list of ingredients matches the original list.
     */
    @Test
    public void testGetIngredients() {
        assertEquals(ingredients, cocktail.getIngredients(), "Expected the same list of ingredients");
    }

    /**
     * Tests the setIngredients() method of the Cocktail class.
     * Creates a new Liquid object and sets it as the only ingredient of the cocktail.
     * Asserts that the new ingredient is correctly set.
     */
    @Test
    public void testSetIngredients() {
        Liquid l1 = new Liquid("Gin", 0.5, 37.5);
        Liquid l2 = new Liquid("Tonic Water", 1.5, 0);
        List<Liquid> newIngredients = Arrays.asList(l1, l2);
        cocktail.setIngredients(newIngredients);

        assertEquals(newIngredients, cocktail.getIngredients(), "Expected the new list of ingredients");
    }
}