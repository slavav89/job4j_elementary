package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (symbol == currentSymbol) {
                counter++;
            } else {
                result = result + symbol + (counter == 1 ? "" : counter);
                symbol = currentSymbol;
                counter = 1;
            }
        }
        result = result + symbol + (counter == 1 ? "" : counter);
        return result;
    }
}
