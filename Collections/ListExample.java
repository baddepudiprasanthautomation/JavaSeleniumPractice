package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();

        names.add("India");
        names.add("Japan");
        names.add("China");
        names.add("India");
        names.add("Japan");
        names.add("China");
        names.add("India");
        names.add("Japan");
        names.add("China");
        names.add("India");
        names.add("Japan");
        names.add("China");
        names.add("India");
        names.add("Japan");
        names.add("China");
        names.add("India");
        names.add("Japan");
        names.add("");
        names.add("China");
// allows null values
        names.add("");
        System.out.println(names.get(0));

        for(String name : names)
        {
            System.out.println(name);
        }

        //get()-> to get information from list
        //set()-> to set values into list
    }
}
