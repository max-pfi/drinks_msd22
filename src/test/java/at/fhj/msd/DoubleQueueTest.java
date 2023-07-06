/**
 * This is a Test class for the DoubleQueue class.
 * It provides a set of test cases to check the behavior of methods of the DoubleQueue class.
 *
 * @author Max Pfisterer
 */
package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

public class DoubleQueueTest {

    private DoubleQueue doubleQueue;

    /**
     * This method sets up the test environment before each test case.
     * It creates a new instance of DoubleQueue with the maximum size of 3.
     */
    @BeforeEach
    public void setup() {
        doubleQueue = new DoubleQueue(3);
    }

    /**
     * Test case for the offer method when the queue has enough space.
     * It verifies if the offer method adds elements until the queue reaches its maximum size.
     */
    @DisplayName("Test offer method, filling queue to max size")
    @Test
    public void testOffer() {
        Assertions.assertTrue(doubleQueue.offer(1.0));
        Assertions.assertTrue(doubleQueue.offer(2.0));
        Assertions.assertTrue(doubleQueue.offer(3.0));
    }

    /**
     * Test case for the offer method when the queue is full.
     * It verifies if the offer method returns false when trying to add an element to a full queue.
     */
    @DisplayName("Test offer when queue is full")
    @Test
    public void testOfferOverflow() {
        doubleQueue.offer(1.0);
        doubleQueue.offer(2.0);
        doubleQueue.offer(3.0);
        Assertions.assertFalse(doubleQueue.offer(4.0));
    }

    /**
     * Test case for the poll method when the queue contains elements.
     * It verifies if the poll method returns and removes the head of the queue.
     */
    @DisplayName("Test poll with elements in queue")
    @Test
    public void testPoll() {
        Double obj = 1.0;
        doubleQueue.offer(obj);
        Assertions.assertEquals(obj, doubleQueue.poll());

    }

    /**
     * Test case for the poll method when the queue is empty.
     * It verifies if the poll method returns null when the queue is empty.
     */
    @DisplayName("Test poll with empty queue")
    @Test
    public void testPollEmptyQueue() {
        Assertions.assertNull(doubleQueue.poll());
    }

    /**
     * Test case for the remove method when the queue contains elements.
     * It verifies if the remove method returns and removes the head of the queue.
     */
    @DisplayName("Test remove with object in queue")
    @Test
    public void testRemove() {
        Double obj = 1.0;
        doubleQueue.offer(obj);
        Assertions.assertEquals(obj, doubleQueue.remove());

    }

    /**
     * Test case for the remove method when the queue is empty.
     * It verifies if the remove method throws NoSuchElementException when the queue is empty.
     */
    @DisplayName("Test remove with empty queue")
    @Test
    public void testRemoveFromEmptyQueue() {
        Assertions.assertThrows(NoSuchElementException.class,() -> doubleQueue.remove());
    }

    /**
     * Test case for the peek method when the queue contains elements.
     * It verifies if the peek method returns the head of the queue without removing it.
     */
    @DisplayName("Test Peek with element in queue")
    @Test
    public void testPeek() {
        Double obj = 1.0;
        doubleQueue.offer(obj);
        Assertions.assertEquals(obj, doubleQueue.peek());
        Assertions.assertEquals(obj, doubleQueue.peek());
    }

    /**
     * Test case for the peek method when the queue is empty.
     * It verifies if the peek method returns null when the queue is empty.
     */
    @DisplayName("Test Peek with empty queue")
    @Test
    public void testPeekEmptyQueue() {
        Assertions.assertNull(doubleQueue.peek());
    }

    /**
     * Test case for the element method when the queue contains elements.
     * It verifies if the element method returns the head of the queue without removing it.
     */
    @DisplayName("Test element with elements in queue")
    @Test
    public void testElement() {
        Double obj = 1.0;
        doubleQueue.offer(obj);
        Assertions.assertEquals(obj, doubleQueue.element());
        Assertions.assertEquals(obj, doubleQueue.element());

    }

    /**
     * Test case for the element method when the queue is empty.
     * It verifies if the element method throws NoSuchElementException when the queue is empty.
     */
    @DisplayName("Test element with empty queue")
    @Test
    public void testElementWithEmptyQueue() {
        Assertions.assertThrows(NoSuchElementException.class,() -> doubleQueue.element());
    }
}