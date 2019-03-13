package com.Java11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by  Tang
 * Create Time 2018/7/25 下午 9:31
 */
public class Java10_27 {

    public static void main(String[] args) {

        Queue<Command> queue = new LinkedList<Command>();
        queue.add(new Command("a"));
        queue.add(new Command("b"));
        queue.add(new Command("c"));

Iterator<Command> it = queue.iterator();

    }
}

class Command{

    private  String str;
    Command(String str){
        this.str = str;
    }
    public void operation(){
        System.out.print(str);
    }
}

class QueenModel{

}