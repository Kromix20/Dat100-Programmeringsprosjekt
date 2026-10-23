package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

import static no.hvl.dat100.javel.oppgave1.DayMain.checkOutput;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        // test
        Customer kari = new Customer("Kari Nordmann", "kari@example.com", 1001, PowerAgreementType.SPOTPRICE);
        Customer ola = new Customer("Ola Hansen", "ola@example.com", 1002, PowerAgreementType.POWERSUPPORT);
        Customer ingrid = new Customer("Ingrid Berg", "ingrid@example.com", 1003, PowerAgreementType.NORGESPRICE);

        double[][] prices = MonthPowerData.powerprices_month;

// a)
        System.out.println("a)");
        System.out.println("-----------------------------------------");
        Invoice faktura1 = new Invoice(kari, "January", CustomerPowerUsageData.usage_month_customer1, prices);
        Invoice faktura2 = new Invoice(ola, "January", CustomerPowerUsageData.usage_month_customer2, prices);
        Invoice faktura3 = new Invoice(ingrid, "January", CustomerPowerUsageData.usage_month_customer3, prices);
        checkOutput(faktura1.getAmount(), 0);
        checkOutput(faktura2.getAmount(), 0);
        checkOutput(faktura3.getAmount(), 0);
        System.out.println("-----------------------------------------");
        System.out.println();

// b)
        System.out.println("b)");
        System.out.println("-----------------------------------------");
        faktura1.computeAmount();
        faktura2.computeAmount();
        faktura3.computeAmount();
        checkOutput(faktura1.getAmount(), 3409.6043);
        checkOutput(faktura2.getAmount(), 1121.177355);
        checkOutput(faktura3.getAmount(), 466.635);
        System.out.println("-----------------------------------------");
        System.out.println();

// c)
        System.out.println("c)");
        System.out.println("-----------------------------------------");
        System.out.println("Result: ");
        faktura1.printInvoice();
        System.out.println("Expected result: ");
        System.out.println("Customer number 1001");
        System.out.println("Name  Kari Nordmann");
        System.out.println("Email kari@example.com");
        System.out.println("Agreement SPOTPRICE");
        System.out.println();
        System.out.println("Month: January");
        System.out.println("Usage:      927.56 kWh");
        System.out.println("Amount:    3409.60 NOK");
        System.out.println("-----------------------------------------");
        System.out.println();

// d)
        System.out.println("d)");
        System.out.println("-----------------------------------------");
        Invoice[] fakturaer = {faktura1, faktura2, faktura3};
        Invoices.processInvoices(fakturaer);
        System.out.println("-----------------------------------------");
    }
}
