package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortThreeFigures() {
        int[] data = new int[]{9, 1, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 5, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortFiveFigures() {
        int[] data = new int[]{8, 4, 6, 2, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{0, 2, 4, 6, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortSevenFigures() {
        int[] data = new int[]{8, 4, 6, 2, 0, 10, 12};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{0, 2, 4, 6, 8, 10, 12};
        assertThat(result).containsExactly(expected);
    }
}