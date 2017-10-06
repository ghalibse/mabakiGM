package com.example.qzm4sy.serializationdemo;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;


@Table(name = "MyTable")
public class MyPojo  extends Model{

    @Column( name = "pname")
    public String name;

    @Column( name = "pnumber")
    public long number;

    public MyPojo(String name, long number) {
        super();

        this.name = name;
        this.number = number;
    }

    public static List<MyPojo> getAllData(){

        return new Select().from(MyPojo.class).execute();
    }

}
