package com.tuean.aim2offer;

public class Singleton {

    // 单例模式

    Singleton() {}

    public static Singleton Instance() {
        return Nested.instant;
    }

    static class Nested {
        private Nested() {}

        static Singleton instant = new Singleton();
    }


}
