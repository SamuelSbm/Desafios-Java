package EstruturaDeDecisao;

import java.util.Calendar;
import java.util.Scanner;

public class Challenger017 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um ano: ");
        int year = sc.nextInt();

        Calendar calendarYear = Calendar.getInstance();
        calendarYear.set(Calendar.YEAR, year);

        if (calendarYear.getActualMaximum(Calendar.DAY_OF_YEAR) > 365){
            System.out.println("O ano de " + year + " é bissexto.");
        } else {
            System.out.println("O ano de " + year + " não é Bissexto.");
        }
    }
}
