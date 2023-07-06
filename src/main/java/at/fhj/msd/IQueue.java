package at.fhj.msd;


import java.util.NoSuchElementException;

/**
 * Represents a queue data structure for String objects.
 */
public interface IQueue {

  /**
   * Adds the given String to the end of the queue if it is not full.
   *
   * @param obj The String to add to the queue.
   * @return true if the String was added successfully, false otherwise.
   */
  public abstract boolean offer(String obj);

  /**
   * Retrieves and removes the first String of this queue, or returns null if this queue is empty.
   *
   * @return the first String of this queue, or null if this queue is empty.
   */
  public abstract String poll();

  /**
   * Retrieves and removes the first String of this queue.
   * This method differs from poll only in that it throws an exception if this queue is empty.
   *
   * @return the first String of this queue.
   * @throws NoSuchElementException if this queue is empty.
   */
  public abstract String remove();

  /**
   * Retrieves, but does not remove, the first String of this queue, or returns null if this queue is empty.
   *
   * @return the first String of this queue, or null if this queue is empty.
   */
  public abstract String peek();

  /**
   * Retrieves, but does not remove, the first String of this queue.
   * This method differs from peek only in that it throws an exception if this queue is empty.
   *
   * @return the first String of this queue.
   * @throws NoSuchElementException if this queue is empty.
   */
  public abstract String element();
}