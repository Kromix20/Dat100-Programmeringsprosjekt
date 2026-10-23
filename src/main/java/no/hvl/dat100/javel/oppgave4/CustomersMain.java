package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import static no.hvl.dat100.javel.oppgave3.CustomerMain.checkInt;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        // test
        Customer kari = new Customer("Kari Nordmann", "kari@example.com", 1001, PowerAgreementType.SPOTPRICE);
        Customer ola = new Customer("Ola Hansen", "ola@example.com", 1002, PowerAgreementType.NORGESPRICE);
        Customer ingrid = new Customer("Ingrid Berg", "ingrid@example.com", 1003, PowerAgreementType.POWERSUPPORT);
        Customer lars = new Customer("Lars Johansen", "lars@example.com", 1004, PowerAgreementType.NORGESPRICE);
        Customer sigrid = new Customer("Sigrid Dahl", "sigrid@example.com", 1005, PowerAgreementType.POWERSUPPORT);
        Customer per = new Customer("Per Olsen", "per@example.com", 1006, PowerAgreementType.SPOTPRICE);

// a)
        System.out.println("a)");
        System.out.println("-----------------------------------------");
        Customers test = new Customers(5);
        System.out.println("-----------------------------------------");
        System.out.println();

// b)
        System.out.println("b)");
        System.out.println("-----------------------------------------");
        checkInt(test.countNonNull(), 0);
        System.out.println("-----------------------------------------");
        System.out.println();

// c og d)
        System.out.println("c og d)");
        System.out.println("-----------------------------------------");
        checkCustomer(test.getCustomer(1001), null);

        checkBoolean(test.addCustomer(kari), true);
        checkInt(test.countNonNull(), 1);

        checkBoolean(test.addCustomer(ola), true);
        checkBoolean(test.addCustomer(ingrid), true);
        checkBoolean(test.addCustomer(lars), true);
        checkBoolean(test.addCustomer(sigrid), true);
        checkInt(test.countNonNull(), 5);

        checkBoolean(test.addCustomer(per), false);
        checkInt(test.countNonNull(), 5);

        checkCustomer(test.getCustomer(1002), ola);
        checkCustomer(test.getCustomer(1009), null);
        System.out.println("-----------------------------------------");
        System.out.println();

// e)
        System.out.println("e)");
        System.out.println("-----------------------------------------");
        checkCustomer(test.removeCustomer(1002), ola);
        checkInt(test.countNonNull(), 4);
        checkCustomer(test.getCustomer(1002), null);
        checkCustomer(test.removeCustomer(1009), null);


        checkCustomer(test.removeCustomer(1004), lars);
        checkInt(test.countNonNull(), 3);


        checkBoolean(test.addCustomer(per), true);
        checkInt(test.countNonNull(), 4);
        System.out.println("-----------------------------------------");
        System.out.println();

// f) 

        System.out.println("f)");
        System.out.println("-----------------------------------------");
        checkInt(new Customers(5).getCustomers().length, 0);

        Customer[] liste = test.getCustomers();
        checkInt(liste.length, 4);
        checkCustomer(liste[0], kari);
        checkCustomer(liste[1], per);
        checkCustomer(liste[2], ingrid);
        checkCustomer(liste[3], sigrid);
        System.out.println("-----------------------------------------");
    }

    public static void checkCustomer(Customer output, Customer expectedOutput) {
        if (output == expectedOutput) {
            System.out.println("Gyldig output");
        } else {
            System.out.println("Output er ikke lik expected output");
            System.out.println("Output: " + output);
            System.out.println("Expected Output: " + expectedOutput);
        }
    }

    public static void checkBoolean(boolean output, boolean expectedOutput) {
        if (output == expectedOutput) {
            System.out.println("Gyldig output");
        } else {
            System.out.println("Output er ikke lik expected output");
            System.out.println("Output: " + output);
            System.out.println("Expected Output: " + expectedOutput);
        }
    }
}
