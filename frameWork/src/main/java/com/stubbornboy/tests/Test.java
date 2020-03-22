package com.stubbornboy.tests;

import com.stubbornboy.tests.loader.Classloader;

public class Test {
    public static void main(String[] args) {
        //自定义类加载器
        Classloader classloader = new Classloader();
        //应用类加载器
        System.out.println(classloader.getParent());
        System.out.println(ClassLoader.getSystemClassLoader());
        //扩展类加载器
        System.out.println(ClassLoader.getSystemClassLoader().getParent());
        //启动类加载器
        System.out.println(ClassLoader.getSystemClassLoader().getParent().getParent());
    }
}
