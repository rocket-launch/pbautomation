package pages;

public enum FormElements {
    FIRSTNAME("firstName"),
    LASTNAME("lastName"),
    ADDRESS("address"),
    CITY("city"),
    STATE("state"),
    ZIPCODE("zipCode"),
    PHONE("phoneNumber"),
    SSN("ssn"),
    USERNAME("username"),
    PASSWORD("password"),
    PASSWORDCONFIRMATION("repeatedPassword");


    public final String id;

    private FormElements(String id) {
        this.id = id;
    }
}
