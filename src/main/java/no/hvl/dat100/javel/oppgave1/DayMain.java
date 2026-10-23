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

        /*
        TODO


         Write code that tests the methods you implement in the DailyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */
        printPowerPrices(powerprices_day);

        printPowerUsage(powerusage_day);

        System.out.println("Total strømforbruk: " + computePowerUsage(powerusage_day) + " kWh");

        System.out.printf("Total kostnad: %.2f NOK\n", computeSpotPrice(powerusage_day, powerprices_day));

        System.out.printf("Strømstøtte: %.2f NOK\n", computePowerSupport(powerusage_day, powerprices_day));

        System.out.printf("Norgespris: %.2f NOK\n", computeNorgesPrice(powerusage_day));

        System.out.println("Høyste timesforbruk: " + findPeakUsage(powerusage_day) + " kWh");

    }
}
