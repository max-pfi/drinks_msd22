package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DrinkTest {

    private Drink drink;

    @BeforeEach
    public void setUp() {
        drink = new SimpleDrink("Cocktail", new Liquid("Cocktail", 40, 4));
    }

    @Test
    public void testGetName() {
        Assertions.assertEquals("Cocktail", drink.getName());
    }

    @Test
    public void testSetName() {
        drink.setName("Fruit Punch");
        Assertions.assertEquals("Fruit Punch", drink.getName());
    }
}