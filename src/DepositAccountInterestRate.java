public class DepositAccountInterestRate implements InterestRate{
        public double calculateInterestRate(BankAccount bankAccount){
            return bankAccount.balance * 0.031;
        }
}
