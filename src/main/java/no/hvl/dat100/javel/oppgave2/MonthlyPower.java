package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        for (int i = 0; i < usage.length; i++) {
            System.out.print("Dag " + (i + 1) + ":");
            for ( int j = 0; j<usage[i].length; j++);{
                System.out.print(" "+ usage[i][j] + "kWh,");
            }
            System.out.println("");
        }




    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        for (int i = 0; i < prices.length; i++) {
            System.out.print("Dag " + (i + 1) + ":");

            for ( int j = 0; j<prices[i].length; j++);{
                System.out.print(" "+ prices[i][j] + "kr,");
            }
            System.out.println("");
        }

    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;
        double dagsum = 0;
        for (int i = 0; i < usage.length; i++) {
            sum = sum + dagsum;
            for (int j = 0; j < usage[i].length; j++) ;
            {
                dagsum = dagsum + usage[i][j];
            }


            return sum;
        }
    }
        // d) determine whether a given threshold in powerusage for the month has been exceeded
        public static boolean exceedThreshold ( double[][] powerusage, double threshold){

            boolean exceeded = false;
            double usage = 0;


            int i = 0;
            while (i < powerusage.length && !exceeded) {
                for (int j = 0; j < powerusage[i].length && !exceeded; j++) {
                    usage = usage + powerusage[i][j];
                    if (usage > threshold) {
                        exceeded = true;
                    }
                }
                i++;
            }

            return exceeded;
        }

        // e) compute spot price
        public static double computeSpotPrice ( double[][] usage, double[][] prices){

            double price = 0;

            for (int i = 0; i < usage.length; i++) {
                for (int j = 0; j < usage[i].length; j++) {
                    price = price + usage[i][j] * prices[i][j];
                }
            }

            return price;
        }

        // f) power support for the month
        private static final double THRESHOLD = 0.9375;
        private static final double PERCENTAGE = 0.9;
        public static double computePowerSupport ( double[][] usage, double[][] prices){

            double support = 0;

            for (int i = 0; i < usage.length; i++) {
                for (int j = 0; j < usage[i].length; j++) {
                    if (prices[i][j] > THRESHOLD) {
                        support = support + (prices[i][j] - THRESHOLD) * PERCENTAGE * usage[i][j];
                    }
                }
            }

            return support;
        }



        // g) Norgesprice for the month
        private static final double NORGESPRIS_KWH = 0.5;
        public static double computeNorgesPrice ( double[][] usage){

            double price = 0;

            for (double[] dag : usage) {
                for (double forbruk : dag) {
                    price = price + forbruk * NORGESPRIS_KWH;
                }
            }

            return price;
        }
    }