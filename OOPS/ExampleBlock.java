package OOPS;

public class ExampleBlock {

    //static block

    public static void main(String[] args) {

        new FirstConstructor();

        System.out.println("Executing second print statement");
    }
    static{System.out.println("this is a block");}
}
