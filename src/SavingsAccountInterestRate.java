public class SavingsAccountInterestRate implements InterestRate {
    double savingsAccountInterestRate = 0.04;

    public double calculateInterestRate(BankAccount bankAccount){
        return bankAccount.balance * savingsAccountInterestRate;
    }
}

