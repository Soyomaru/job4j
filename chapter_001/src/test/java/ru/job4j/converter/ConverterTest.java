package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void whenRubleToDollarThen() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(136);
        assertThat(result, is(2));
    }

    @Test
    public void whenRubleToEuroThen() {
        Converter converter = new Converter();
        int result = converter.rubleToEuro(240);
        assertThat(result, is(3));
    }

    @Test
    public void whenDollarToRubleThen() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(5);
        assertThat(result, is(340));
    }

    @Test
    public void whenEuroToRubleThen() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(6);
        assertThat(result, is(480));
    }

}
