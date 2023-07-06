package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

public class DoubleQueueTest {

    private DoubleQueue doubleQueue;

    @BeforeEach
    public void setup() {
        doubleQueue = new DoubleQueue(3);
    }

    @DisplayName("Test offer method, filling queue to max size")
    @Test
    public void testOffer() {
        Assertions.assertTrue(doubleQueue.offer(1.0));
        Assertions.assertTrue(doubleQueue.offer(2.0));
        Assertions.assertTrue(doubleQueue.offer(3.0));
    }

    @DisplayName("Test offer when queue is full")
    @Test
    public void testOfferOverflow() {
        doubleQueue.offer(1.0);
        doubleQueue.offer(2.0);
        doubleQueue.offer(3.0);
        Assertions.assertFalse(doubleQueue.offer(4.0));
    }

    @DisplayName("Test poll with elements in queue")
    @Test
    public void testPoll() {
        Double obj = 1.0;
        doubleQueue.offer(obj);
        Assertions.assertEquals(obj, doubleQueue.poll());

    }

    @DisplayName("Test poll with empty queue")
    @Test
    public void testPollEmptyQueue() {
        Assertions.assertNull(doubleQueue.poll());
    }

    @DisplayName("Test remove with object in queue")
    @Test
    public void testRemove() {
        Double obj = 1.0;
        doubleQueue.offer(obj);
        Assertions.assertEquals(obj, doubleQueue.remove());

    }

    @DisplayName("Test remove with empty queue")
    @Test
    public void testRemoveFromEmptyQueue() {
        Assertions.assertThrows(NoSuchElementException.class,() -> doubleQueue.remove());
    }

    @DisplayName("Test Peek with element in queue")
    @Test
    public void testPeek() {
        Double obj = 1.0;
        doubleQueue.offer(obj);
        Assertions.assertEquals(obj, doubleQueue.peek());
        Assertions.assertEquals(obj, doubleQueue.peek());
    }

    @DisplayName("Test Peek with empty queue")
    @Test
    public void testPeekEmptyQueue() {
        Assertions.assertNull(doubleQueue.peek());
    }


    @DisplayName("Test element with elements in queue")
    @Test
    public void testElement() {
        Double obj = 1.0;
        doubleQueue.offer(obj);
        Assertions.assertEquals(obj, doubleQueue.element());
        Assertions.assertEquals(obj, doubleQueue.element());

    }

    @DisplayName("Test element with empty queue")
    @Test
    public void testElementWithEmptyQueue() {
        Assertions.assertThrows(NoSuchElementException.class,() -> doubleQueue.element());
    }

}
