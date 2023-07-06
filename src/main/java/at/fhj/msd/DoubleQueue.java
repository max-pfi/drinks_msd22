package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DoubleQueue {
    private List<Double> elements = new ArrayList<>();
    private int maxSize;

    public DoubleQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    public boolean offer(Double obj) {
        if (elements.size() < maxSize) {
            elements.add(obj);
            return true;
        } else {
            return false;
        }
    }

    public Double poll() {
        if (elements.size() > 0) {
            Double element = elements.get(0);
            elements.remove(0);
            return element;
        } else {
            return null;
        }
    }

    public Double peek() {
        if (elements.size() > 0) {
            return elements.get(0);
        } else {
            return null;
        }
    }

    public Double element() {
        Double element = peek();
        if (element == null) {
            throw new NoSuchElementException("there's no element any more");
        }
        return element;
    }

    public Double remove() {
        Double element = poll();
        if (element == null) {
            throw new NoSuchElementException("there's no element any more");
        }
        return element;
    }
}
