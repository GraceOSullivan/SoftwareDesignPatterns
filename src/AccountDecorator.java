public abstract class AccountDecorator extends BankAccount{
    private BankAccount account;

    public AccountDecorator(BankAccount account){
            this.account = account;
    }

    @Override
    public String describeAccount() {
        return account.describeAccount();
    }
}
