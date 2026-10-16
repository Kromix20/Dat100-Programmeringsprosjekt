package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();


        Customer customer = new Customer("Ola Nordmann", "ola@example.com", 1, PowerAgreementType.SPOTPRICE);


        System.out.println("Opprettet kunde:");
        System.out.println(customer);
        System.out.println();


        System.out.println("Navn: " + customer.getName());
        System.out.println("E-post: " + customer.getEmail());
        System.out.println("Kunde-ID: " + customer.getCustomer_id());
        System.out.println("Avtale: " + customer.getAgreement());
        System.out.println();


        customer.setName("Kari Nordmann");
        customer.setEmail("kari@example.com");
        customer.setCustomer_id(2);
        customer.setAgreement(PowerAgreementType.NORGESPRICE);

        System.out.println("Etter endring med setters:");
        System.out.println(customer);
    }
}
