public class InterestRate {

    public double calculateInterestRate(BankAccount bankAccount){
        if(bankAccount instanceof CurrentAccount)
            return bankAccount.balance * 0.025;
        else if(bankAccount instanceof SavingsAccount)
            return bankAccount.balance * 0.04;
        else if(bankAccount instanceof  DepositAccount)
            return bankAccount.balance * 0.031;
        else
            return 0;
    }
}
