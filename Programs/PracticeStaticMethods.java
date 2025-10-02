package Programs;

import OOPS.ExampleStaticMethods;

public class PracticeStaticMethods {
    public static void main(String[] args) {

        //accessing method using object creation
        ExampleStaticMethods example = new ExampleStaticMethods();
        int square = example.squareOfNumber(10);
        System.out.println(square);

        /* accessing static variable using object reference */

        int number = example.num;

        //accessing method using "classname.method" formula

        int output = ExampleStaticMethods.squareOfNumber(9);

        System.out.println(output);
        int a = ExampleStaticMethods.num;
        /* non static */

        int result = example.productOfNumbers(3,6);
        System.out.println("product of two numbers is  "+result);
    }
}
