package com.generics;

/**
 * @Author: tang
 * @Date: 2019/3/17 12:08
 * create by IntelliJ IDEA
 */
public class LinkedStack<T> {

    private static class Node<U>{
        U item;
        Node<U> next;

        Node(){
            this.item=null;
            this.next=null;
        }
        Node(U item,Node<U>next){
            this.item = item;
            this.next = next;
        }
        public boolean end(){
            return this.item==null&&this.next==null;
        }
    }

    private Node<T> top = new Node<>();
    public void push(T item){
        top = new Node<>(item,top);
    }
    public T pop(){
        T result = top.item;
        if(!top.end())
            top = top.next;

        return result;
    }
    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<String>();

        for (String str:"phasers on stun!".split(" "))
            lss.push(str);

        String s;
        while ((s = lss.pop()) != null)
            System.out.println(s);
    }

}
