package OOPS.Inheritance;

public class HierarchicalInheritance {
    public static void main(String[] args) {
        DogExample example = new DogExample();
        CatExample exampleCat = new CatExample();

        example.bark();
        exampleCat.sleep();

    }
}


class AnimalExample
{
    public void eat(){
        System.out.println("eating");
    }
}
class DogExample extends AnimalExample{
    public void bark(){
        System.out.println("dog is barking");
    }
}
class CatExample extends AnimalExample{
    public void sleep(){
        System.out.println("cat is sleeping");
    }
}
