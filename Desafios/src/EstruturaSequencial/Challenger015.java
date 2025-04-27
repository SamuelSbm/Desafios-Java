package EstruturaSequencial;

import java.util.Scanner;

public class Challenger015 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor ganho por hora: ");
        double earningsHour = sc.nextDouble();
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        double monthlyHours = sc.nextDouble();

        double grossSalary = earningsHour * monthlyHours;

        double incomeTax = 11.0 / 100.0;
        double inss = 8.0 / 100.0;
        double union = 5.0 / 100.0;

        double calcTax = incomeTax * grossSalary;
        double calcInss = inss * grossSalary;
        double calcUnion = union * grossSalary;

        double netSalary = grossSalary - calcTax - calcInss - calcUnion;

        System.out.println("Salário Bruto : R$ " + grossSalary);
        System.out.println("Imposto de Renda IR (11%) : R$ " + calcTax);
        System.out.println("INSS (8%) : R$ " + calcInss);
        System.out.println("Sindicato (5%) : R$ " + calcUnion);
        System.out.printf("Salário liquido  : R$ %.2f" , netSalary);
    }
}
