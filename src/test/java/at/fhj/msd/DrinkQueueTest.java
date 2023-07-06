package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

public class DrinkQueueTest {

    private DrinkQueue queue;
    private Drink drink1;
    private Drink drink2;

    @BeforeEach
    public void setUp() {
        queue = new DrinkQueue(2);
        drink1 = new SimpleDrink("Cola", new Liquid("Cola", 0.5, 0));
        drink2 = new SimpleDrink("Beer", new Liquid("Beer", 0.5, 4.7));
    }

    @Test
    public void testOffer() {
        assertTrue(queue.offer(drink1));
        assertTrue(queue.offer(drink2));
        assertFalse(queue.offer(new SimpleDrink("Water", new Liquid("Water", 1, 0))));
    }

    @Test
    public void testRemove() {
        queue.offer(drink1);
        queue.offer(drink2);
        assertEquals(drink1, queue.remove());
        assertEquals(drink2, queue.remove());
        assertThrows(NoSuchElementException.class, () -> queue.remove());
    }

    @Test
    public void testPoll() {
        queue.offer(drink1);
        queue.offer(drink2);
        assertEquals(drink1, queue.poll());
        assertEquals(drink2, queue.poll());
        assertNull(queue.poll());
    }

    @Test
    public void testPeek() {
        assertNull(queue.peek());
        queue.offer(drink1);
        assertEquals(drink1, queue.peek());
        queue.offer(drink2);
        assertEquals(drink1, queue.peek());
    }

    @Test
    public void testElement() {
        assertThrows(NoSuchElementException.class, () -> queue.element());
        queue.offer(drink1);
        assertEquals(drink1, queue.element());
        queue.offer(drink2);
        assertEquals(drink1, queue.element());
    }
}