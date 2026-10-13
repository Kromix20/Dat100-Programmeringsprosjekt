package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

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
        System.out.println();
        print_PowerUsage(power_usage_month);
        System.out.println();
        System.out.println();
        //b)
        System.out.println("b)");
        System.out.println();
        print_PowerPrices(power_prices_month);
        System.out.println();
        //c)
        System.out.println("c)");
        //expected output:
        double c = 908.42;
        System.out.println();
        checkOutput(computePowerUsage(power_usage_month),c);
        System.out.println();

        //d)
        System.out.println("d)");
        //expected output:
        //lag egen check for denne oppgaven

        //e)
        System.out.println("e)");
        //expected output:
        double e = 3448.14;

        //f)
        System.out.println("f)");
        //expected output:
        double f = 2336.84;

        //g)
        System.out.println("g)");
        //expected output:
        double g = 454.21;



    }


}