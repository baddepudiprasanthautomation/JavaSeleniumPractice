package OOPS.Inheritance;

public class MultiLevelInheritance {

    public static void main(String[] args) {
        Puppy pup = new Puppy();
        pup.sleep();
        pup.eat();
        pup.bark();
    }
}

/*
    classB -> ClassA || classC - > ClassB || classD -> classC
 */

class Animal
{
    public void eat(){
        System.out.println("eating");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("barking");
    }
}
class Puppy extends Dog{
    public void sleep(){
        System.out.println("sleeping");
    }
}