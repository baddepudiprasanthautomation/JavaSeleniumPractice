package OOPS.Polymorphism;

public class ExampleOverRiding {
    public static void main(String[] args) {
                RBI sbi = new RBI(1000);
        System.out.println(sbi.calculateInterest());
    }
}


class RBI{
    double balance;

    RBI(double balance) {
        this.balance = balance;
    }

      protected double calculateInterest(){
        return balance * 0.3;
    }
}

class SBI extends RBI{

    SBI(double balance) {
        super(balance);
    }

    @Override
     public double calculateInterest() {
        return balance * 0.2;
    }
}