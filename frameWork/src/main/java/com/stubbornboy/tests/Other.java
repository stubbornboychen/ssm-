package com.stubbornboy.tests;

import org.openjdk.jol.info.ClassLayout;

public class Other {
    private static final int MAXIMUM_CAPACITY = 1 << 30;

    private static int get(int c) {
        int n = c - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    public static void main(String[] args) {
      /*  Other other = new Other();
        new Thread(new Runnable() {
            @Override
            public void run() {
                other.get();
            }
        }, "aa").start();
        new Thread(other::get, "t1").start();
        Object o = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());*/
        Integer a = 500;
        Integer b = 500;
        System.out.println(a == b);
    }
}
