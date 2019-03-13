package com.demo;

/**
 * Created by  Tang
 * Create Time 2018/6/24 上午 11:35
 */
interface Content{

    void value();

}
public class Parcel7 {

    public Content content(final int i){
        return new Content(){
            private int c = i;
            public void value(){
                c = c+1;
                System.out.println("tangxiaoguang"+c);
            };
            public void fun(int b){
                b = b+1;
            }
        };
    }

    public Base base(){
        return new Base(78){
            {System.out.println("this is shilihua");}
            public void fun(){
                System.out.print("this is fun");
            }
        };
    }
    public class Child extends Base{
        public Child(int i){
            super(i);
        }
        public void fun(){};
    }
    public static void main(String[] args) {
        Parcel7 parcel7 = new Parcel7();
////        parcel7.content(5).value();
//        parcel7.base();
        Parcel7.Child child = parcel7.new Child(7);
    }
}

abstract class Base{
    Base(int i ){
        System.out.println("this is int "+i);
    }
    public abstract void fun();
}