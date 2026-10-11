package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;
import static java.lang.Math.*;

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
        System.out.println("-----------------------------------------");
        System.out.println("Result: ");
       printPowerPrices(powerprices_day);
       System.out.println("Expected result: ");
       System.out.print("0.10 NOK 0.20 NOK 0.30 NOK 0.40 NOK 0.50 NOK 0.60 NOK 0.70 NOK 0.80 NOK 1.90 NOK 1.00 NOK 1.10 NOK 1.20 NOK 1.30 NOK 1.40 NOK 1.50 NOK 1.60 NOK 1.70 NOK 1.80 NOK 1.90 NOK 2.00 NOK 1.50 NOK 1.00 NOK 0.50 NOK 0.10 NOK");
       System.out.println();
        System.out.println("-----------------------------------------");

// b) print power usage during a day

        System.out.println();
        System.out.println("b) print power usage during a day:");
        System.out.println("-----------------------------------------");
        System.out.println("Result: ");
        printPowerUsage(powerusage_day);
        System.out.println("Expected result: ");
        System.out.print("0.34 kWh 0.29 kWh 0.31 kWh 0.45 kWh 0.41 kWh 0.38 kWh 2.12 kWh 1.87 kWh 2.03 kWh 1.01 kWh 0.95 kWh 0.89 kWh 1.11 kWh 0.84 kWh 0.93 kWh 1.08 kWh 2.45 kWh 2.78 kWh 2.36 kWh 2.19 kWh 0.91 kWh 0.73 kWh 0.66 kWh 0.59 kWh");
        System.out.println();
        System.out.println("-----------------------------------------");

// c) compute power usage for a single day

        System.out.println("c) compute power usage for a single day");
        System.out.println("-----------------------------------------");
        double c = 27.68;
        checkOutput(computePowerUsage(powerusage_day), c);
        System.out.println("-----------------------------------------");

// d) compute spot price for a single day
        double d = 37.017;


        System.out.println("d) compute spot price for a single day");
        System.out.println("-----------------------------------------");
        checkOutput(d, computeSpotPrice(powerusage_day, powerprices_day));
        System.out.println("-----------------------------------------");

// e) compute power support for a given usage and price
        double e = 0;


        System.out.println("e) compute power support for a given usage and price");
        System.out.println("-----------------------------------------");
        //checkOutput();
// f) compute power support for a single day
        double f = 12.470625;


        System.out.println("f) compute power support for a single day");
        System.out.println("-----------------------------------------");
       // checkOutput();
// g) compute norges pris for a single day
        double g = 13.84;

        System.out.println("g) compute norges pris for a single day");
        System.out.println("-----------------------------------------");
        //checkOutput();
// h) compute peak usage during a single day
        double h = 2.78;
        System.out.println("g) compute peak usage during a single day");
        System.out.println("-----------------------------------------");
        //checkOutput();


// i) find Avg Power
        double i = 1.15;
        System.out.println("i) find Avg Power usage");
        System.out.println("-----------------------------------------");
        //checkOutput();
    }
public static void checkOutput(double output, double expectedOutput){

        double check = Math.abs(output - expectedOutput);

        if(check < 0.001){
            System.out.println("Gyldig output");

        } else{
            System.out.println("Output er ikke lik expected output");
            System.out.println("Output: " + output);
            System.out.println("Expected Output: " + expectedOutput);
        }
}

    }

