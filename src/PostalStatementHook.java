import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PostalStatementHook extends BankStatementHook {
    public void send(){
        System.out.println("Sending statement in post");
    }

    public void viewBalance(BankAccount account){
        super.statement += "\nBalance: €" + account.getBalance();
    }

    public boolean accountHolderWantsBalance() {
        String ans = askAccountHolder();
        if (ans.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }
    private String askAccountHolder() {
        String ans = null;
        System.out.print("Do you want to see your balance at the end of your statement? (y/n)? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            ans = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (ans == null) {
            return "no";
        }
        return ans;
    }
}
