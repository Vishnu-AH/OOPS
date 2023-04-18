package com.pace.oops.inheritance;

public class MultiLevel {
    public static void main(String[] args) {
        Child child = new Child("Ram","Arjun","Krishna");
        System.out.println("GrandFather name : "+child.GFName+"\n"+
                "Father name : "+child.fatherName+"\n"+
                "Child name : "+child.name);
    }
}
class GrandFather{
    String GFName;

    public GrandFather(String GFName) {
        this.GFName = GFName;
    }
}
class Father extends GrandFather{
    String fatherName;

    public Father(String GFName,String fatherName) {
        super(GFName);
        this.fatherName = fatherName;
    }
}
class Child extends Father{
    String name;

    public Child(String GFName, String fatherName, String name) {
        super(GFName, fatherName);
        this.name = name;
    }
}