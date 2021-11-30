public class DepositAccountInterestRate implements InterestRate{
    double depositAccountInterestRate = 0.031;

    public double calculateInterestRate(BankAccount bankAccount){
        return bankAccount.balance * depositAccountInterestRate;
    }
}
