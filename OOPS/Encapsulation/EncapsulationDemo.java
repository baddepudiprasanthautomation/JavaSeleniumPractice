package OOPS.Encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        ExampleEncapsulation encap = new ExampleEncapsulation();
        encap.setAge(10);
        encap.setName("Welcome");

        System.out.println(encap.getAge());
        System.out.println(encap.getName());

    }
}
