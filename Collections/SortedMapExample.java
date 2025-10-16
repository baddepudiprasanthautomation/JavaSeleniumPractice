package Collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args) {
        //sorted map is an interface


        SortedMap<Integer,String> sortedMap =new TreeMap<Integer,String>();

        sortedMap.put(10,"ABC");
        sortedMap.put(9,"xyz");
        sortedMap.put(11,"ABC");

        System.out.println(sortedMap);


    }
}
