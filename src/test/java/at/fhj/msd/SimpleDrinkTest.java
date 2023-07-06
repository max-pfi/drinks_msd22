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

    @BeforeEach
    public void setUp() {
        water = new Liquid("Water", 0.5, 0);
        rum = new Liquid("Rum", 0.2, 30);


        rumGlass = new SimpleDrink("rumGlass", rum);
        waterGlass = new SimpleDrink("WaterGlass", water);
    }

    @Test
    public void testGetVolume() {
        Assertions.assertEquals(0.5, waterGlass.getVolume());
    }

    @Test
    public void testGetAlcoholPercentWithAlcohol() {
        Assertions.assertEquals(30, rumGlass.getAlcoholPercent());
    }

    @Test
    public void testGetAlcoholPercentWithoutAlcohol() {
        Assertions.assertEquals(0, waterGlass.getAlcoholPercent());
    }

    @Test
    public void testIsAlcoholicWithAlcohol() {
        Assertions.assertTrue(rumGlass.isAlcoholic());
    }

    @Test
    public void testIsAlcoholicWithoutAlcohol() {
        Assertions.assertFalse(waterGlass.isAlcoholic());
    }

}
