package net.leanif17.demojpaweb.models;

import org.springframework.beans.factory.annotation.Required;

public class Address {
    private String street;
    private int street_number;

    public String getStreet() {
        return street;
    }

    @Required
    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreet_number() {
        return street_number;
    }

    @Required
    public void setStreet_number(int street_number) {
        this.street_number = street_number;
    }
}
