package com.stubbornboy.proxy.jdkdynamic.target;

public class TargetInterfaceImpl implements ITargetInterface {
    public void sayHello(String words) {
        System.out.println("hello" + words);
    }

    public void testProxy() {
        System.out.println("test proxy");
    }
}
