public class CurrentAccountInterestRate implements InterestRate {
    double currentAccountInterestRate = 0.025;

    public double calculateInterestRate(BankAccount bankAccount){
        return bankAccount.balance * currentAccountInterestRate;
    }
}
