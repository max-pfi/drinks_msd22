package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

public class StringQueueTest {

    private StringQueue stringQueue;

    @BeforeEach
    public void setup() {
        stringQueue = new StringQueue(3);
    }

    @DisplayName("Test offer method, filling queue to max size")
    @Test
    public void testOffer() {
        Assertions.assertTrue(stringQueue.offer("String1"));
        Assertions.assertTrue(stringQueue.offer("String2"));
        Assertions.assertTrue(stringQueue.offer("String3"));
    }

    @DisplayName("Test offer when queue is full")
    @Test
    public void testOfferOverflow() {
        stringQueue.offer("String1");
        stringQueue.offer("String2");
        stringQueue.offer("String3");
        Assertions.assertFalse(stringQueue.offer("String4"));
    }

    @DisplayName("Test poll with elements in queue")
    @Test
    public void testPoll() {
        String obj = "String1";
        stringQueue.offer(obj);
        Assertions.assertEquals(obj, stringQueue.poll());

    }

    @DisplayName("Test poll with empty queue")
    @Test
    public void testPollEmptyQueue() {
        Assertions.assertNull(stringQueue.poll());
    }

    @DisplayName("Test remove with object in queue")
    @Test
    public void testRemove() {
        String obj = "String1";
        stringQueue.offer(obj);
        Assertions.assertEquals(obj, stringQueue.remove());

    }

    @DisplayName("Test remove with empty queue")
    @Test
    public void testRemoveFromEmptyQueue() {
        Assertions.assertThrows(NoSuchElementException.class,() -> stringQueue.remove());
    }

    @DisplayName("Test Peek with element in queue")
    @Test
    public void testPeek() {
        String obj = "String1";
        stringQueue.offer(obj);
        Assertions.assertEquals(obj, stringQueue.peek());
        Assertions.assertEquals(obj, stringQueue.peek());
    }

    @DisplayName("Test Peek with empty queue")
    @Test
    public void testPeekEmptyQueue() {
        Assertions.assertNull(stringQueue.peek());
    }


    @DisplayName("Test element with elements in queue")
    @Test
    public void testElement() {
        String obj = "String1";
        stringQueue.offer(obj);
        Assertions.assertEquals(obj, stringQueue.element());
        Assertions.assertEquals(obj, stringQueue.element());

    }

    @DisplayName("Test element with empty queue")
    @Test
    public void testElementWithEmptyQueue() {
        Assertions.assertThrows(NoSuchElementException.class,() -> stringQueue.element());
    }



}
