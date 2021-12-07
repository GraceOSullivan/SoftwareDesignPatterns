import java.util.ArrayList;

public abstract class BankAccount implements Subject{
    private Person accHolder;
    private int accNum;
    protected double balance;
    private static BankCard bankCard; //static so can be accessed before BankCard object created and without reference to any object.
    private ArrayList observers;

    public BankAccount() {
        this(new Person(),0,0, bankCard);
        observers = new ArrayList();
    }

    public BankAccount(Person accHolder, int accNum, double balance, BankCard bankCard) {
        this.accHolder = accHolder;
        this.accNum = accNum;
        this.balance = balance;
        this.bankCard = bankCard;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amountDeposited){
        if(amountDeposited > 0){
            double balance = getBalance();
            balance += amountDeposited;
            setBalance(balance);
            notifyObservers();
        }else
            System.out.println("Amount to deposit must be greater than 0");
    }

    public void withdraw(double amountWithdrawn){
        if(amountWithdrawn <= this.balance){
            double balance = getBalance();
            balance -= amountWithdrawn;
            setBalance(balance);
            notifyObservers();
        }else
            System.out.println("Amount to withdraw must be greater than balance");
    }

    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        int i = observers.indexOf(0);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers(){
        for(int i=0; i< observers.size(); i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(balance);
        }
    }

    @Override
    public String toString() {
        return accHolder.toString() +  "\nAccount Number: " + accNum + "\nBalance=" + balance;
    }

    public abstract String describeAccount();
}