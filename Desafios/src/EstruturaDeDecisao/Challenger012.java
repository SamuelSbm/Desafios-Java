package EstruturaDeDecisao;

import java.util.Scanner;

public class Challenger012 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da sua hora: ");
        double valueHour = sc.nextDouble();
        System.out.print("Digite a quantidade de horas mensais trabalhadas: ");
        double monthlyHours = sc.nextDouble();

        double grossSalary = valueHour * monthlyHours;

        double percentil = 0;
        double ir = 0;
        double inss = 10.0 / 100;
        double fgts = 11.0 / 100;

        double calcInss = inss * grossSalary;
        double calcFgts = fgts * grossSalary;

        if (grossSalary <= 900) {
            ir = 0;
            percentil = 0;
        }else if (grossSalary > 900 && grossSalary <= 1500) {
            percentil = 5;
            ir = (percentil / 100) * grossSalary;
        }else if (grossSalary > 1500 && grossSalary <= 2500) {
            percentil = 10;
            ir = (percentil / 100) * grossSalary;
        }else
            percentil = 20;
            ir = (percentil / 100) * grossSalary;

        double totalDiscounts = calcInss + ir;
        double netSalary = grossSalary - calcInss - ir;

        System.out.println("------------------------------------------------");
        System.out.printf("Salário bruto: R$ %.2f" , grossSalary);
        System.out.printf("\nIR: (%.0f%%) %.2f " , percentil , ir);
        System.out.printf("\nINSS: (10%%) %.2f" , calcInss);
        System.out.printf("\nFGTS: (11%%) %.2f" , calcFgts);
        System.out.printf("\nTotal de descontos: %.2f" , totalDiscounts);
        System.out.printf("\nSalário liquido: %.2f" , netSalary);
        System.out.print("\n------------------------------------------------");
    }
}
