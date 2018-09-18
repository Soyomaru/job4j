package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;


public class PointWithTest {

    @Test
    public void tochkiDistant() {
        PointWith a = new PointWith(0, 1);
        PointWith b = new PointWith(2, 5);
        double result = a.distanceTo(b);
        assertThat(result, closeTo(4.47, 0.1));
    }
}
