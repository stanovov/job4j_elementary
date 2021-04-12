package ru.job4j.array;

public class Initials {
    public static String convert(String[] fio) {
        StringBuilder sb = new StringBuilder(fio[0]);
        sb.append(" ");
        sb.append(fio[1].charAt(0));
        sb.append(".");
        sb.append(fio[2].charAt(0));
        sb.append(".");
        return sb.toString();
    }
}
