package com.Java14;

import static net.mindview.util.Print.print;

/**
 * Created by  Tang
 * Create Time 2018/9/1 下午 10:14
 */

class C implements  A{

    @Override
    public void f() {
        print("public C.f()");
    }

    public void g() {
        print("public C.g()");
    }

    private void u(){
        print("private C.u");
    }

    protected  void v(){
        print("protected C.v");
    }
}

class B implements A{

    @Override
    public void f() {
        print("public B.f()");
    }
}
public class HiddenC {
    public static A makeA(){
        return new C();
    }
}
