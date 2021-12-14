public class HookTest {
    public static void main(String[] args) {
        Person grace = new Person("Grace", "Killarney", 353831234567L, "graceos@gmail.com");
        int accountNum = 1234;
        double balance = 0;
        BankCard debit = BankCard.getInstance(CardType.DEBIT);

        //Current, Student, Online Account
        BankAccount currentStudentOnlineAccount = new Online(new Student(new CurrentAccount(grace, accountNum, balance, debit)));

        currentStudentOnlineAccount.deposit(10000);
        currentStudentOnlineAccount.withdraw(100);

        PostalStatementHook stmtHook = new PostalStatementHook();

        stmtHook.createBankStatement(currentStudentOnlineAccount);
    }
}
