package OOPS.Encapsulation;

import OOPS.CommonMethods;

import java.util.ArrayList;

public class PackagesExample {
    public static void main(String[] args) {
        /*
           -> package is a way to group related classes, interfaces and sub packages together.
           -> It helps to organize classes and interfaces in a logical manner, helping to avoid
              naming conflicts and control access.

         */

        /*
                Builtin package - it comes along with java
         */
            ArrayList list = new ArrayList<>();

            /*
                Custom Package - we will create manually
             */
            CommonMethods common  = new CommonMethods();
    }
}
