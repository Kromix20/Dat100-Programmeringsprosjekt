package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthlyPower;

import java.util.Arrays;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount; // power price for this month


    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {

        this.c = c;
        this.month = month;
        this.usage = usage;
        this.prices = power_prices;
        this.amount = 0;


    }

    public void computeAmount() {

        double sum = 0;

        for (int d = 0; d < usage.length; d++) {
            for (int h = 0; h < usage[d].length; h++) {

                double kwh = usage[d][h];
                double price = prices[d][h];

                switch (c.getAgreement()) {

                    case SPOTPRICE:
                        sum += kwh * price;
                        break;

                    case NORGESPRICE:
                        sum += kwh * 0.50;
                        break;

                    case POWERSUPPORT:
                        double effective = price;
                        if (price > 0.9375) {
                            effective = price - 0.90 * (price - 0.9375);
                        }
                        sum += kwh * effective;
                        break;
                }
            }
        }

        this.amount = sum;

    }

    public void printInvoice() {

        double TU = 0;
        for (int d = 0; d < usage.length; d++) {
            for (int h = 0; h < usage[d].length; h++) {
                TU += usage[d][h];
            }
        }

        System.out.println("Customer number " + c.getCustomer_id());
        System.out.println("Name  " + c.getName());
        System.out.println("Email " + c.getEmail());
        System.out.println("Agreement " + c.getAgreement());
        System.out.println();
        System.out.println("Month: " + month);
        System.out.printf("Usage:%12.2f kWh%n", TU);
        System.out.printf("Amount:%11.2f NOK%n", amount);
    }

    }
}
