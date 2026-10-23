package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that uses and tests the methods implemented in the Customers class

        */

        Customers customers = new Customers(5);

        Customer k1 = new Customer("Gregor Gregorson", "Gregorg@hvl", 1, PowerAgreementType.SPOTPRICE);
        Customer k2 = new Customer("Johnson Johnson", "jj@hvl", 2, PowerAgreementType.NORGESPRICE);
        Customer k3 = new Customer("Aladdin Rat", "rat@hvl", 3, PowerAgreementType.POWERSUPPORT);

        customers.addCustomer(k1);
        customers.addCustomer(k2);
        customers.addCustomer(k3);

        System.out.println("Antall kunder: " + customers.countNonNull());

        System.out.println(customers.getCustomer(2));
        System.out.println(customers.getCustomer(4));

        System.out.println("\nSlettet kunde:");
        System.out.println(customers.removeCustomer(2));

        System.out.println("\nAntall kunder etter sletting: " + customers.countNonNull());
        System.out.println("Søker etter slettet kunde: " + customers.getCustomer(2));

    }
}