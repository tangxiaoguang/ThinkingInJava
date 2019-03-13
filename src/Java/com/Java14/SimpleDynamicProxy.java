package com.Java14;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static net.mindview.util.Print.print;

/**
 * Created by  Tang
 * Create Time 2018/8/24 下午 9:19
 */
interface  Interface{
    void doSomething();
    void somethingElse(String arg);
}

class RealObject implements Interface{

    @Override
    public void doSomething() {
        print("doSomething");
    }

    @Override
    public void somethingElse(String arg) {
        print("somethinkElse  "+arg);
    }
}
class DynamicProxyHandler implements InvocationHandler{

    private Object proxied;

    public DynamicProxyHandler(Object proxied){
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("**** proxy: "+proxied.getClass() +",+method: "+method+ ",args: "+args);
        return method.invoke(proxied,args);
    }
}

public class SimpleDynamicProxy {

    public static void consumer(Interface iface){
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);
        Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(),new Class[]{Interface.class},new DynamicProxyHandler(real));
        consumer(proxy);
    }
}
