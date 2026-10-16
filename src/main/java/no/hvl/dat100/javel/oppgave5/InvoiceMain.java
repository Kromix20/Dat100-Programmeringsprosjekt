package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();


        double[][] prices = MonthPowerData.powerprices_month;

        double[][] usage1 = CustomerPowerUsageData.usage_month_customer1;
        double[][] usage2 = CustomerPowerUsageData.usage_month_customer2;
        double[][] usage3 = CustomerPowerUsageData.usage_month_customer3;


        Customer c1 = new Customer("Ola Nordmann", "ola@example.com", 1, PowerAgreementType.SPOTPRICE);
        Customer c2 = new Customer("Kari Nordmann", "kari@example.com", 2, PowerAgreementType.NORGESPRICE);
        Customer c3 = new Customer("Per Hansen", "per@example.com", 3, PowerAgreementType.POWERSUPPORT);


        Invoice[] invoices = new Invoice[3];
        invoices[0] = new Invoice(c1, "Januar", usage1, prices);
        invoices[1] = new Invoice(c2, "Januar", usage2, prices);
        invoices[2] = new Invoice(c3, "Januar", usage3, prices);


        Invoices.processInvoices(invoices);

    }
}
