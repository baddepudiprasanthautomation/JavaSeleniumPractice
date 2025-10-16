package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        /*
            Set -> Interface
             | HashSet
             | Linked HashSet
             | TreeSet
         */
          Set<String> fruits = new HashSet<String>();

          /*
             It allows only unique values
           */

          fruits.add("Apple");
          fruits.add("Banana");
          fruits.add("mango");
          fruits.add("Apple");
          fruits.add("Banana");

          System.out.println(fruits);

          for(String fruit: fruits)
          {
              if(fruit.equals("Apple")){
                  System.out.println(fruit);
              }
          }

          System.out.println("using iterator");

        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
