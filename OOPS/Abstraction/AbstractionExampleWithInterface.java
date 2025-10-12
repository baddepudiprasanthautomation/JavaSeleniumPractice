package OOPS.Abstraction;

public class AbstractionExampleWithInterface {
    public static void main(String[] args) {
        AnimalInterface aniInterface = new FirstTest();
        aniInterface.eat();
        aniInterface.makeSound();
    }
}

interface AnimalInterface{
     void eat();
     void makeSound();
}

interface Tree{
    void color();
    void flowers();
    void Appearance();
}

//class Example extends ClassA, ClassB(compiler gets confused)

class FirstTest implements AnimalInterface, Tree{
    @Override
    public void eat(){
        System.out.println("first test method for eat");
    }

    @Override
    public void makeSound() {
        System.out.println("first test method for sound.....");
    }

    @Override
    public void color() {

    }

    @Override
    public void flowers() {

    }

    @Override
    public void Appearance() {

    }
}