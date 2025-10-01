package ProgramsStrings;

import OOPS.CommonMethods;

public class CalculateStringLength {
    public static void main(String[] args) {
        //we can create object with the help of new key word

        CommonMethods common = new CommonMethods(); // creation of object

        ExampleOfStaticVariable example = new ExampleOfStaticVariable();

        int length = common.lengthOfString("AutomationTesting");
        System.out.println("length of string is "+length);

        //usage of static variable

        System.out.println(ExampleOfStaticVariable.number);
        System.out.println(example.name);


    }
}
