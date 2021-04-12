package ru.job4j.array;

public class WordsToText {
    public static String convert(String[] words) {
        StringBuilder sb = new StringBuilder();
        if (words.length > 0) {
            sb.append(words[0]);
        }
        for (int i = 1; i < words.length; i++) {
            sb.append(" ");
            sb.append(words[i]);
        }
        return sb.toString();
    }
}
