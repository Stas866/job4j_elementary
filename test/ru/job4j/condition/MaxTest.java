package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenLeftMaxThenRight() {
        int result = Max.max(3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenRightMaxThenLeft() {
        int result = Max.max(1, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenLeftEqualsRight() {
        int result = Max.max(1, 1);
        assertThat(result, is(1));
    }
}