package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        char[] array = name.toCharArray();
        boolean valid = !name.isEmpty() && isUpperCase(name) && !Character.isDigit(array[0]);
        if (valid) {
            for (int i = 1; i < name.length(); i++) {
                int code = name.codePointAt(i);
                if (isSpecialSymbol(code)
                        && isUpperLatinLetter(code)
                        && isLowerLatinLetter(code)
                        && Character.isDigit(i)) {
                    valid = false;
                    break;
                }
            }
        }
        return valid;

    }

    public static boolean isSpecialSymbol(int code) {
        return (code == 36 || code == 95);
    }

    public static boolean isUpperLatinLetter(int code) {
        return (65 > code || code > 90);
    }

    public static boolean isLowerLatinLetter(int code) {
        return (97 > code || code > 122);
    }

    public static boolean isUpperCase(String name) {
        return !Character.isUpperCase(name.charAt(0));
    }

}
