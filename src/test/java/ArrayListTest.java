import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {
    @Test
    void indexOfTest() {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(3);
        assertEquals(0, arrayList.indexOf(3));
    }

    @Test
    void lastIndexOfTest() {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(3);
        assertEquals(2, arrayList.lastIndexOf(3));
    }

    @Test
    void isEmptyTest() {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        assertFalse(arrayList.isEmpty());
    }

    @Test
    void sizeTest() {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(1);
        assertEquals(2, arrayList.size());
    }

    @Test
    void removeTest() {
        ArrayList<Integer> arrayList1 = new ArrayList(Arrays.asList(10, 9, 8, 7, 6));
        ArrayList<Integer> arrayList2 = new ArrayList(Arrays.asList(10, 9, 8, 6));
        arrayList1.remove(3);
        assertEquals(arrayList2, arrayList1);
    }

    @Test
    void clearTest() {
        ArrayList<Integer> arrayList1 = new ArrayList(Arrays.asList(10, 9, 8, 7, 6));
        ArrayList<Integer> arrayList2 = new ArrayList();
        arrayList1.clear();
        assertEquals(arrayList2, arrayList1);
    }

    @Test
    void addAllTest() {
        ArrayList<Integer> arrayList1 = new ArrayList(Arrays.asList(10, 9, 8, 7, 6));
        ArrayList<Integer> arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList1);
        assertEquals(arrayList1, arrayList2);
    }

    @Test
    void removeAllTest() {
        ArrayList<Integer> arrayList1 = new ArrayList(Arrays.asList(10, 9, 8, 7, 6));
        ArrayList<Integer> arrayList2 = new ArrayList(Arrays.asList(10, 9, 8));
        ArrayList<Integer> arrayList3 = new ArrayList(Arrays.asList(7, 6));
        arrayList1.removeAll(arrayList2);
        assertEquals(arrayList3, arrayList1);
    }
}