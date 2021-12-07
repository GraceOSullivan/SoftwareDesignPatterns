public class SMSObserver implements Observer {
    private Subject bankAccount;

    public SMSObserver(Subject bankAccount) {
        this.bankAccount = bankAccount;
        bankAccount.registerObserver(this);
    }

    @Override
    public void update(double balance) {
        System.out.println("Sending SMS Message: Balance is now €" + balance);
    }
}