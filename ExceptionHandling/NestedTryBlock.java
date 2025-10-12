package ExceptionHandling;

public class NestedTryBlock {
    public static void main(String[] args) {
        try{

            try{
                System.out.println("nested try ");
            }
            catch (Exception exception)
            {
                System.out.println("sovjvow");
            }
        }
        catch (Exception ex){
            System.out.println("exception ex");
        }
    }
}
