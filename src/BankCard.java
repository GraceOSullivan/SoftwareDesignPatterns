import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class BankCard {
    private static BankCard bankCard;
    private CardType cardType;
    private long cardNumber;
    private Date expirationDate;
    private int csv;

    private BankCard(CardType cardType, long cardNumber, Date expirationDate, int csv){
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.csv = csv;
    }

    static BankCard getInstance(CardType cardType){
        if(bankCard == null){
            bankCard = new BankCard(cardType, BankCard.getCardNumber(), BankCard.getExpirationDate(), BankCard.getCsv());
        }
        return bankCard;
    }

    private static long getCardNumber() {
        Random rnd = new Random();
        long longNum = rnd.nextLong();

        return Long.parseLong(String.format("%10d", longNum));
    }

    private static Date getExpirationDate() {
        Calendar date = Calendar.getInstance();
        date.add(Calendar.YEAR, 3);
        return new Date(date.getTimeInMillis());
    }

    private static int getCsv() {
        Random rnd = new Random();
        int number = rnd.nextInt(999);
        return Integer.parseInt(String.format("%03d", number));
    }
}
