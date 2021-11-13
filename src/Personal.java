public class Personal extends AccountDecorator {
    public Personal(BankAccount account){
        super(account);
    }

    @Override
    public String describeAccount() {
        return super.describeAccount() + addPersonal();
    }

    public String addPersonal(){
        return ", Personal";
    }
}
