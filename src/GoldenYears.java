public class GoldenYears extends AccountDecorator{
    public GoldenYears(BankAccount account){
        super(account);
    }

    @Override
    public String describeAccount() {
        return super.describeAccount() + addGoldenYears();
    }

    public String addGoldenYears(){
        return ", Golden Years";
    }
}
