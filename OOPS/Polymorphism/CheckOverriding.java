package OOPS.Polymorphism;

public class CheckOverriding {
    public static void main(String[] args) {
        PaymentOverride pay = new CreditCardPayment();
        pay.confirmPayment();

        PaymentOverride pay2 = new PaymentOverride();
        pay2.confirmPayment();
    }
}
