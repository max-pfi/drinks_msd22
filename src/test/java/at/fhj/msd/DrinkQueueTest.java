package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

public class DrinkQueueTest {

    private DrinkQueue queue;
    private Drink drink1;
    private Drink drink2;

    /**
     * Sets up the test environment by creating instances of DrinkQueue and Drink objects.
     */
    @BeforeEach
    public void setUp() {
        queue = new DrinkQueue(2);
        drink1 = new SimpleDrink("Cola", new Liquid("Cola", 0.5, 0));
        drink2 = new SimpleDrink("Beer", new Liquid("Beer", 0.5, 4.7));
    }

    /**
     * Tests the offer() method of the DrinkQueue class.
     * Adds drinks to the queue and asserts that they are successfully offered,
     * and that attempting to offer more drinks than the queue's capacity returns false.
     */
    @Test
    public void testOffer() {
        assertTrue(queue.offer(drink1));
        assertTrue(queue.offer(drink2));
        assertFalse(queue.offer(new SimpleDrink("Water", new Liquid("Water", 1, 0))));
    }

    /**
     * Tests the remove() method of the DrinkQueue class.
     * Adds drinks to the queue and asserts that they can be removed in the correct order.
     * Additionally, asserts that attempting to remove from an empty queue throws a NoSuchElementException.
     */
    @Test
    public void testRemove() {
        queue.offer(drink1);
        queue.offer(drink2);
        assertEquals(drink1, queue.remove());
        assertEquals(drink2, queue.remove());
        assertThrows(NoSuchElementException.class, () -> queue.remove());
    }

    /**
     * Tests the poll() method of the DrinkQueue class.
     * Adds drinks to the queue and asserts that they can be polled (removed) in the correct order.
     * Additionally, asserts that attempting to poll from an empty queue returns null.
     */
    @Test
    public void testPoll() {
        queue.offer(drink1);
        queue.offer(drink2);
        assertEquals(drink1, queue.poll());
        assertEquals(drink2, queue.poll());
        assertNull(queue.poll());
    }

    /**
     * Tests the peek() method of the DrinkQueue class.
     * Asserts that peeking an empty queue returns null.
     * Adds drinks to the queue and asserts that peeking returns the first drink without removing it.
     */
    @Test
    public void testPeek() {
        assertNull(queue.peek());
        queue.offer(drink1);
        assertEquals(drink1, queue.peek());
        queue.offer(drink2);
        assertEquals(drink1, queue.peek());
    }

    /**
     * Tests the element() method of the DrinkQueue class.
     * Asserts that calling element() on an empty queue throws a NoSuchElementException.
     * Adds drinks to the queue and asserts that calling element() returns the first drink without removing it.
     */
    @Test
    public void testElement() {
        assertThrows(NoSuchElementException.class, () -> queue.element());
        queue.offer(drink1);
        assertEquals(drink1, queue.element());
        queue.offer(drink2);
        assertEquals(drink1, queue.element());
    }
}