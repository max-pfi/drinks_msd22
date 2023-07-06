package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;

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
}
