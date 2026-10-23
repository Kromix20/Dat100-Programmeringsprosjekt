package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        int day = 1;
        for (double[] dailyUsage : usage) {
            System.out.print("Dag " + day + ": ");
            for (double hourlyUsage : dailyUsage) {
                System.out.printf("%.2f kWh ", hourlyUsage);
            }
            System.out.println();
            day++;
        }
    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        int day = 1;
        for (double[] dailyPrices : prices) {
            System.out.print("Dag " + day + ": ");
            for (double hourlyPrice : dailyPrices) {
                System.out.printf("%.2f NOK ", hourlyPrice);
            }
            System.out.println();
            day++;
        }
    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        for (double[] dailyUsage : usage) {
            for (double hourlyUsage : dailyUsage) {
                sum += hourlyUsage;
            }
        }

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;
        int day = 0;

        while (day < powerusage.length && !exceeded) {
            usage += DailyPower.computePowerUsage(powerusage[day]);
            day++;
            if (usage > threshold) {
                exceeded = true;
            }
        }

        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        for (int day = 0; day < usage.length; day++) {
            for (int hour = 0; hour < usage[day].length; hour++) {
                price += usage[day][hour] * prices[day][hour];
            }
        }

        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        for (int day = 0; day < usage.length; day++) {
            support += DailyPower.computePowerSupport(usage[day], prices[day]);
        }

        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        for (double[] dailyUsage : usage) {
            price += DailyPower.computeNorgesPrice(dailyUsage);
        }

        return price;
    }
}
