import bankCard.BankCard;
import bankCard.BankCardName;
import bankCard.BankCardService;
import user.Passport;
import user.SocialCard;
import user.User;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        BankCardService bankCardService = new BankCardService();

        // test data
        Passport passportOfValodik = new Passport("157157157157", "Valodik", "Valodikyan", LocalDate.of(1999, 11, 21), LocalDate.of(2015, 5, 11), LocalDate.of(2025, 11, 21), "046", "Valodik1254", 'm', "Republic of Armenia", "ARM" );
        SocialCard socialCardOfValodik = new SocialCard("157256987452");
        User valodik = new User(passportOfValodik, socialCardOfValodik);

        Passport passportOfHambardzum = new Passport("157258252852252", "Hambardzum", "Hambardzumyan", LocalDate.of(1890, 5, 25), LocalDate.of(1905, 8, 23), LocalDate.of(1915, 8, 23), "048", "Hambardzum5569", 'm', "Republic of Armenia", "ARM" );
        SocialCard socialCardOfHambardzum = new SocialCard("157256987452");
        User hambardzum = new User(passportOfHambardzum, socialCardOfHambardzum);

        Passport passportOfAnahit = new Passport("1111112222222", "Anahit", "Anahityan", LocalDate.of(2000, 4, 12), LocalDate.of(2016, 3, 28), LocalDate.of(2026, 3, 28), "031", "Anahit1111", 'f', "Republic of Armenia", "ARM" );
        SocialCard socialCardOfAnahit = new SocialCard("1111111111111");
        User anahit = new User(passportOfAnahit, socialCardOfAnahit);

        BankCard bankCardForValodik = bankCardService.createBankCard(valodik.getPassport(), null, BankCardName.MASTERCARD,  true);
        bankCardService.addBankCard(bankCardForValodik);
        bankCardService.addBankCard(bankCardService.createBankCard(hambardzum.getPassport(), hambardzum.getSocialCard(), BankCardName.VISA,  true));
        bankCardService.addBankCard(bankCardService.createBankCard(anahit.getPassport(), anahit.getSocialCard(), BankCardName.VISA,  true));

//        bankCardService.printAllCardsInfo();
//        bankCardService.printBankCardInfo(bankCardService.getBankCardByCardNumber(bankCardForValodik.getCardNumber()));
//        System.out.println(bankCardService.isExistBankCardWithCardNumber(bankCardForValodik.getCardNumber()));
        bankCardService.addBankCard(bankCardService.createBankCard(valodik.getPassport(), valodik.getSocialCard(), BankCardName.VISA, true));
        bankCardService.printAllCardsInfo(bankCardService.findByName(bankCardForValodik.getCardHolderName()));

        //for inactive
        bankCardService.makeInactive(bankCardService.getBankCardByCardNumber(bankCardForValodik.getCardNumber()));



    }
}
