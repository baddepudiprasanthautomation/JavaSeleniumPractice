package Collections.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        /*
           It maintains insertion order
           Won't allow duplicate values
         */

            Set<String> linkedSetExample = new LinkedHashSet<String>();
            linkedSetExample.add("ABC");
            linkedSetExample.add("ABC");
            linkedSetExample.add("XYZ");
            linkedSetExample.add("QWE");

        System.out.println(linkedSetExample);

    }
}
