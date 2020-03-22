package com.stubbornboy.proxy.jdkdynamic.main;

import com.stubbornboy.proxy.jdkdynamic.hanlder.ProxyInvokeHandler;
import com.stubbornboy.proxy.jdkdynamic.target.ITargetInterface;
import com.stubbornboy.proxy.jdkdynamic.target.TargetInterfaceImpl;

import java.lang.reflect.Proxy;

public class Test {

    @org.junit.Test
    public void Tests() {
        Class [] classes = new Class[]{ITargetInterface.class};
            ITargetInterface targetInterface = (ITargetInterface) Proxy.newProxyInstance(ITargetInterface.class.getClassLoader(),
                classes, new ProxyInvokeHandler(new TargetInterfaceImpl()));
        // 保存JDK动态代理生成的代理类，类名保存为 UserServiceProxy
        ProxyUtils.generateClassFile(TargetInterfaceImpl.class, "TargetServiceProxy");
        targetInterface.sayHello("world");
        targetInterface.testProxy();
        System.out.println("finish proxy");
    }
}
