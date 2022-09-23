package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int x = word.length - post.length;
        for (int i = 0; i < post.length; i++) {
            if (word[x + i] != post[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
