package com.demo;

/**
 * Created by  Tang
 * Create Time 2018/6/20 下午 8:03
 */
public class Test implements I1{

//    public String str = "tangxiaoguang";

    Test(){System.out.println("this is Test");}
    private C1 t = new C1(123);
    public void f(){ System.out.println(this.str);};

    public static void main(String[] args) {
        Test str = new Test();
        str.f();
        System.out.println(str.str);
        System.out.println(I2.a);
    }

}



interface I1{ String str ="hahahahahah"; void f( );int data =1;}

interface  I2{int f(int i); int a = 1;}

interface I3{int f(String str);}

class C1{
     C1(int i){
        System.out.println("this is C1"+i);
    }
    public int f(){return 1;}}

class C2 implements I1,I2 {public void f(){};public int f(int i){return i;}}

class C3 extends C2 implements I3{public int f(String i){return 1;}}