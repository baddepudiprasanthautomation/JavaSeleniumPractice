public class Operators {
    public static void main(String[] args) {

        //Unary operator { we deal with + and -}
        int a = -20;
        System.out.println(a);

        //logical operator { ! }

        String statement1 = "saturday";
        String statement2 = "sunday";

        String day = "saturday";


        if(!day.equals(statement1))
        {
            System.out.println("not same");
        }
        else
        {
            System.out.println("same");
        }

        /* Arithmetic Operators
        + - Addition
        - - Subtraction
        * - Multiplication
        / - Division
        % _ to get remainder
         */

        /*
        Ternary Operator
        symbol as '?'

         */

        int abc = 123;
        int def = 456;

        int max = (abc>def)?abc:def;
        System.out.println(max);

        /*
        Logical Operators
           && and ||

         */

        int number = 1;
        String name = "prasanth";

        if(number >=10 && name.equals("prasan"))
        {
            //true && true  => true
            System.out.println("both number and names are matching");
        }
        else
        {
            System.out.println("not matching");
        }

        /*
            ||  Operator
         */
        if(number >=10 || name.equals("prasan"))
        {
            //true || true  => true
            //true || false => true
            //false || true => true
            //false || false => false
            System.out.println("number and names any one of is matching");
        }
        else
        {
            System.out.println("not matching");
        }

        /*
           Increment ++,
             int a =10;
             pre increment  => ++a;
             post increment => a++;
           Decrement --

         */

        int xyz = 20;
        ++xyz;
        System.out.println("pre increment of given number is "+ xyz*2);

        int gf = 99;
        gf++;
        System.out.println("before increment of given number is "+ gf++);

        System.out.println("After increment of given number is "+ gf);

    }
}
