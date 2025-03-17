package com.example;

public class Generics<T> {
    private Generics<T> g;

    // 默认构造函数
    public Generics() {
    }

    // 带参数的构造函数
    public Generics(Generics<T> g) {
        this.g = g;
    }

    // 静态泛型方法，用于打印数组
    public static <E> void printArray(E[] inputArray) {
        if (inputArray == null) {
            System.out.println("Input array is null.");
            return;
        }

        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Generics{" +
                "g=" + g +
                '}';
    }
}