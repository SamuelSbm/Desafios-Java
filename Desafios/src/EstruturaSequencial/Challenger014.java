package EstruturaSequencial;

import java.util.Scanner;

public class Challenger014 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a quantidade de kilos pescados hoje: ");

        int kilos = sc.nextInt();
        int limitWeight = 50;
        int excess = kilos - limitWeight;
        double fineFixed = 4.0;
        double excessFee = excess * fineFixed;

        System.out.println("Limite diário: " + limitWeight + "\nKilos excedentes: " + excess );
        System.out.printf("Você excedeu o limite estipulado, multa a pagar: R$ %.2f" , excessFee);

    }
}
