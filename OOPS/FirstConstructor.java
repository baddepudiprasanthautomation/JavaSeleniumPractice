package OOPS;

public class FirstConstructor {
    /* Rules
     constructor name must be same as class name
     Constructor does not have any kind of return type
     constructor cannot be static, abstract and final
     */

    public FirstConstructor()
    {
        System.out.println("calling default constructor");
    }

    public FirstConstructor(String username)
    {
        System.out.println("using username  " + username);
    }

    public FirstConstructor(String username, String password)
    {
        System.out.println("logging into application using username "+ username +"and password "+ password);
    }


}
