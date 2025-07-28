package EstruturaDeRepeticao;

import java.util.Scanner;

public class Challenger006 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor da sua dívida: ");
        double valueDebit = scanner.nextDouble();

        int installments = 0;

        double increase = 0;
        double interestValue = 0;
        double dividedValue = 0;

        System.out.println("==============================================================================");
        System.out.println("Valor da dívida | Valor dos juros | Quantidade de parcelas | Valor da parcela");

        for (int i = 0; i <= 4; i++) {

            if (i == 0) {
                installments = 1;
                increase = 0;
            } else if (i == 1) {
                installments = 3;
                increase = 10;
            } else if (i == 2) {
                installments = 6;
                increase = 15;
            } else if (i == 3){
                installments = 9;
                increase = 20;
            } else {
                installments = 12;
                increase = 25;
            }

            interestValue = valueDebit * (increase / 100);
            dividedValue = (valueDebit + interestValue) / installments;

            System.out.printf("R$ %12.2f | R$ %12.2f | %13d parcelas | R$ %13.2f\n", (valueDebit + interestValue), interestValue, installments, dividedValue);
        }
        System.out.println("==============================================================================");
    }
}

