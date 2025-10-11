package OOPS.Polymorphism;

public class PaymentOverride {
    void confirmPayment(){
        System.out.println("payment from parent class");
    }
}
class CreditCardPayment extends PaymentOverride{
    @Override
    void confirmPayment(){
        System.out.println("credit card payment");
    }
}
