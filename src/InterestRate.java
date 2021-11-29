public class InterestRate {

    public double calculateCurrentAccountInterestRate(double accountBalance){
        return accountBalance * 0.025; //2.5%
    }

    public double calculateSavingsAccountInterestRate(double accountBalance){
        return accountBalance * 0.04; //4%
    }
}
