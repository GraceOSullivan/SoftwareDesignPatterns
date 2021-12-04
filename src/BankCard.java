import java.util.Date;

public class BankCard {
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
}
