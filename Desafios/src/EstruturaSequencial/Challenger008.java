package EstruturaSequencial;

import java.util.Scanner;

public class Challenger008 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor ganho por hora: ");
        float amountEarned = sc.nextFloat();
        System.out.println("Qual a quantidade de horas trabalhadas?: ");

        int hours = sc.nextInt();
        float resut = (amountEarned * hours);

        System.out.println("Seu salário do mês é: " + resut);
    }
}
