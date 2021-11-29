public class InterestRate {

    public double calculateCurrentAccountInterestRate(BankAccount currentAccount, double accountBalance){
        return accountBalance * 0.025; //2.5%
    }

    public double calculateSavingsAccountInterestRate(BankAccount savingsAccount, double accountBalance){
        return accountBalance * 0.04; //4%
    }
}
