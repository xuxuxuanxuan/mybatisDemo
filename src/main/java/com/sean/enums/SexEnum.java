package com.sean.enums;


/**
 * @Author: sean.xu
 * @Date: 2020/4/17
 */
public enum SexEnum {

   MALE(0,"男"),

   FEMALE(1,"女");

    private int id;

    private String name;

    SexEnum(int id,String name){
        this.id = id;
        this.name = name;
    }
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public static SexEnum getSex(int id){
        for (SexEnum sex : SexEnum.values()){
            if (sex.getId() == id){
                return sex;
            }
        }
        return null;
    }
}
