package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        Customer k1 = new Customer("Nicolai", "n.lindlo@hvl", 1, PowerAgreementType.SPOTPRICE);

        System.out.println(k1.getName());
        System.out.println(k1.getEmail());
        System.out.println(k1.getCustomer_id());
        System.out.println(k1.getAgreement());

        k1.setName("Herman");
        k1.setEmail("herman@hvl");
        k1.setCustomer_id(2);
        k1.setAgreement(PowerAgreementType.NORGESPRICE);

        System.out.println();
        System.out.println(k1);
    }
}
