package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                for (int i = index + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        String temp = array[index];
                        array[index] = array[i];
                        array[i] = temp;
                        break;
                    }
                }
            }
        }
        return array;
    }
}

