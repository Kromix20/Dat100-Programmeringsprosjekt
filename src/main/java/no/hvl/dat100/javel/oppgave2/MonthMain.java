package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {


        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();


        System.out.println("Strømforbruk:");
        MonthlyPower.print_PowerUsage(power_usage_month);
        System.out.println();


        System.out.println("Strømpriser:");
        MonthlyPower.print_PowerPrices(power_prices_month);
        System.out.println();


        double totalUsage = MonthlyPower.computePowerUsage(power_usage_month);
        System.out.printf("Totalt strømforbruk: %.2f kWh%n", totalUsage);


        double threshold = 1000;
        boolean exceeded = MonthlyPower.exceedThreshold(power_usage_month, threshold);
        System.out.println("Overskrider terskelen på " + threshold + " kWh: " + exceeded);


        double spotPrice = MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month);
        System.out.printf("Spotpris for måneden: %.2f kr%n", spotPrice);


        double support = MonthlyPower.computePowerSupport(power_usage_month, power_prices_month);
        System.out.printf("Strømstøtte for måneden: %.2f kr%n", support);


        double norgesPrice = MonthlyPower.computeNorgesPrice(power_usage_month);
        System.out.printf("Norgespris for måneden: %.2f kr%n", norgesPrice);
    }
}

