package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DrinkTest {

    private Drink drink;

    /**
     * Sets up the test environment by creating an instance of the SimpleDrink object.
     */
    @BeforeEach
    public void setUp() {
        drink = new SimpleDrink("Cocktail", new Liquid("Cocktail", 40, 4));
    }

    /**
     * Tests the getName() method of the Drink class.
     * Asserts that the name of the drink matches the expected value.
     */
    @Test
    public void testGetName() {
        Assertions.assertEquals("Cocktail", drink.getName());
    }

    /**
     * Tests the setName() method of the Drink class.
     * Sets a new name for the drink and asserts that the name is correctly updated.
     */
    @Test
    public void testSetName() {
        drink.setName("Fruit Punch");
        Assertions.assertEquals("Fruit Punch", drink.getName());
    }