package no.hvl.dat100.javel.oppgave2;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        int day = 1;
        for (double[] dailyUsage : usage) {
            System.out.print("Day " + day + ": ");
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
            System.out.print("Day " + day + ": ");
            for (double hourlyPrices : dailyPrices) {
                System.out.printf("%.2f kr/kWh ", hourlyPrices);
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

        // Variabelen 'exceeded' er ikke egentlig nødvendig her, men har den med siden den er inkludert i startkoden.

        int day = 0;

        while (day < powerusage.length && !exceeded) {

            for (double hourlyUsage : powerusage[day]) {
                usage += hourlyUsage;

                if (usage > threshold) {
                    exceeded = true;
                    return exceeded;
                }
            }


            day++;
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
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;

    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        // Usikker på om vi skal bruke metode direkte fra oppgave 1, men har valgt å ikke gjøre det.
        for (int day = 0; day < usage.length; day++) {
            for (int hour = 0; hour < usage[day].length; hour++) {
                if (prices[day][hour] > THRESHOLD) {

                    support += (prices[day][hour] - THRESHOLD) * PERCENTAGE * usage[day][hour];
                }
            }
        }
        return support;
    }

    // g) Norgesprice for the month
    private static final double NORGESPRIS_KWH = 0.5;

    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        for (double[] dailyUsage : usage) {
            for (double hourlyUsage : dailyUsage) {

                price += hourlyUsage * NORGESPRIS_KWH;

            }
        }

        return price;
    }
}