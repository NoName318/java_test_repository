package com.example.enumExample;

public enum COLOR {
    RED("#FF0000") {
        @Override
        public void describe() {
            System.out.println("这是红色");
        }
    },
    BLUE("#0000FF") {
        @Override
        public void describe() {
            System.out.println("这是蓝色");
        }
    };

    private final String code;

    COLOR(String code){
        this.code=code;
    }

    public String getCode(){
        return this.code;
    }

    // 抽象方法，每个枚举常量需要实现
    public abstract void describe();

}
