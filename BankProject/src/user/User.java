package user;

import com.sun.istack.internal.NotNull;

/**
 * Created by hrachya.hayrapetyan on 12/18/2020.
 */
public class User {
    private Passport passport;
    private SocialCard socialCard;

    public User(@NotNull Passport passport, @NotNull SocialCard socialCard) {
        this.passport = passport;
        this.socialCard = socialCard;
    }

    public Passport getPassport() {
        return passport;
    }

    public SocialCard getSocialCard() {
        return socialCard;
    }
}
