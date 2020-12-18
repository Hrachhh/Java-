package bankCard;

import com.sun.istack.internal.NotNull;
import user.Passport;
import user.SocialCard;

import java.util.ArrayList;

/**
 * Created by hrachya.hayrapetyan on 12/18/2020.
 */
public class BankCardService {
    private ArrayList<BankCard> bankCards;

    public BankCardService() {
        this.bankCards = new ArrayList<>();
    }

    private String generateCardNumberByCardName(BankCardName bankCardName) {
        String cardNumber = null;
        switch (bankCardName) {
            case VISA:
                cardNumber = "4083 0600 " + (System.currentTimeMillis() % 10000) + " " + (System.currentTimeMillis() % 10000);
                break;
            case MASTERCARD:
                cardNumber = "5501 0401 " + (System.currentTimeMillis() % 10000) + " " + (System.currentTimeMillis() % 10000);
                break;
        }
        return cardNumber;
    }

    private String generateCvv() {
        return String.valueOf(System.currentTimeMillis() % 1000);
    }

    public BankCard createBankCard(@NotNull Passport passport, SocialCard socialCard, @NotNull BankCardName bankCardName, boolean isActive) {
        return new BankCard(passport, socialCard, bankCardName, generateCardNumberByCardName(bankCardName), generateCvv(), isActive);
    }

    public boolean addBankCard(BankCard bankCard) {
        return bankCards.add(bankCard);
    }

    public ArrayList<BankCard> findByName(String cardHolderName) {
        ArrayList<BankCard> result = new ArrayList<>();
        for (BankCard bankCard : this.bankCards) {
            if (bankCard.getCardHolderName().equals(cardHolderName)) {
                result.add(bankCard);
            }
        }
        return result;
    }

    public boolean isExistBankCardWithCardNumber(String cardNumber) {
        for (BankCard bankCard : this.bankCards) {
            if (bankCard.getCardNumber().equals(cardNumber)) {
                return true;
            }
        }
        return false;
    }

    public BankCard getBankCardByCardNumber(String cardNumber){
        if(isExistBankCardWithCardNumber(cardNumber)){
            for (BankCard bankCard :this.bankCards) {
                if(bankCard.getCardNumber().equals(cardNumber)){
                    return bankCard;
                }
            }
        }
        return null;
    }

    public void makeActive(BankCard bankCard){
        bankCard.setActive(true);
    }

    public void makeInactive(BankCard bankCard){
        bankCard.setActive(false);
    }

    //for test
    public void printBankCardInfo(BankCard bankCard){
        if(bankCard != null){
            System.out.println("**** Bank card info ****");
            System.out.println("  cardName is " + bankCard.getCardName());
            System.out.println("  cardNumber is " + bankCard.getCardNumber());
            System.out.println("  cardHolderName is " + bankCard.getCardHolderName());
            System.out.println("  expiryDate is " + bankCard.getExpiryDate());
            System.out.println("  cvv is " + bankCard.getCvv());
            System.out.println("  isActive: " + bankCard.isActive());
            bankCard.getXeroxOfPassport().printPassportInfo();
            if(bankCard.getXeroxOfSocialCard() != null){
                bankCard.getXeroxOfSocialCard().printSocialCardInfo();
            } else {
                System.out.println("   haven't social card");
            }
        }
    }

    public void printAllCardsInfo(){
        for (BankCard bankCard:this.bankCards) {
            printBankCardInfo(bankCard);
            System.out.println();
        }
    }

    public void printAllCardsInfo(ArrayList<BankCard> bankCards){
        for (BankCard bankCard : bankCards) {
            printBankCardInfo(bankCard);
            System.out.println();
        }
    }



}
