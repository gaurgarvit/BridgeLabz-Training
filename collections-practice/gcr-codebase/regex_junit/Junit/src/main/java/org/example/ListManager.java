package org.example;

import java.util.List;

public class ListManager {
    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    public void removeElement(List<Integer> list, int element) {
        // removing object instead of index by boxing the int
        list.remove(Integer.valueOf(element));
    }

    public int getSize(List<Integer> list) {
        return list.size();
    }
}