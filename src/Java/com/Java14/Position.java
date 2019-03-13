package com.Java14;

/**
 * Created by  Tang
 * Create Time 2018/8/27 下午 10:00
 */
public class Position {

    private String title;

    private Person person;

    public Position(String jobTitle,Person employee){

        title = jobTitle;

        person = employee;

        if(person==null)
            person = Person.NULL;
    }

    public Position(String jobTitle){
        title = jobTitle;
        person = Person.NULL;
    }

    public  String toString(){
        return "Position: "+title+" "+person;
    }
}
