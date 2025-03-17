package com.example;

public class Generics<T> {
    //指向另一个 Generics<T> 类型的对象
    private Generics<T> point;

    //存储类型为 T 的对象
    private T value;

    public Generics(Generics<T> point) {
        this.point = point;
    }

    public Generics(T value) {
        this.value = value;
    }

    public Generics(Generics<T> point, T value) {
        this.point = point;
        this.value = value;
    }

    public Generics<T> getPoint() {
        return point;
    }

    public void setPoint(Generics<T> point) {
        this.point = point;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Generics{" +
                "  point=" + point +
                "  value=" + value +
                "  }";
    }
}