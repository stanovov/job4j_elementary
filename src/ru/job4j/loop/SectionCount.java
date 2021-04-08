package ru.job4j.loop;

public class SectionCount {
    public static int count(int length, int section) {
        int count = 0;
        int sections = section;
        while (sections <= length) {
            sections += section;
            count++;
        }
        return count;
    }
}
