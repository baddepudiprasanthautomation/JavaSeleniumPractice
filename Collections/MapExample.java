package Collections;

import sun.java2d.pipe.ShapeSpanIterator;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        /*
           Map - > it is an interface
               stores data in the form of key value pair
         */

        HashMap<String,Integer> hashMap =  new HashMap<String,Integer>();

        //adding information

        hashMap.put("Prasanth",123);
        hashMap.put("Nellore",989);
        hashMap.put("India",91);

        //try to add more countries and codes into the map
        System.out.println(hashMap);

        //for map iteration we need to use entry set concept

        for(Map.Entry map : hashMap.entrySet())
        {
            System.out.println(map.getKey() + "   "+ map.getValue());
        }

        //if country code is more than 50 then print all the countries along with codes


    }
}
