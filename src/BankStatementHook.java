import java.util.ArrayList;

public abstract class BankStatementHook {
    private ArrayList<String> transactions;
    public String statement;

    public final void createBankStatement(BankAccount account){
        getAllAccountTransactions(account);
        addTransactionsToStatement();
        if(accountHolderWantsBalance())
            viewBalance(account);
        printStatement();
        send();
    }

    public abstract void send();
    public abstract void viewBalance(BankAccount account);

    private void getAllAccountTransactions(BankAccount account){
        transactions = account.getTransactions();
    }

    private void addTransactionsToStatement(){
        for (String transaction : transactions) {
            statement += "\n" + transaction;
        }
    }

    private void printStatement(){
        System.out.println("BANK STATEMENT:");
        System.out.println(statement);
    }

    //HOOK
    boolean accountHolderWantsBalance(){
        return true;
    }
}
