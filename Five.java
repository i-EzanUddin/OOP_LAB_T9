class Account{
    protected double Balance;

    public double calculateInterest(double amount){
        //2% interest

        double interestAmt;
        Balance = amount;
        interestAmt = Balance * 0.02;
        return interestAmt;
    }
}
class SavingAcc extends Account{
    @Override
    public double calculateInterest(double amount) {
        double interestAmt;
        Balance = amount;
        interestAmt = Balance * 0.05;
        return interestAmt;
    }
}
class CurrentAcc extends Account{
    @Override
    public double calculateInterest(double amount) {
        double interestAmt;
        Balance = amount;
        if(Balance > 50000){
            interestAmt = Balance * 0.02;
            return interestAmt;
        }
        else{
            return 0;
        }
    }
}
class FixedDepositAcc extends Account{
    @Override
    public double calculateInterest(double amount) {
        double interestAmt;
        Balance = amount;
        interestAmt = Balance * 0.08;
        if(Balance > 200000){
            interestAmt = interestAmt + (Balance * 0.02);
        }
        return interestAmt;
    }
}
public class Five {
    public static void main(String[] args){
        Account a1 = new SavingAcc();
        Account a2 = new CurrentAcc();
        Account a3 = new FixedDepositAcc();
        System.out.println("The interest amount for Saving Account is: "+ a1.calculateInterest(40000));
        System.out.println("The interest amount for Current Account is: "+ a2.calculateInterest(80000));
        System.out.println("The interest amount for Fixed Deposit Account is: "+ a3.calculateInterest(400000));
    }
}
