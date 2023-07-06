/**

 The StringQueue class represents a queue implementation that stores strings.
 It implements the IQueue interface and provides methods for adding and removing elements from the queue.
 This class also includes bug fixes and improvements.

 * @author
 *     Patrick Fössl
 *     Max Pfisterer
 *     Laurenz Altendorfer
 */
package at.fhj.msd;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * The StringQueue class represents a queue implementation that stores strings.
 * It implements the IQueue interface and provides methods for adding and removing elements from the queue.
 * This class also includes bug fixes and improvements.
 */
public class StringQueue implements IQueue {
  private List<String> elements = new ArrayList<String>();
  private int maxSize;

  /**
   *  Creates a StringQueue object with the specified maximum size.
   *  @param maxSize the maximum size of the queue
   */

  public StringQueue(int maxSize) {
    this.maxSize = maxSize;
  }
  /**
   *  Adds a string to the queue.
   *  @param obj the string to be added to the queue
   *  @return true if the string was added successfully, false if the queue is full
   */
  @Override
  public boolean offer(String obj) {
    if (elements.size() < maxSize) {
      elements.add(obj);
      return true;
    } else {
      return false;
    }
  }
  /**
   *  Retrieves and removes the first string from the queue.
   *
   *  @return the first string from the queue, or null if the queue is empty
   */
  @Override
  public String poll() {
    if (elements.size() > 0) {
      String element = elements.get(0);
      elements.remove(0);
      return element;
    } else {
      return null;
    }
  }

  /**
   *  Retrieves and removes the first string from the queue.
   *  @return the first string from the queue
   *  @throws NoSuchElementException if the queue is empty
   */
  @Override
  public String remove() {
    String element = poll();

    if (element == null) {
      throw new NoSuchElementException("there's no element any more");
    }
    return element;
  }

  /**
   *  Retrieves, but does not remove, the first string from the queue.
   *
   *  @return the first string from the queue, or null if the queue is empty
   */
  @Override
  public String peek() {
    if (elements.size() > 0) {
      return elements.get(0);
    } else {
      return null;
    }
  }
  /**
   *  Retrieves, but does not remove, the first string from the queue.
   *
   *  @return the first string from the queue
   *  @throws NoSuchElementException if the queue is empty
   */
  @Override
  public String element() {
    String element = peek();

    if (element == null) {
      throw new NoSuchElementException("there's no element any more");
    }

    return element;
  }
}