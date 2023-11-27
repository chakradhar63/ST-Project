package org.example;
import java.util.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AllocateBooksTest {
    @Test
    public void testbinarysearch() {
        AllocateBooks ab = new AllocateBooks();

        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(25, 46, 28, 49, 24));
        int n1 = arr1.size();
        int m1 = 4;
        int result1 = ab.findPages(arr1, n1, m1);
        assertEquals(71, result1);

        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(2, 8, 8, 4,5));
        int n2 = arr2.size();
        int m2 = 6;
        int result2 = ab.findPages(arr2, n2, m2);
        assertEquals(-1, result2);

        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(1, 17, 14, 9, 15, 9, 14));
        int n3 = arr3.size();
        int m3 = 7;
        int result3 = ab.findPages(arr3, n3, m3);
        assertEquals(17, result3);
    }
}
