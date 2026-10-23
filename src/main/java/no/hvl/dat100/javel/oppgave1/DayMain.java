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

        System.out.println("Strømpriser per time:");
        printPowerPrices(powerprices_day);

        System.out.println("Strømforbruk per time:");
        printPowerUsage(powerusage_day);

        System.out.println("Total strømforbruk: " + computePowerUsage(powerusage_day) + " kWh\n");

        System.out.printf("Total kostnad: %.2f NOK\n", computeSpotPrice(powerusage_day, powerprices_day));

        System.out.printf("Strømstøtte: %.2f NOK\n", computePowerSupport(powerusage_day, powerprices_day));

        System.out.printf("Norgespris: %.2f NOK\n", computeNorgesPrice(powerusage_day));

        System.out.println("Høyste timesforbruk: " + findPeakUsage(powerusage_day) + " kWh");

        System.out.printf("Gjennomsnittlig forbruk: %.2f kWh", findAvgPower(powerusage_day));

    }
}
