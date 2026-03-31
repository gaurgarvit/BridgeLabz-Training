package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ListManagerTest {

    private final ListManager manager = new ListManager();

    @Test
    void testListOperations() {
        List<Integer> numbers = new ArrayList<>();

        // adding an element to the list
        manager.addElement(numbers, 10);
        // verifying list size increased
        assertEquals(1, manager.getSize(numbers));

        // removing the added element
        manager.removeElement(numbers, 10);
        // checking if list is empty after removal
        assertEquals(0, manager.getSize(numbers));
    }
}