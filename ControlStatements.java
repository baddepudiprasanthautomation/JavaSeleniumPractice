public class ControlStatements {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int age = 101;
        //I want to check highest number

        if(a>b)
            System.out.println("greater number is "+a);
        else
            System.out.println("greater number is "+b);

        /*
         if and else if
         */

        if (age <= 10)
            System.out.println("these people considered as child");
        else if(age <=10)
            System.out.println("these people considered as teenagers");
        else if(age <=20)
            System.out.println("these people considered as young");
        else
            System.out.println("entered age is invalid");


        String name = "Indiaa";

        if(name.equals("India"))
        {
            System.out.println("country is india");
        }
        else if(name.equals("China"))
        {
            System.out.println("country is China");
        }
        else if(name.equals("Sri lanka"))
        {
            System.out.println("country is Sri lanka");
        }
        else
        {
            System.out.println("Good to go......");
        }
    }
}
