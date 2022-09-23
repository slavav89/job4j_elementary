package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[]{3, 5, 9, 11};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHas10Then1() {
        int[] data = new int[]{3, 10, 5, 9, 11, 10};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int expected = 3;
        int result = FindLoop.indexInRange(data, el, start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 8;
        int start = 2;
        int finish = 4;
        int expected = -1;
        int result = FindLoop.indexInRange(data, el, start, finish);
        assertThat(result).isEqualTo(expected);
    }
}
