package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        //Test customer
        Customer c = new Customer("Ben Dover", "ben@example.com", 1001, PowerAgreementType.SPOTPRICE);


// c)
        System.out.println("c) get");
        System.out.println("-----------------------------------------");
        checkString(c.getName(), "Ben Dover");
        checkString(c.getEmail(), "ben@example.com");
        checkInt(c.getCustomer_id(), 1001);
        checkAgreement(c.getAgreement(), PowerAgreementType.SPOTPRICE);
        System.out.println("-----------------------------------------");
        System.out.println();



        System.out.println("c) set");
        System.out.println("-----------------------------------------");
        c.setName("Bob Hansen");
        checkString(c.getName(), "Bob Hansen");

        c.setEmail("bob@example.com");
        checkString(c.getEmail(), "bob@example.com");

        c.setCustomer_id(1002);
        checkInt(c.getCustomer_id(), 1002);

        c.setAgreement(PowerAgreementType.NORGESPRICE);
        checkAgreement(c.getAgreement(), PowerAgreementType.NORGESPRICE);
        System.out.println("-----------------------------------------");
        System.out.println();


// d)
        System.out.println("d)");
        System.out.println("-----------------------------------------");
        String expected = "Customer number 1002\n"
                + "Name  Bob Hansen\n"
                + "Email bob@example.com\n"
                + "Agreement NORGESPRICE";
        checkString(c.toString(), expected);
        System.out.println();
        System.out.println(c);
        System.out.println("-----------------------------------------");
    }


    public static void checkString(String output, String expectedOutput) {
        if (output.equals(expectedOutput)) {
            System.out.println("Gyldig output");
        } else {
            System.out.println("Output er ikke lik expected output");
            System.out.println("Output: [" + output + "]");
            System.out.println("Expected Output: [" + expectedOutput + "]");
        }
    }


    public static void checkInt(int output, int expectedOutput) {
        if (output == expectedOutput) {
            System.out.println("Gyldig output");
        } else {
            System.out.println("Output er ikke lik expected output");
            System.out.println("Output: " + output);
            System.out.println("Expected Output: " + expectedOutput);
        }
    }


    public static void checkAgreement(PowerAgreementType output, PowerAgreementType expectedOutput) {
        if (output == expectedOutput) {
            System.out.println("Gyldig output");
        } else {
            System.out.println("Output er ikke lik expected output");
            System.out.println("Output: " + output);
            System.out.println("Expected Output: " + expectedOutput);
        }
    }
}
