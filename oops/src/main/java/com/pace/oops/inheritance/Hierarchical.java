package com.pace.oops.inheritance;

public class Hierarchical {
    public static void main(String[] args) {
        Dog dog = new Dog("Tyson","America","Pet");
        Cat cat = new Cat("Tom","India","Pet");
        System.out.println("** DOG **\n"+
                "Name : "+dog.name+"\n"+
                "Origin : "+dog.origin+"\n"+
                "Category : "+dog.category+"\n");
        System.out.println("** CAT **\n"+
                "Name : "+cat.name+"\n"+
                "Origin : "+cat.origin+"\n"+
                "Category : "+cat.category);

    }
}
class Animal {
    String name;
    String origin;

    public Animal(String name, String origin) {
        this.name = name;
        this.origin = origin;
    }
}
class Dog extends Animal{
    String category;

    public Dog(String name, String origin, String category) {
        super(name, origin);
        this.category = category;
    }
}
class Cat extends Animal{
    String category;
    public Cat(String name, String origin, String category) {
        super(name, origin);
        this.category = category;
    }
}

