package ExceptionHandling;

public class ExampleThrow {
    public static void main(String[] args) {
        int age = 20;
        if(age <18)
            throw new ArithmeticException();
        else
            System.out.println("age is eligible");
    }
}
