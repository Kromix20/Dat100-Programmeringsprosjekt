package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        // a)
        Customers customers = new Customers(5);
        System.out.println("Antall kunder i starten: " + customers.countNonNull());

        // d)
        Customer c1 = new Customer("Ishmael", "ishmael@example.com", 1, PowerAgreementType.SPOTPRICE);
        Customer c2 = new Customer("Kurt", "kurt@example.com", 2, PowerAgreementType.NORGESPRICE);
        Customer c3 = new Customer("Per", "per@example.com", 3, PowerAgreementType.SPOTPRICE);

        System.out.println("Legg til kunde 1: " + customers.addCustomer(c1));
        System.out.println("Legg til kunde 2: " + customers.addCustomer(c2));
        System.out.println("Legg til kunde 3: " + customers.addCustomer(c3));

        // b)
        System.out.println("Antall kunder etter innsetting: " + customers.countNonNull());

        // c)
        System.out.println("Kunde med id 2: " + customers.getCustomer(2));

        // f)
        System.out.println("Alle kunder:");
        for (Customer c : customers.getCustomers()) {
            System.out.println(c);
        }


        Customer removed = customers.removeCustomer(2);
        System.out.println("Fjernet kunde: " + removed);
        System.out.println("Antall kunder etter fjerning: " + customers.countNonNull());
        System.out.println("Fjern ikke-eksisterende id 99: " + customers.removeCustomer(99));


        for(int i = 0; i < 100; i++) {
            customers.addCustomer(new Customer("Nicolai", "Nicotin@example.com", i, PowerAgreementType.SPOTPRICE));
        }
        System.out.println("Legg til i full tabell: "
                + customers.addCustomer(new Customer("Siste", "siste@example.com", 7, PowerAgreementType.SPOTPRICE)));
    }
}
