public class Graduate extends AccountDecorator{
    public Graduate(BankAccount account){
        super(account);
    }

    @Override
    public String describeAccount() {
        return super.describeAccount() + addGraduate();
    }

    public String addGraduate(){
        return ", Graduate";
    }
}
