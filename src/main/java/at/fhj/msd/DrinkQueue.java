package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DrinkQueue {

    private List<Drink> elements = new ArrayList<>();
    private int maxSize;

    public DrinkQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    public boolean offer(Drink obj) {
        if (elements.size() < maxSize) {
            elements.add(obj);
            return true;
        } else {
            return false;
        }
    }

    public Drink poll() {
        if (elements.size() > 0) {
            Drink element = elements.get(0);
            elements.remove(0);
            return element;
        } else {
            return null;
        }
    }

    public Drink peek() {
        if (elements.size() > 0) {
            return elements.get(0);
        } else {
            return null;
        }
    }

    public Drink element() {
        Drink element = peek();
        if (element == null) {
            throw new NoSuchElementException("there's no element any more");
        }
        return element;
    }

}
