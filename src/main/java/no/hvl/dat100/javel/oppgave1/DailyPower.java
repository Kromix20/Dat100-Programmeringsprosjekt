package no.hvl.dat100.javel.oppgave1;

import static java.lang.Math.*;

public class DailyPower {

    // a) print power prices during a day
    public static void printPowerPrices(double[] prices) {

        // TODO
        System.out.println("Strømpriser per time:");
        for (double pris : prices) {
            System.out.printf("%.2f NOK ", pris);
        }
        System.out.println("\n");
    }

    // b) print power usage during a day
    public static void printPowerUsage(double[] usage) {

        // TODO
        System.out.println("Strømforbruk per time:");
        for (double i : usage) {
            System.out.print(i + " kWh ");
        }
        System.out.println("\n");
    }

    // c) compute power usage for a single day
    public static double computePowerUsage(double[] usage) {

        double sum = 0;

        // TODO
        for (int i = 0; i < usage.length; i++) {
            sum += usage[i];
        }
        return sum;
    }

    // d) compute spot price for a single day
    public static double computeSpotPrice(double[] usage, double[] prices) {

        double price = 0;

        // TODO
        // Kostnad = Strømforbruk * Spotpris
        for (int i = 0; i < usage.length; i++) {
            price += usage[i] * prices[i];
        }
        return price;
    }

    // e) compute power support for a given usage and price
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;

    private static double getSupport(double usage, double price) {

        double support = 0;

        // TODO
        if (price > THRESHOLD) {
            support = (price - THRESHOLD)  * PERCENTAGE * usage;
        }

        return support;
    }

    // f) compute power support for a single day
    public static double computePowerSupport(double[] usage, double[] prices) {

        double support = 0;

        // TODO
        for (int i = 0; i < usage.length; i++) {
            support += getSupport(usage[i], prices[i]);
        }

        return support;
    }

    private static final double NORGESPRIS_KWH = 0.5;

    // g) compute norges pris for a single day
    public static double computeNorgesPrice(double[] usage) {

        double price = 0;

        // TODO
        for (double hourlyUsage : usage) {
            price += hourlyUsage * NORGESPRIS_KWH;
        }

        return price;
    }

    // g) compute peak usage during a single day
    public static double findPeakUsage(double[] usage) {

        double temp_max = 0;

        // TODO
        for (double hourlyUsage : usage) {
            temp_max = max(temp_max, hourlyUsage);
        }
        return temp_max;
    }

    public static double findAvgPower(double[] usage) {

        double average = 0;

        // TODO
        double totalUsage = 0;

        if (usage.length > 0) {

            for (double hourlyUsage : usage) {
                totalUsage += hourlyUsage;
            }
            average = totalUsage / usage.length;
        }

        return average;
    }
}