package bankCard;

import com.sun.istack.internal.NotNull;
import user.Passport;
import user.SocialCard;

import java.time.LocalDate;

/**
 * Created by hrachya.hayrapetyan on 12/18/2020.
 */
public class BankCard {
    private BankCardName cardName;
    private final String cardNumber;
    private String cardHolderName;
    private LocalDate expiryDate;
    private String cvv;
    private boolean isActive;
    private Passport xeroxOfPassport;
    private SocialCard xeroxOfSocialCard;

    public BankCard(@NotNull Passport passport, SocialCard socialCard, BankCardName cardName, String cardNumber, String cvv, boolean isActive) {
        this.cardName = cardName;
        this.cardNumber = cardNumber;
        this.cardHolderName = passport.getName() + " " + passport.getSurname();
        this.expiryDate = LocalDate.now().plusYears(4);
        this.cvv = cvv;
        this.isActive = isActive;
        this.xeroxOfPassport = passport;
        this.xeroxOfSocialCard = socialCard;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public BankCardName getCardName() {
        return cardName;
    }

    public void setXeroxOfPassport(Passport xeroxOfPassport) {
        this.xeroxOfPassport = xeroxOfPassport;
    }

    public void setXeroxOfSocialCard(SocialCard xeroxOfSocialCard) {
        this.xeroxOfSocialCard = xeroxOfSocialCard;
    }

    public Passport getXeroxOfPassport() {
        return xeroxOfPassport;
    }

    public SocialCard getXeroxOfSocialCard() {
        return xeroxOfSocialCard;
    }
}
