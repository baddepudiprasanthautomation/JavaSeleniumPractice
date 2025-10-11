package OOPS.Polymorphism;

public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
       // Cat cat = new Cat();
       // cat.sound();
    }
}

/*
   Inheritance is involved
 */

class Animal{
    void sound(){
        System.out.println("Animal is making sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog is barking...");
    }
}

class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("Cat is making sound");
    }
}