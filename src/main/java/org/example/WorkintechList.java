package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class WorkintechList<T extends Comparable<T>> extends ArrayList<T> {
    private List<T> elements;

    public WorkintechList() {
        elements = new ArrayList<>();
    }
    public boolean add(T element) {
        if (!this.contains(element)) {
            boolean result = super.add(element);
            this.sort();
            return result;
        }
        return false;
    }
    public void remove(T element) {
          super.remove(element);
            sort();
        }
    public void sort() {
            Collections.sort(this);
        }
    public List<T> getElements() {
            return elements;
        }
    }

