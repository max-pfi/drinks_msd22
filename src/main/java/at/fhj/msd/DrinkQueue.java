/**

 The DrinkQueue class represents a queue implementation specifically for drinks.
 It stores Drink objects and provides methods for adding and removing drinks from the queue.
 */
package at.fhj.msd;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**

 The DrinkQueue class represents a queue implementation specifically for drinks.

 It stores Drink objects and provides methods for adding and removing drinks from the queue.
 */
public class DrinkQueue {
    private List<Drink> elements = new ArrayList<>();
    private int maxSize;

    /**

     Creates a DrinkQueue object with the specified maximum size.
     @param maxSize the maximum size of the queue
     */
    public DrinkQueue(int maxSize) {
        this.maxSize = maxSize;
    }
    /**

     Adds a drink to the queue.
     @param obj the drink to be added to the queue
     @return true if the drink was added successfully, false if the queue is full
     */
    public boolean offer(Drink obj) {
        if (elements.size() < maxSize) {
            elements.add(obj);
            return true;
        } else {
            return false;
        }
    }
    /**

     Retrieves and removes the first drink from the queue.
     @return the first drink from the queue, or null if the queue is empty
     */
    public Drink remove() {
        Drink element = poll();
        if (element == null) {
            throw new NoSuchElementException("There is no element in the queue");
        }
        return element;
    }
    /**

     Retrieves and removes the first drink from the queue.
     @return the first drink from the queue, or null if the queue is empty
     */
    public Drink poll() {
        if (elements.size() > 0) {
            Drink element = elements.get(0);
            elements.remove(0);
            return element;
        } else {
            return null;
        }
    }
    /**

     Retrieves, but does not remove, the first drink from the queue.
     @return the first drink from the queue, or null if the queue is empty
     */
    public Drink peek() {
        if (elements.size() > 0) {
            return elements.get(0);
        } else {
            return null;
        }
    }
    /**

     Retrieves, but does not remove, the first drink from the queue.
     @return the first drink from the queue
     @throws NoSuchElementException if the queue is empty
     */
    public Drink element() {
        Drink element = peek();
        if (element == null) {
            throw new NoSuchElementException("There is no element in the queue");
        }
        return element;
    }
}