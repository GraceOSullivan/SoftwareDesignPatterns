import javax.smartcardio.Card;

public class BankApplication {
    public static void main(String[] args) {
        Person grace = new Person("Grace", "Killarney", 353831234567l);
        int accountNum = 1234;
        double balance = 1000.00;
        BankCard debit = BankCard.getInstance(CardType.DEBIT);
        BankCard credit = BankCard.getInstance(CardType.CREDIT);

        //Current, Student, Online Account
        BankAccount currentStudentOnlineAccount = new Online(new Student(new CurrentAccount(grace, accountNum, balance, debit)));
        currentStudentOnlineAccount.setBalance(balance);

        //Savings, Personal, Graduate Account
        BankAccount savingsPersonalGraduateAccount = new Graduate(new Personal(new SavingsAccount(grace, accountNum, balance, credit)));
        savingsPersonalGraduateAccount.setBalance(balance);

        System.out.println(currentStudentOnlineAccount.describeAccount());
        System.out.println(savingsPersonalGraduateAccount.describeAccount());

    }
}
