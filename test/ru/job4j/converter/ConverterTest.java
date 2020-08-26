package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert110RblThen1Euro() {
        int in = 110;
        int expected = 1;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert120RblThen2Dlr() {
        int in = 120;
        int expected = 2;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert130EuroTo9100Dlr() {
        int in = 130;
        int expected = 9100;
        int out = Converter.euroToRuble(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert140dlrTo8400Rbl() {
        int in = 140;
        int expected = 8400;
        int out = Converter.dollarToRuble(in);
        Assert.assertEquals(expected, out);
    }
}