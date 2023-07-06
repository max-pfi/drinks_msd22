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
