import java.util.ArrayList;

public class OnlineStatement {
    ArrayList<String> transactions;
    String statement = "";

    void createBankStatement(BankAccount account){
        getAllAccountTransactions(account);
        addTransactionsToStatement();
        addAccountBalanceToStatement(account);
        printStatement();
        sendOnline();
    }

    private void getAllAccountTransactions(BankAccount account){
        transactions = account.getTransactions();
    }

    private void addTransactionsToStatement(){
        for (String transaction : transactions) {
            statement += "\n" + transaction;
        }
    }

    private void addAccountBalanceToStatement(BankAccount account){
        statement += "\nBalance: €" + account.getBalance();
    }

    private void printStatement(){
        System.out.println("BANK STATEMENT:");
        System.out.println(statement);
    }

    private void sendOnline(){
        System.out.println("Sending statement online");
    }
}
