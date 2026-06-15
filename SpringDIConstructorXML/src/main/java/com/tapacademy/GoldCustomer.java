package com.tapacademy;

public class GoldCustomer implements Customer {

    private Address address;

    public GoldCustomer(Address address) {
        this.address = address;
    }

    @Override
    public String getMembershipType() {
        return "Gold";
    }

    @Override
    public String getAddressDetails() {
        return "City : " + address.getCity()
                + ", State : " + address.getState();
    }
}