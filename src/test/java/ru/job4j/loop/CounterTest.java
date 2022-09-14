package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenSumNumbersFromOneToTenThenFiftyFive() {
        int start = 1;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 55;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromThreeToTwelveThenForty() {
        int start = 3;
        int finish = 12;
        int result = Counter.sumByEven(start, finish);
        int expected = 40;
        assertThat(result).isEqualTo(expected);
    }
}