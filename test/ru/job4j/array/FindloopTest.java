package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindloopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = Findloop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas4then1() {
        int[] input = {5, 4, 3, 2};
        int value = 4;
        int result = Findloop.indexOf(input, value);
        int expect = 1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas3Then3() {
        int[] input = {5, 4, 3, 2};
        int value = 3;
        int result = Findloop.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input =  {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = Findloop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenNotFind3() {
        int[] input =  {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = Findloop.indexOf(input, value, start, finish);
        int expect = 10;
        assertThat(result, is(expect));

    }
}