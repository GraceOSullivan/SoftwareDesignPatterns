import java.util.Date;

public class BankCard {
    private static BankCard bankCard;
    private BankAccount account;
    private CardType cardType;
    private int cardNumber;
    private Date expirationDate;
    private int csv;

    private BankCard(BankAccount account, CardType cardType, int cardNumber, Date expirationDate, int csv){
        this.account = account;
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.csv = csv;
    }


    public static BankCard getInstance(BankAccount account, CardType cardType, int cardNumber, Date expirationDate, int csv){
        if(bankCard == null){
            bankCard = new BankCard(account, cardType, cardNumber, expirationDate, csv);
        }
        return bankCard;
    }
}
