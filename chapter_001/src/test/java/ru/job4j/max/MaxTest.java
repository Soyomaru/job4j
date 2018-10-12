package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(2, 8);
        assertThat(result, is(8));
    }

    @Test
    public void whenThreeDigits() {
        Max maxim = new Max();
        int result = maxim.max(9, 1, 3);
        assertThat(result, is(9));
    }

}
