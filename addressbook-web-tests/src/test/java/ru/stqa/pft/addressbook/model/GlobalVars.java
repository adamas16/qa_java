package ru.stqa.pft.addressbook.model;

public class GlobalVars {
    public String name;
    public String header;
    public String footer;

    public GlobalVars(String name, String header, String footer) {
        this.name = name;
        this.header = header;
        this.footer = footer;
    }

    public String getName() {
        return name;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }
}
