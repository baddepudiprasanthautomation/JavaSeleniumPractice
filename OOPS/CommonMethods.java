package OOPS;

public class CommonMethods {
    /*
       get the length of string
     */

    //to write any methods
    //Accessmodifier returntype functionname()

    //AccessModifier : applicable for both class and methods
    /*
       public -  we can access methods&class anywhere in java project
       private - we can access only within class
       default - we can use only with in the package
       protected - we can access with in package and also the class where it is being inherited
     */

    // return type
    /*
       string, void, int, lists, arrays
     */

    // rules for method name
    /*
     It should be lower case
     The second word must be upper case
     */
    public int lengthOfString(String inputString)
    {
          int length = inputString.length();
          return length;
    }

}
