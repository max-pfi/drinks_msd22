package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CocktailTest {

    private Cocktail cocktail;
    private List<Liquid> ingredients;

    @BeforeEach
    public void setup() {
        Liquid l1 = new Liquid("Rum", 0.5, 40);
        Liquid l2 = new Liquid("Cola", 1.5, 0);
        ingredients = Arrays.asList(l1, l2);
        cocktail = new Cocktail("Cuba Libre", ingredients);
    }

    @Test
    public void testGetVolume() {
        assertEquals(1.0, cocktail.getVolume(), "Expected volume of the cocktail to be 1.0");
    }

    @Test
    public void testGetAlcoholPercent() {
        assertEquals(20, cocktail.getAlcoholPercent(), "Expected alcohol percent of the cocktail to be 20");
    }

    @Test
    public void testIsAlcoholicTrue() {
        assertTrue(cocktail.isAlcoholic(), "Expected the cocktail to be alcoholic");
    }

    @Test
    public void testIsAlcoholicFalse() {
        Liquid l1 = new Liquid("Juice", 0.5, 0);
        Liquid l2 = new Liquid("Water", 1.5, 0);
        ingredients = Arrays.asList(l1, l2);
        cocktail.setIngredients(ingredients);

        assertFalse(cocktail.isAlcoholic(), "Expected the cocktail to be non-alcoholic");
    }

    @Test
    public void testGetIngredients() {
        assertEquals(ingredients, cocktail.getIngredients(), "Expected the same list of ingredients");
    }

    @Test
    public void testSetIngredients() {
        Liquid l1 = new Liquid("Gin", 0.5, 37.5);
        Liquid l2 = new Liquid("Tonic Water", 1.5, 0);
        List<Liquid> newIngredients = Arrays.asList(l1, l2);
        cocktail.setIngredients(newIngredients);

        assertEquals(newIngredients, cocktail.getIngredients(), "Expected the new list of ingredients");
    }
}