package ru.job4j.calculator;

public class ArgMethod {

    public static void hello() {
        System.out.println("Hello");
    }

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void hello(int age) {
        System.out.println("age: " + age);
    }

    public static void hello(String name, int age) {
        hello(name);
        hello(age);
    }

    public static void hello(String... names) {
        for (String name : names) {
            hello(name);
        }
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;

        ArgMethod.hello();

        ArgMethod.hello(name, age);

        ArgMethod.hello(age);

        ArgMethod.hello(name, name, name);
    }
}
