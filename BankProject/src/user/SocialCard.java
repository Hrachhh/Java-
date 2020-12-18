package user;

/**
 * Created by hrachya.hayrapetyan on 12/18/2020.
 */
public class SocialCard {
    private final String socialNumber;
    private boolean isOriginal;

    public SocialCard(String socialNumber) {
        this.socialNumber = socialNumber;
        this.setOriginal(true);
    }

    public SocialCard getXeroxOfSocialCard(){
        SocialCard xeroxOfSocialCard = new SocialCard(this.socialNumber);
        xeroxOfSocialCard.setOriginal(false);
        return xeroxOfSocialCard;
    }

    public String getSocialNumber() {
        return socialNumber;
    }

    private void setOriginal(boolean original) {
        isOriginal = original;
    }

    public boolean isOriginal() {
        return isOriginal;
    }

    //for test
    public void printSocialCardInfo(){
        System.out.println("  *** Social card Info ***");
        System.out.println("     socialNumber is: " + socialNumber);
    }
}
