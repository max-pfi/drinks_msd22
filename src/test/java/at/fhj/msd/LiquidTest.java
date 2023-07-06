package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LiquidTest {

    private Liquid liquid;

    /**
     * Sets up the test environment by creating an instance of the Liquid object.
     */
    @BeforeEach
    public void setUp() {
        liquid = new Liquid("Cola", 0.5, 0);
    }

    /**
     * Tests the getName() and setName() methods of the Liquid class.
     * Asserts that the initial name matches the provided name,
     * and that the name can be successfully updated.
     */
    @Test
    public void testName() {
        assertEquals("Cola", liquid.getName());
        liquid.setName("Fanta");
        assertEquals("Fanta", liquid.getName());
    }

    /**
     * Tests the getVolume() and setVolume() methods of the Liquid class.
     * Asserts that the initial volume matches the provided volume,
     * and that the volume can be successfully updated.
     */
    @Test
    public void testVolume() {
        assertEquals(0.5, liquid.getVolume());
        liquid.setVolume(1);
        assertEquals(1, liquid.getVolume());
    }

    /**
     * Tests the getAlcoholPercent() and setAlcoholPercent() methods of the Liquid class.
     * Asserts that the initial alcohol percentage matches the provided percentage,
     * and that the alcohol percentage can be successfully updated.
     */
    @Test
    public void testAlcoholPercent() {
        assertEquals(0, liquid.getAlcoholPercent());
        liquid.setAlcoholPercent(5);
        assertEquals(5, liquid.getAlcoholPercent());
    }
}