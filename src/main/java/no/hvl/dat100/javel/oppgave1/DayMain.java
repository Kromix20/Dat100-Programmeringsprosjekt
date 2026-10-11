package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

import static no.hvl.dat100.javel.oppgave1.DailyPower.*;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

// a) print power prices during a day
        System.out.println("a) print power prices during a day:");
        System.out.println("Result: ");
       printPowerPrices(powerprices_day);
       System.out.println("Expected result: ");
       System.out.print("0.10 NOK 0.20 NOK 0.30 NOK 0.40 NOK 0.50 NOK 0.60 NOK 0.70 NOK 0.80 NOK 1.90 NOK 1.00 NOK 1.10 NOK 1.20 NOK 1.30 NOK 1.40 NOK 1.50 NOK 1.60 NOK 1.70 NOK 1.80 NOK 1.90 NOK 2.00 NOK 1.50 NOK 1.00 NOK 0.50 NOK 0.10 NOK");

// b) print power usage during a day
    }
}
