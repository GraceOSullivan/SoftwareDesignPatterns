public class BankApplication {
    public static void main(String[] args) {
        Person grace = new Person("Grace", "Killarney", 353831234567L, "graceos@gmail.com");
        int accountNum = 1234;
        double balance = 0;
        BankCard debit = BankCard.getInstance(CardType.DEBIT);
        BankCard credit = BankCard.getInstance(CardType.CREDIT);

        //Current, Student, Online Account
        BankAccount currentStudentOnlineAccount = new Online(new Student(new CurrentAccount(grace, accountNum, balance, debit)));

        new SMSObserver(currentStudentOnlineAccount);
        new EmailObserver(currentStudentOnlineAccount);

        currentStudentOnlineAccount.deposit(10000);
        currentStudentOnlineAccount.withdraw(100);
    }
}
