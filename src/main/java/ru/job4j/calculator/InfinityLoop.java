package ru.job4j.calculator;

public class InfinityLoop {
    public static void main(String[] args) {
        for (int index = 0; index <= 5; ++index) {
            System.out.println(index);
        }
    }
}