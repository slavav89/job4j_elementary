package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = false;
        for (int i = 0; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (isUpperCase(name)
                    && isEmpty(name)
                    && (isSpecialSymbol(code)
                    || isUpperLatinLetter(code)
                    || isLowerLatinLetter(code)
                    || Character.isDigit(i))) {
                valid = true;
                break;
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return (code != 36 && code != 95);
    }

    public static boolean isUpperLatinLetter(int code) {
        return (65 <= code && code <= 90);
    }

    public static boolean isLowerLatinLetter(int code) {
        return (97 <= code && code <= 122);
    }

    public static boolean isUpperCase(String name) {
        return !Character.isUpperCase(name.charAt(0));
    }

    public static boolean isEmpty(String name) {
        return !name.isEmpty();
    }

}
