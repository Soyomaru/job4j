package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class FitTest {
    //Проверю какая у меня должна быть масса тела при своём росте
    @Test
    public void manWeight() {
        Fit fit = new Fit();
        double weight = fit.manWeight(189);
        assertThat(weight, closeTo(102.35, 0.1));
    }

    @Test
    public void womanWeight() {
        Fit fit = new Fit();
        double weight = fit.womanWeight(170);
        assertThat(weight, closeTo(69.0, 0.1));
    }
}
