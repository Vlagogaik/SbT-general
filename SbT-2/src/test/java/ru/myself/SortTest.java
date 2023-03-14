package ru.myself;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class SortTest {
    int[] a = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
    int[] b = {1, 1, 2, 3, 3, 4, 5, 5, 6, 9};
    ru.meself.Sort sort = new ru.meself.Sort();
    @Test
    public void QuickSortTest(){
        sort.quickSort(a, 0, a.length - 1);
        assertArrayEquals(b, a);
    }
    @Test
    public void BubbleTest(){
        sort.Bubble(a);
        assertArrayEquals(b, a);
    }
}