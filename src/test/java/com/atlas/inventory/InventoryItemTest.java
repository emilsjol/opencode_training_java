package com.atlas.inventory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class InventoryItemTest {

    @Test
    public void testReorderShortage() {
        // Quantity below reorderLevel
        InventoryItem item1 = new InventoryItem(1L, "1", "Item1", "cat", "loc", 5, 10, "desc");
        assertEquals(5, item1.reorderShortage());

        // Quantity equal to reorderLevel
        InventoryItem item2 = new InventoryItem(2L, "2", "Item2", "cat", "loc", 10, 10, "desc");
        assertEquals(0, item2.reorderShortage());

        // Quantity above reorderLevel
        InventoryItem item3 = new InventoryItem(3L, "3", "Item3", "cat", "loc", 15, 10, "desc");
        assertEquals(0, item3.reorderShortage());

        // Both values at 0
        InventoryItem item4 = new InventoryItem(4L, "4", "Item4", "cat", "loc", 0, 0, "desc");
        assertEquals(0, item4.reorderShortage());
    }
}