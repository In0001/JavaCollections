import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    @Test
    void addFirstTest() {
        LinkedList<Integer> linkedList1 = new LinkedList<>(Arrays.asList(2, 3));
        LinkedList<Integer> linkedList2 = new LinkedList<>(Arrays.asList(1, 2, 3));
        linkedList1.addFirst(1);
        assertEquals(linkedList2, linkedList1);
    }

    @Test
    void peekFirstTest() {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("1", "2", "3", "4"));
        assertEquals("1", linkedList.peekFirst());
    }

    @Test
    void peekLastTest() {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("1", "2", "3", "4"));
        assertEquals("4", linkedList.peekLast());
    }

    @Test
    void peekLastNullTest() {
        LinkedList<String> linkedList = new LinkedList<>();
        assertEquals(null, linkedList.peekLast());
    }

    @Test
    void pollLastTest() {
        LinkedList<String> linkedList1 = new LinkedList<>(Arrays.asList("1", "2", "3", "4"));
        LinkedList<String> linkedList2 = new LinkedList<>(Arrays.asList("1", "2", "3"));
        linkedList1.pollLast();
        assertEquals(linkedList2, linkedList1);
    }

    @Test
    void pollFirstTest() {
        LinkedList<String> linkedList1 = new LinkedList<>(Arrays.asList("1", "2", "3", "4"));
        LinkedList<String> linkedList2 = new LinkedList<>(Arrays.asList("2", "3", "4"));
        linkedList1.pollFirst();
        assertEquals(linkedList2, linkedList1);
    }

    @Test
    void pollFirstNullTest() {
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList());
        assertEquals(null, linkedList.pollFirst());
    }
}
