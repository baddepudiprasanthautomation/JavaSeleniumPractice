package OOPS.Polymorphism;

public class ExamplePolymorphism {
    /*
       compile time polymorphism -> depends on method overloading
       overloading: a class which is having same return type, same name and different arguments
       runtime polymorphism -> depends on method overriding
     */
    public static void main(String[] args) {
        LoginSteps login = new LoginSteps();
        login.login();
        login.login(12345678);
        login.login("username","password");
    }
}

class LoginSteps
{
    public void login()
    {
        System.out.println("normal login");
    }
    public void login(String username, String password)
    {
        System.out.println("login with UN and Pwd");
    }
    public void login(int mobileNumber)
    {
        System.out.println("login with mobile number");
    }
}