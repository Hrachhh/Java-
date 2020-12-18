package user;

import java.time.LocalDate;

/**
 * Created by hrachya.hayrapetyan on 12/18/2020.
 */
public class Passport {
    private final String passportNo;
    private boolean isOriginal;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private LocalDate dateOfIssue;
    private LocalDate dateOfExpiry;
    private String authority;
    private String signature;
    private char sex;
    private String placeOfBirth;
    private String countryCode;

    public Passport(String passportNo, String name, String surname, LocalDate dateOfBirth, LocalDate dateOfIssue, LocalDate dateOfExpiry, String authority, String signature, char sex, String placeOfBirth, String countryCode) {
        this.passportNo = passportNo;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.dateOfIssue = dateOfIssue;
        this.dateOfExpiry = dateOfExpiry;
        this.authority = authority;
        this.signature = signature;
        this.sex = sex;
        this.placeOfBirth = placeOfBirth;
        this.countryCode = countryCode;
        this.isOriginal = true;
    }

    public Passport getXeroxOfPassport(){
        Passport xeroxOfPassport = new Passport(this.passportNo, this.name, this.surname, this.dateOfBirth, this.dateOfIssue, this.dateOfExpiry, this.authority, this.signature, this.sex, this.placeOfBirth, this.countryCode);
        xeroxOfPassport.setOriginal(false);
        return xeroxOfPassport;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public LocalDate getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(LocalDate dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    private void setOriginal(boolean original) {
        isOriginal = original;
    }

    public boolean isOriginal() {
        return isOriginal;
    }

    //for test
    public void printPassportInfo(){
        System.out.println("  *** Passport Info ***");
        System.out.println("     passportNo is: " + this.passportNo);
        System.out.println("     name is: " + this.name);
        System.out.println("     surname is: " + this.surname);
        System.out.println("     dateOfBirth is: " + this.dateOfBirth);
        System.out.println("     dateOfIssue is: " + this.dateOfIssue);
        System.out.println("     dateOfExpiry is: " + this.dateOfExpiry);
        System.out.println("     authority is: " + this.authority);
        System.out.println("     signature is: " + this.signature);
        System.out.println("     sex is: " + this.sex);
        System.out.println("     placeOfBirth is: " + this.placeOfBirth);
        System.out.println("     countryCode is: " + this.countryCode);
    }

}
