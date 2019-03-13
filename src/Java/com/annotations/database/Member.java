package com.annotations.database;

/**
 * Created by  Tang
 * Create Time 2018/9/9 下午 2:47
 */
@DbTable(name = "MEMBER")
public class Member {
    @SQLString(30) String Fristname;
    @SQLString(50) String lastName;
    @SQLInteger Integer age;
    @SQLString(value = 30,constraints = @Constraints(primaryKey = true)) String handle;
    static int memberCount;
    public String getFristname(){return  Fristname;}
    public String getLastName(){return  lastName;}
    public String getHandle(){return  handle;}
    public Integer getAge(){return  age;}

    @Override
    public String toString() {
        return handle;
    }
}
