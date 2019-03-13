package com.Java14;

import static net.mindview.util.Print.print;

/**
 * Created by  Tang
 * Create Time 2018/8/7 下午 9:31
 */
public class ToyTest {
    static void printInfo(Class cc){
        print("Class name: "+cc.getName()+
                "is interface? ["+cc.isInterface()+ "]"
                );
        print("Simple name:"+cc.getSimpleName());
        print("Canonical name :"+cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try{
            c= Class.forName("com.Java14.FacyToy");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        printInfo(c);
//        print(c.getInterfaces());

        for(Class face:c.getInterfaces())
            printInfo(face);
        Class up = c.getSuperclass();
        Object obj = null;
        try{
            obj = up.newInstance();
        } catch (IllegalAccessException e) {
            print("Cannot instantiate");System.exit(1);
        } catch (InstantiationException e) {
            print("cannot access");
            System.exit(1);
        }

        printInfo(obj.getClass());
    }

}

interface HasBatteries{}
interface Waterproof{}
interface Shoots{}

class Toy{
    Toy(){};
    Toy(int i){}
}

class FacyToy extends Toy implements HasBatteries,Waterproof,Shoots{

    FacyToy(){
        super(1);
    }
}