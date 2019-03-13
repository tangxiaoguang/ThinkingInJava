package com.hode;

import java.util.LinkedList;
import java.util.Objects;

/**
 * Created by  Tang
 * Create Time 2018/7/8 下午 10:19
 */
public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<T>();

    public void push(T v){storage.addFirst(v);}

    public T peek(){return storage.getFirst();}

    public T pop(){return storage.removeFirst();}

    public boolean empty(){return storage.isEmpty();}

    public String toString(){return storage.toString();}

    private static char c;

    public static void main(String[] args) {

        String str = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";

        Stack<Character> stack = new Stack<Character>();

        for(int i = 0;i<str.length();i++){
            c = str.charAt(i);
            if(c=='+'){
                stack.push(str.charAt(i+1));
                System.out.println("add Character element "+stack.peek());
                i++;
            }

            if(c=='-'){
                System.out.println("pop Character element "+stack.pop());
            }

//            System.out.println();
        }

    }
}

