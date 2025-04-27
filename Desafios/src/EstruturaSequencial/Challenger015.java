package EstruturaSequencial;

import java.util.Scanner;

public class Challenger015 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor ganho por hora: ");
        double earningsHour = sc.nextDouble();
        System.out.println("Digite a quantidade de horas mensais trabalhadas: ");
        double monthlyHours = sc.nextDouble();

        double grossSalary = earningsHour * monthlyHours;

        double incomeTax = 11.0 / 100.0;
        double inss = 8.0 / 100.0;
        double union = 5.0 / 100.0;

        double calcTax = incomeTax * grossSalary;
        double calcInss = inss * grossSalary;
        double calcUnion = union * grossSalary;

        double netSalary = grossSalary - calcTax - calcInss - calcUnion;

        System.out.printf("Salário Bruto: R$ %.2f " , grossSalary);
        System.out.printf("\n - Imposto de Renda IR (11%%): R$ %.2f" , calcTax);
        System.out.printf("\n - INSS (8%%): R$ %.2f" , calcInss);
        System.out.printf("\n - Sindicato (5%%): R$ %.2f" , calcUnion);
        System.out.printf("\nSalário liquido  :R$ %.2f" , netSalary);
    }
}
