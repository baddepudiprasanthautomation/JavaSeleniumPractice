package ExceptionHandling;

public class FirstExampleOfException {
    public static void main(String[] args) {

        try{
            int a = 10;
            int b = 0;
            int c = a/b;
        }
        catch (ArithmeticException excep){
            System.out.println("exception occurred "+ excep.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch (Exception exception){
            System.out.println("exception occurred "+ exception.getMessage());
        }
        finally{
            System.out.println("mandatory code will be executed, irrespective of test case" +
                    "status in try and catch block");
        }
    }
}
