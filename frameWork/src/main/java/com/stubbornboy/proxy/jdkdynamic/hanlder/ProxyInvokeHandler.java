package com.stubbornboy.proxy.jdkdynamic.hanlder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class ProxyInvokeHandler implements InvocationHandler {
    private Object target;

    public ProxyInvokeHandler(Object target){
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before proxy");
        Object object = method.invoke(target, args);
        System.out.println("after proxy");
        return object;
    }
}
