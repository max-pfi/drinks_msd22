/**

 The DoubleQueue class represents a queue implementation specifically for doubles.
 It stores Double objects and provides methods for adding and removing doubles from the queue.
 */
package at.fhj.msd;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**

 The DoubleQueue class represents a queue implementation specifically for doubles.

 It stores Double objects and provides methods for adding and removing doubles from the queue.
 */
public class DoubleQueue {
    private List<Double> elements = new ArrayList<>();
    private int maxSize;

    /**

     Creates a DoubleQueue object with the specified maximum size.
     @param maxSize the maximum size of the queue
     */
    public DoubleQueue(int maxSize) {
        this.maxSize = maxSize;
    }
    /**

     Adds a double to the queue.
     @param obj the double to be added to the queue
     @return true if the double was added successfully, false if the queue is full
     */
    public boolean offer(Double obj) {
        if (elements.size() < maxSize) {
            elements.add(obj);
            return true;
        } else {
            return false;
        }
    }
    /**

     Retrieves and removes the first double from the queue.
     @return the first double from the queue, or null if the queue is empty
     */
    public Double poll() {
        if (elements.size() > 0) {
            Double element = elements.get(0);
            elements.remove(0);
            return element;
        } else {
            return null;
        }
    }
    /**

     Retrieves, but does not remove, the first double from the queue.
     @return the first double from the queue, or null if the queue is empty
     */
    public Double peek() {
        if (elements.size() > 0) {
            return elements.get(0);
        } else {
            return null;
        }
    }
    /**

     Retrieves, but does not remove, the first double from the queue.
     @return the first double from the queue
     @throws NoSuchElementException if the queue is empty
     */
    public Double element() {
        Double element = peek();
        if (element == null) {
            throw new NoSuchElementException("There is no element in the queue");
        }
        return element;
    }
    /**

     Retrieves and removes the first double from the queue.
     @return the first double from the queue
     @throws NoSuchElementException if the queue is empty
     */
    public Double remove() {
        Double element = poll();
        if (element == null) {
            throw new NoSuchElementException("There is no element in the queue");
        }
        return element;
    }
}