import javax.smartcardio.Card;

public class BankApplication {
    public static void main(String[] args) {
        Person grace = new Person("Grace", "Killarney", 353831234567L, "graceos@gmail.com");
        int accountNum = 1234;
        double balance = 0;
        BankCard debit = BankCard.getInstance(CardType.DEBIT);
        BankCard credit = BankCard.getInstance(CardType.CREDIT);

        //Current, Student, Online Account
        BankAccount currentStudentOnlineAccount = new Online(new Student(new CurrentAccount(grace, accountNum, balance, debit)));

        //Savings, Personal, Graduate Account
        BankAccount savingsPersonalGraduateAccount = new Graduate(new Personal(new SavingsAccount(grace, accountNum, balance, credit)));

//        System.out.println(currentStudentOnlineAccount.describeAccount());
//        System.out.println(savingsPersonalGraduateAccount.describeAccount());

        new SMSObserver(currentStudentOnlineAccount);
        new EmailObserver(currentStudentOnlineAccount);

        currentStudentOnlineAccount.deposit(10000);
        System.out.println("€" + currentStudentOnlineAccount.getBalance());
        currentStudentOnlineAccount.withdraw(100);
        System.out.println("€" + currentStudentOnlineAccount.getBalance());

    }
}
