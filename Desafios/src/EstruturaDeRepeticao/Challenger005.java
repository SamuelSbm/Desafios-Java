package EstruturaDeRepeticao;

import java.time.LocalDate;
import java.util.Scanner;

public class Challenger005 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        int startingYear = 1996;

        int currentYear = LocalDate.now().getYear();
        double annualIncrease = 1.5;
        double result = 0;

        while (startingYear <= currentYear) {

            if (startingYear == 1996) {
                result = salary * (annualIncrease / 100);
                salary += result;
                startingYear++;
            } else {
                annualIncrease *= 2;
                result = salary * (annualIncrease / 100);
                salary += result;
                startingYear++;
            }
        }
        System.out.println("Salário final em " + currentYear + ": R$ " +  salary);
    }
}

