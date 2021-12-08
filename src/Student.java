public class Student extends AccountDecorator {

    public Student(BankAccount account){
        super(account);
    }

    @Override
    public String describeAccount() {
        return super.describeAccount() + addStudent();
    }

    private String addStudent(){
        return ", Student";
    }
}
