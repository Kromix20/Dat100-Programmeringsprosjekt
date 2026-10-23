package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

import static no.hvl.dat100.javel.oppgave1.DayMain.checkBoolean;
import static no.hvl.dat100.javel.oppgave1.DayMain.checkOutput;
import static no.hvl.dat100.javel.oppgave2.MonthlyPower.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        //a)
        System.out.println("a)");
        print_PowerUsage(power_usage_month);
        System.out.println();

        //b)
        System.out.println("b)");
        print_PowerPrices(power_prices_month);
        System.out.println();

        //c)
        System.out.println("c)");
        //expected output:
        double c = 908.42;
        checkOutput(computePowerUsage(power_usage_month), c);
        System.out.println();

        //d)
        System.out.println("d)");
        //forbruket er 908.42 kWh, så 500 skal gi true, mens 1000 og 5000 skal gi false
        checkBoolean(exceedThreshold(power_usage_month, 500), true);
        checkBoolean(exceedThreshold(power_usage_month, 1000), false);
        checkBoolean(exceedThreshold(power_usage_month, 5000), false);
        System.out.println();

        //e)
        System.out.println("e)");
        //expected output:
        double e = 3448.142;
        checkOutput(computeSpotPrice(power_usage_month, power_prices_month), e);
        System.out.println();

        //f)
        System.out.println("f)");
        //expected output:
        double f = 2336.849;
        checkOutput(computePowerSupport(power_usage_month, power_prices_month), f);
        System.out.println();

        //g)
        System.out.println("g)");
        //expected output:
        double g = 454.21;
        checkOutput(computeNorgesPrice(power_usage_month), g);
    }
}
