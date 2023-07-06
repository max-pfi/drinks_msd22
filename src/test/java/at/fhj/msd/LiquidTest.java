package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LiquidTest {

    private Liquid liquid;

    @BeforeEach
    public void setUp() {
        liquid = new Liquid("Cola", 0.5, 0);
    }

    @Test
    public void testName() {
        assertEquals("Cola", liquid.getName());
        liquid.setName("Fanta");
        assertEquals("Fanta", liquid.getName());
    }

    @Test
    public void testVolume() {
        assertEquals(0.5, liquid.getVolume());
        liquid.setVolume(1);
        assertEquals(1, liquid.getVolume());
    }

    @Test
    public void testAlcoholPercent() {
        assertEquals(0, liquid.getAlcoholPercent());
        liquid.setAlcoholPercent(5);
        assertEquals(5, liquid.getAlcoholPercent());
    }
}