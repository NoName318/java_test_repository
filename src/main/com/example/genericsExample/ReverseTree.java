package com.example.genericsExample;

public class ReverseTree<T> {
    //指向另一个 Generics<T> 类型的对象
    private ReverseTree<T> point;

    //存储类型为 T 的对象
    private T value;

    public ReverseTree(ReverseTree<T> point) {
        this.point = point;
    }

    public ReverseTree(T value) {
        this.value = value;
    }

    public ReverseTree(ReverseTree<T> point, T value) {
        this.point = point;
        this.value = value;
    }

    public ReverseTree<T> getPoint() {
        return point;
    }

    public void setPoint(ReverseTree<T> point) {
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