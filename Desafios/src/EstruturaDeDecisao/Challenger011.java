package EstruturaDeDecisao;

import java.util.Scanner;

public class Challenger011 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print ("Digite o seu sálario R$ ");
        double baseSalary = sc.nextDouble();

        double percentage = 0;
        double increase = 0;
        double newSalary = 0;

        if (baseSalary <= 280)
            percentage = 20;
        else if (baseSalary > 280 && baseSalary <= 700)
            percentage = 15;
        else if (baseSalary > 700 && baseSalary <= 1500)
            percentage = 10;
        else
            percentage = 5;

        increase = (baseSalary * percentage) / 100;
        newSalary = baseSalary + increase;

        System.out.println("------------------------------------------------");
        System.out.printf("Sálario antes do reajuste: R$ %.2f" , baseSalary);
        System.out.printf("\nPercentual de aumento aplicado: %.0f%%" , percentage);
        System.out.printf("\nValor do aumento: R$ %.2f" , increase);
        System.out.printf("\nSálario reajustado: R$ %.2f" , newSalary);
        System.out.println("\n------------------------------------------------");
    }
}
