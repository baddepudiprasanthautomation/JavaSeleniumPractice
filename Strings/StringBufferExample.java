package Strings;
import java.lang.StringBuffer;
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer buff = new StringBuffer("Welcome automation");

        buff.append("abcd");

        System.out.println(buff);


        /*
            Mutable - can be modified after the object is created
         */

        StringBuilder sb = new StringBuilder("Welcome");

        sb.append("  home");

        System.out.println(sb);

        /*
           Immutable - cannot be modified after the object is created
         */

        String s = "Welcome";
        s.concat("  home");

        System.out.println(s);
        System.out.println("adding new value to s");
        System.out.println(s+"abcd");
        System.out.println("actual value is "+s);
    }
}
