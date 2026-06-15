package com.tapacademy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "applicationContext.xml");

        GoldCustomer gold =
                (GoldCustomer) context.getBean("gold");

        PlatinumCustomer platinum =
                (PlatinumCustomer) context.getBean("platinum");

        System.out.println("Gold Customer : "
                + gold.getMembershipType());

        System.out.println("Gold Customer : "
                + gold.getAddressDetails());

        System.out.println();

        System.out.println("Platinum Customer : "
                + platinum.getMembershipType());

        System.out.println("Platinum Customer : "
                + platinum.getAddressDetails());

        context.close();
    }
}