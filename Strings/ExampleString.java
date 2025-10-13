package Strings;

public class ExampleString {
    public static void main(String[] args) {
        String str = "Prasanth";//Stored in string constant pool(It is a special memory area inside java heap

        String name = new String("Prasanth");//stored in Heap

        String anotherName = new String("Prasanth");//different object

        str = "Andhra";

        if(str.equals(name))
            System.out.println("true");


        StringBuilder build = new StringBuilder("welcome to automation test");

      //  build.reverse();
        System.out.println("reversed string "+ build);

        build.replace(0,6,"Hello");

        System.out.println(build);



    }
}
