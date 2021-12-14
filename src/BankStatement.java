import java.util.ArrayList;

public abstract class BankStatement {
    private ArrayList<String> transactions;
    private String statement;

    public final void createBankStatement(BankAccount account){
        getAllAccountTransactions(account);
        addTransactionsToStatement();
        addAccountBalanceToStatement(account);
        printStatement();
        send();
    }

   public abstract void send();

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
}
