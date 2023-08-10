import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //constants
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENTAGE = 100;

        //initialise variables with a global scope
        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        //capture input
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1000_000)
                break;
            System.out.println("Enter a value between 1000 and 1,000,000");
        }

        while (true){
            System.out.println("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30)
                break;
            monthlyInterest = annualInterest/PERCENTAGE/MONTHS_IN_YEAR;
            System.out.println("Enter a value between 1 and 30");
        }
        while (true){
            System.out.println("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30){
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }


    }
}