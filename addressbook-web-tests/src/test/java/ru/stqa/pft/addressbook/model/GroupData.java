package ru.stqa.pft.addressbook.model;

public class GroupData {
    private final String nameOfGroup;
    private final String headerOfGroup;
    private final String footerOfGroup;

    public GroupData(String nameOfGroup, String HeaderOfGroup, String FooterOfGroup) {
        this.nameOfGroup = nameOfGroup;
        headerOfGroup = HeaderOfGroup;
        footerOfGroup = FooterOfGroup;
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public String getHeaderOfGroup() {
        return headerOfGroup;
    }

    public String getFooterOfGroup() {
        return footerOfGroup;
    }
}
