package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();

        linkedHashMap.put(1,"ABC");
        linkedHashMap.put(9,"ghj");
        linkedHashMap.put(7,"ERT");
        linkedHashMap.put(8,"ABC");
        linkedHashMap.put(4,"ABC");

        System.out.println(linkedHashMap);

        for(Map.Entry<Integer, String> map: linkedHashMap.entrySet()){
            System.out.println(map.getKey() + "   "+map.getValue());
        }
    }
}
