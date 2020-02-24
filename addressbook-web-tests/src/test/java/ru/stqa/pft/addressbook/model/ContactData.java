package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String contactFirstName;
    private final String contactLastName;
    private final String contactMidName;
    private final String contactAddress;
    private final String contactHomePhone;
    private final String contactEmail;
    private String group;

    public ContactData(String contactFirstName, String contactLastName, String contactMidName,
                       String contactAddress, String contactHomePhone, String contactEmail,
                       String group) {
        this.contactFirstName = contactFirstName;
        this.contactLastName = contactLastName;
        this.contactMidName = contactMidName;
        this.contactAddress = contactAddress;
        this.contactHomePhone = contactHomePhone;
        this.contactEmail = contactEmail;
        this.group = group;
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

    public String getGroup() {
        return group;
    }
}
