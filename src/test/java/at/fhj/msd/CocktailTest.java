package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class CocktailTest {

    private Cocktail cocktail;
    private Liquid l1;
    private Liquid l2;

    @BeforeEach
    public void setUp() {
        l1 = new Liquid("Rum", 0.04, 40);
        l2 = new Liquid("Cola", 0.15, 0);
        cocktail = new Cocktail("RumCola", Arrays.asList(l1, l2));
    }

    @Test
    public void testGetVolume() {
        // Expected volume is average of the volumes of the liquids
        double expected = (l1.getVolume() + l2.getVolume()) / 2;
        Assertions.assertEquals(expected, cocktail.getVolume());
    }

    @Test
    public void testGetAlcoholPercent() {
        // Expected alcohol percent is average of the alcohol percentages of the liquids
        double expected = (l1.getAlcoholPercent() + l2.getAlcoholPercent()) / 2;
        Assertions.assertEquals(expected, cocktail.getAlcoholPercent());
    }

    @Test
    public void testIsAlcoholic() {
        Assertions.assertTrue(cocktail.isAlcoholic());
    }

    @Test
    public void testGetIngredients() {
        Assertions.assertEquals(Arrays.asList(l1, l2), cocktail.getIngredients());
    }

    @Test
    public void testSetIngredients() {
        Liquid l3 = new Liquid("Gin", 0.05, 40);
        cocktail.setIngredients(Arrays.asList(l3));
        Assertions.assertEquals(Arrays.asList(l3), cocktail.getIngredients());
    }
}