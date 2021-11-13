public class Online extends AccountDecorator{
    public Online(BankAccount account){
        super(account);
    }

    @Override
    public String describeAccount() {
        return super.describeAccount() + addOnline();
    }

    public String addOnline(){
        return ", Online";
    }
}
