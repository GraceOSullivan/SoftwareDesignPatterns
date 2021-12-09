import java.util.ArrayList;

public class BankStatement {
    private StatementType statementType;
    private static BankStatement statement;

    BankStatement(StatementType statementType){
        this.statementType = statementType;
    }

    private void printBankStatement(BankAccount account){
        ArrayList<String> allTransactions = account.getTransactions();
        if(statement.statementType.equals(StatementType.ONLINE)){
            System.out.println("SENDING ONLINE BANK STATEMENT");
            System.out.println("Bank Statement for " + account.getAccNum() +
                    "\n -------------------------------------");
            for (String transaction : allTransactions) {
                System.out.println(transaction);
            }
            System.out.println("Balance: €" + account.getBalance());
        }
        else if(statement.statementType.equals(StatementType.POSTAL)){
            System.out.println("POSTING BANK STATEMENT");
            System.out.println("Bank Statement for " + account.getAccNum() +
                    "\n -------------------------------------");
            for (String transaction : allTransactions) {
                System.out.println(transaction);
            }
            System.out.println("Balance: €" + account.getBalance());
        }
    }
}
