package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();


        System.out.println("Strømpriser:");
        DailyPower.printPowerPrices(powerprices_day);
        System.out.println();
        System.out.println();


        System.out.println("Strømforbruk:");
        DailyPower.printPowerUsage(powerusage_day);
        System.out.println();
        System.out.println();


        double totalUsage = DailyPower.computePowerUsage(powerusage_day);
        System.out.printf("Totalt strømforbruk: %.2f kWh%n", totalUsage);


        double spotPrice = DailyPower.computeSpotPrice(powerusage_day, powerprices_day);
        System.out.printf("Spotpris for dagen: %.2f kr%n", spotPrice);


        double support = DailyPower.computePowerSupport(powerusage_day, powerprices_day);
        System.out.printf("Strømstøtte for dagen: %.2f kr%n", support);


        double norgesPrice = DailyPower.computeNorgesPrice(powerusage_day);
        System.out.printf("Norgespris for dagen: %.2f kr%n", norgesPrice);


        double peak = DailyPower.findPeakUsage(powerusage_day);
        System.out.printf("Største timesforbruk: %.2f kWh%n", peak);


        double avg = DailyPower.findAvgPower(powerusage_day);
        System.out.printf("Gjennomsnittlig forbruk per time: %.2f kWh%n", avg);
    }
}
