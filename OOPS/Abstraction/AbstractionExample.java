package OOPS.Abstraction;

public class AbstractionExample {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Dog dogg = new Dog();

        animal.eat();
        dogg.makeSound();
    }

    /*
       2 ways to achieve abstraction
         Abstract Class
         Interfaces
     */
}

abstract class Animal{

    abstract void makeSound();

    void eat(){
        System.out.println(" this animal eats food");
    }
}
class Dog extends Animal{

    void makeSound() {
        System.out.println("dog barks.....");
    }
}