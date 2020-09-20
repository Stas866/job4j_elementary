package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (char index = 0; index < word.length && index < pref.length; index++) {
            if (word[index] != pref[index]) {
                result = false;
                break;
            }

        }
        return result;
    }
}
