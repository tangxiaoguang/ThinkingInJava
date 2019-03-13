package com.Java14;

import java.util.Arrays;
import java.util.List;

import static net.mindview.util.Print.print;

/**
 * Created by  Tang
 * Create Time 2018/8/7 下午 10:16
 */
abstract class Shape {
    void draw() { System.out.println(this + ".draw()"); }
    abstract public String toString();
}

class Circle extends Shape {
    public String toString() { return "Circle"; }
}

class Square extends Shape {
    public String toString() { return "Square"; }
}

class Triangle extends Shape {
    public String toString() { return "Triangle"; }
}

class Rhomboid extends Shape {
    public String toString() { return "Rhomboid"; }
}

class Tang extends Rhomboid{
    public String toString() { return "Tang"; }
}
public class Shapes {
    public static void main(String[] args) {
//        List<Shape> shapeList = Arrays.asList(
//                new Circle(), new Square(), new Triangle(),new Rhomboid()
//        );
//        for(Shape shape : shapeList)
//            shape.draw();
//
//        Rhomboid rhomboid = new Rhomboid();
//        boolean shape = rhomboid instanceof Shape;
//        print(shape);
//        if(Class.forName("Rhomboid").getSuperclass()==)
//        try {
//            Class a = Class.forName("com.Java14.Tang");
//            print(a.getSuperclass().getSuperclass().getSuperclass());
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        Rhomboid rhomboid = new Rhomboid();
        Class<? extends Shape> shape = Tang.class;
        shape = Rhomboid.class;
        shape = Square.class;
System.out.print(Rhomboid.class.getName());
    }
}