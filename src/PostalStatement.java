import java.util.ArrayList;

public class PostalStatement {
    private ArrayList<String> transactions;
    private String statement = "";

    public void createBankStatement(BankAccount account){
        getAllAccountTransactions(account);
        addTransactionsToStatement();
        addAccountBalanceToStatement(account);
        printStatement();
        sendInPost();
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

    private void sendInPost(){
        System.out.println("Sending statement in post");
    }
}
