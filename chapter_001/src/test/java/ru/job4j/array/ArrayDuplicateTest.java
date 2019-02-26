package ru.job4j.array;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        String[] input = {"you", "are", "are", "unique", "not"};
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] result = duplicate.removeDuplicates(input);
        String[] expect = {"you", "are", "not", "unique"};
        assertThat(result, is(expect));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicat() {
        String[] input = {"you", "are", "are", "you", "unique", "not", "not"};
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] result = duplicate.removeDuplicates(input);
        String[] expect = {"you", "are", "not", "unique"};
        assertThat(result, is(expect));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplica() {
        String[] input = {"you", "you", "you", "not", "not", "not"};
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] result = duplicate.removeDuplicates(input);
        String[] expect = {"you", "not"};
        assertThat(result, is(expect));
    }


}
