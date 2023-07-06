package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleDrinkTest {
    private Liquid water;
    private Liquid rum;
    private Liquid cola;
    private SimpleDrink colaRum;
    private SimpleDrink waterGlass;

    @BeforeEach
    public void setUp() {
        water = new Liquid("Water", 0.5, 0);
        rum = new Liquid("Rum", 0.2, 30);
        cola = new Liquid("Cola", 0.3, 0);

        colaRum = new SimpleDrink("ColaRum", cola);
        waterGlass = new SimpleDrink("WaterGlass", water);
    }

    @Test
    public void testGetVolume() {
        Assertions.assertEquals(waterGlass.getVolume(), 0.5);
    }

    @Test
    public void testGetAlcoholPercentWithAlcohol() {
        Assertions.assertEquals(colaRum.getAlcoholPercent(), 30);
    }

    @Test
    public void testGetAlcoholPercentWithoutAlcohol() {
        Assertions.assertEquals(waterGlass.getAlcoholPercent(), 0);
    }

    @Test
    public void testIsAlcoholicWithAlcohol() {
        Assertions.assertTrue(colaRum.isAlcoholic());
    }

    @Test
    public void testIsAlcoholicWithoutAlcohol() {
        Assertions.assertFalse(waterGlass.isAlcoholic());
    }

}
