public class EmailObserver implements Observer {
    private Subject bankAccount;

    public EmailObserver(Subject bankAccount) {
        this.bankAccount = bankAccount;
        bankAccount.registerObserver(this);
    }

    @Override
    public void update(double balance) {
        System.out.println("Sending Email: Balance is now €" + balance);
    }
}