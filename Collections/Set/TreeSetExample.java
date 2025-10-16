package Collections.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        /*
            It will not allow duplicates
            It will sort the data
         */
            Set<Integer> example = new TreeSet<Integer>();
            example.add(99);
            example.add(87);
            example.add(123);
            example.add(123);
            example.add(21);

            for(Integer i: example)
                System.out.println(i);

    }
}
