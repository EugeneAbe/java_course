package ru.stqa.pft.addressbook.model;

public class fillFormAddContact {
    private final String contactFirstName;
    private final String contactLastName;
    private final String contactMidName;
    private final String contactAddress;
    private final String contactHomePhone;
    private final String contactEmail;

    public fillFormAddContact(String contactFirstName, String contactLastName, String contactMidName, String contactAddress, String contactHomePhone, String contactEmail) {
        this.contactFirstName = contactFirstName;
        this.contactLastName = contactLastName;
        this.contactMidName = contactMidName;
        this.contactAddress = contactAddress;
        this.contactHomePhone = contactHomePhone;
        this.contactEmail = contactEmail;
    }

    public String getContactFirstName() {
        return contactFirstName;
    }

    public String getContactLastName() {
        return contactLastName;
    }

    public String getContactMidName() {
        return contactMidName;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public String getContactHomePhone() {
        return contactHomePhone;
    }

    public String getContactEmail() {
        return contactEmail;
    }
}
