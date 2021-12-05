public class BankApplication {
    public static void main(String[] args) {

        Person grace = new Person("Grace", "Killarney");

        //Current, Student, Online Account
        BankAccount currentStudentOnlineAccount = new Online(new Student(new CurrentAccount(grace, 1234, 10000.00, BankCard.getInstance(CardType.DEBIT))));

        //Savings, Personal, Graduate Account
        BankAccount savingsPersonalGraduateAccount = new Graduate(new Personal(new SavingsAccount(grace, 1234, 1000.00, BankCard.getInstance(CardType.CREDIT))));

        System.out.println(currentStudentOnlineAccount.describeAccount());
        System.out.println(savingsPersonalGraduateAccount.describeAccount());
    }
}
