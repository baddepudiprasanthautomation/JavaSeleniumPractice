package Programs;

public class StarPattern {
    public static void main(String[] args) {

        /*

        *
        * *
        * * *
        * * * *
        * * * * *

        rows - 5
        columns - 5
         */

        /*
             i = 1
             j = i

             i = 2
             j = 2
             condition for j: 0>=1
         */
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}

/*
   *
   * *


 */