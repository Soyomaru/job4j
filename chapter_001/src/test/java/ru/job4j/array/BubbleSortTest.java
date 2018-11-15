package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {

    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubble = new BubbleSort();
        int[] input = new int[] {11, 9, 4, 5, 3, 7, 8, 0, 5};
        int[] result = bubble.sort(input);
        int[] expect = new int[] {0, 3, 4, 5, 5, 7, 8, 9, 11};
        assertThat(result, is(expect));
    }
}
