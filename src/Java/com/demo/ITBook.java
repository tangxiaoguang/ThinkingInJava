package com.demo;

/**
 * Created by  Tang
 * Create Time 2018/6/22 下午 9:34
 */

interface book{
    Object current();
    //    void name();
    boolean end();
    void next();
}
public class ITBook {

    private Object[] items;
    private int next=0;

    ITBook(int size){
        items=new Object[size];
    }

    public void add(Object x){
        if(next<items.length)
            items[next++] = x;
    }

    private class JavaBook implements book{
        private int i =0;
        public void next(){
            if(i<items.length)
                i++;
        }

        @Override
        public boolean end() {
            return items.length==i;
        }

        @Override
        public Object current() {
            return items[i];
        }
    }

    public JavaBook javaBook(){
        return new JavaBook();
    }
     static class PHPBook{
        Object current(Object a){ return a;};
        //    void name();
//        public boolean end(){return 1=1;};
        public void next(){};
    }
    public static void main(String[] args) {
        ITBook itBook = new ITBook(10);
        PHPBook a = new PHPBook();
        for(int i =0 ;i<10;i++)
            itBook.add(i);
        book javaBook =itBook.javaBook();
        while(!javaBook.end()){
            System.out.print(javaBook.current()+" ");
            javaBook.next();
        }


    }

}
