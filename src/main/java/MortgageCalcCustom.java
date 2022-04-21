import java.util.Scanner;
import java.text.NumberFormat;

public class MortgageCalcCustom {

    public static void main(String[] args) {
        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;
        byte monthsInYear = 12;
        byte percent = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        monthlyInterest = annualInterest / percent / monthsInYear;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        numberOfPayments = years * monthsInYear;


        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) -1);

        double roundMortgage = Math.round(mortgage);
        System.out.println("Your mortgage is $" + roundMortgage + "/month");

    }

}
