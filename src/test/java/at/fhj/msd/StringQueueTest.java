/**
 * Test class for StringQueue class.
 * This class provides the test cases to check the methods of the StringQueue class.
 *
 * @author Max Pfisterer
 */
package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

public class StringQueueTest {

    private StringQueue stringQueue;

    /**
     * Method to set up the test environment.
     * Initializes the StringQueue object.
     */
    @BeforeEach
    public void setup() {
        stringQueue = new StringQueue(3);
    }

    /**
     * Test case for offer method when the queue is not full.
     * Checks if the method returns true when adding elements to the queue unitl its full.
     */
    @DisplayName("Test offer method, filling queue to max size")
    @Test
    public void testOffer() {
        Assertions.assertTrue(stringQueue.offer("String1"));
        Assertions.assertTrue(stringQueue.offer("String2"));
        Assertions.assertTrue(stringQueue.offer("String3"));
    }

    /**
     * Test case for offer method when the queue is full
     * Checks if the method returns false when trying to add an element to a full queue.
     */
    @DisplayName("Test offer when queue is full")
    @Test
    public void testOfferOverflow() {
        stringQueue.offer("String1");
        stringQueue.offer("String2");
        stringQueue.offer("String3");
        Assertions.assertFalse(stringQueue.offer("String4"));
    }

    /**
     * Test case for poll method when the queue is not empty.
     * Checks if the method return the head of the queue and removes it.
     */
    @DisplayName("Test poll with elements in queue")
    @Test
    public void testPoll() {
        String obj = "String1";
        stringQueue.offer(obj);
        Assertions.assertEquals(obj, stringQueue.poll());

    }

    /**
     * Test case for poll method when the queue is empty.
     * Checks if the method returns null when the queue is empty.
     */
    @DisplayName("Test poll with empty queue")
    @Test
    public void testPollEmptyQueue() {
        Assertions.assertNull(stringQueue.poll());
    }

    /**
     * Test case for remove method when the queue is not empty.
     * Checks if the method returns the head of the queue and removes it.
     */
    @DisplayName("Test remove with object in queue")
    @Test
    public void testRemove() {
        String obj = "String1";
        stringQueue.offer(obj);
        Assertions.assertEquals(obj, stringQueue.remove());

    }

    /**
     * Test case for remove method when the queue is empty.
     * Checks if the method throws NoSuchElementException when the queue is empty.
     */
    @DisplayName("Test remove with empty queue")
    @Test
    public void testRemoveFromEmptyQueue() {
        Assertions.assertThrows(NoSuchElementException.class,() -> stringQueue.remove());
    }

    /**
     * Test case for peek method when the queue is not empty.
     * Checks if the method returns the head of the queue without removing it.
     */
    @DisplayName("Test Peek with element in queue")
    @Test
    public void testPeek() {
        String obj = "String1";
        stringQueue.offer(obj);
        Assertions.assertEquals(obj, stringQueue.peek());
        Assertions.assertEquals(obj, stringQueue.peek());
    }

    /**
     * Test case for peek method when the queue is empty.
     * Checks if the method returns null when the queue is empty.
     */
    @DisplayName("Test Peek with empty queue")
    @Test
    public void testPeekEmptyQueue() {
        Assertions.assertNull(stringQueue.peek());
    }

    /**
     * Test case for element method when the queue is not empty.
     * Checks if the method returns the head of the queue without removing it.
     */
    @DisplayName("Test element with elements in queue")
    @Test
    public void testElement() {
        String obj = "String1";
        stringQueue.offer(obj);
        Assertions.assertEquals(obj, stringQueue.element());
        Assertions.assertEquals(obj, stringQueue.element());

    }

    /**
     * Test case for the element method when the queue is empty.
     * Checks if the method throws NoSuchElementException when the queue is empty.
     */
    @DisplayName("Test element with empty queue")
    @Test
    public void testElementWithEmptyQueue() {
        Assertions.assertThrows(NoSuchElementException.class,() -> stringQueue.element());
    }



}
