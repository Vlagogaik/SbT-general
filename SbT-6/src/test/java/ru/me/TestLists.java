package ru.me;
import org.junit.Test;
import static org.junit.Assert.*;
public class TestLists {

    @Test
    public void testContains() {
        LinkedList list = new LinkedList();
        list.add("First");
        list.add("Second");
        assertTrue(list.contains("First"));
        assertFalse(list.contains("Third"));
    }

    @Test
    public void testRemove() {
        LinkedList list = new LinkedList();
        list.add("First");
        list.add("Second");
        list.add("Third");
        assertTrue(list.remove("Second"));
        assertFalse(list.remove("Oleg"));
        assertEquals(2, list.size());
        assertEquals("Third", list.get(0));
//        assertEquals("First", list.get(1));
    }

    @Test
    public void testSize() {
        LinkedList list = new LinkedList();
        assertEquals(0, list.size());
        list.add("First");
        assertEquals(1, list.size());
        list.add(2);
        assertEquals(2, list.size());
    }

    @Test
    public void testGet() {
        LinkedList list = new LinkedList();
        list.add("First");
        list.add("Second");
        assertEquals("Second", list.get(0));
        assertEquals("First", list.get(1));
    }

//

    @Test
    public void GtestAdd() {
        GLinkedList list = new GLinkedList();
        list.add("First");
        list.add(2);
        assertEquals(2, list.get(0));
        assertEquals("First", list.get(1));
    }

    @Test
    public void GtestRemove() {
        GLinkedList list = new GLinkedList();
        list.add("First");
        list.add("Second");
        list.add(3);
        list.remove(0);
        list.remove(1);
        assertEquals(1, list.size());
        assertEquals("Second", list.get(0));
//        assertEquals("First", list.get(1));
    }

    @Test
    public void GtestSize() {
        GLinkedList list = new GLinkedList();
        assertEquals(0, list.size());
        list.add("First");
        assertEquals(1, list.size());
        list.add("Second");
        assertEquals(2, list.size());
    }


}
