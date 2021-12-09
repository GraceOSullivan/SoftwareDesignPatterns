import java.util.ArrayList;

public class BankStatement {
    private void printBankStatement(BankAccount account){
        ArrayList<String> allTransactions = account.getTransactions();
        System.out.println("Bank Statement for " + account.getAccNum() +
                "\n -------------------------------------");
        for (String transaction : allTransactions) {
            System.out.println(transaction);
        }
        System.out.println("Balance: €" + account.getBalance());
    }
}
