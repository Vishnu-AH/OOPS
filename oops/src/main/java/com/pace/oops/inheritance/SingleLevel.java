package com.pace.oops.inheritance;

class Person {
    int id;
    String name;
    long phone;

    public Person(int id, String name, long phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }
}
class Student extends Person {
    String school;
    String address;

    public Student(int id, String name, long phone,String school,String address) {
        super(id, name, phone);
        this.school = school;
        this.address = address;
    }
}
public class SingleLevel {
    public static void main(String[] args) {
        Student student = new Student(10,"Vishnu",9834765344l,"BGS","BLR");
        System.out.println("Id : "+student.id+"\n"+
                "Name : "+student.name+"\n"+
                "Phone : "+student.phone+"\n"+
                "School : "+student.school+"\n"+
                "Address : "+student.address);
    }
}
