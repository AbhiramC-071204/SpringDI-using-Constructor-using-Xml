package com.tapacademy;

public class PlatinumCustomer implements Customer {

    private Address address;

    public PlatinumCustomer(Address address) {
        this.address = address;
    }

    @Override
    public String getMembershipType() {
        return "Platinum";
    }

    @Override
    public String getAddressDetails() {
        return "City : " + address.getCity()
                + ", State : " + address.getState();
    }
}