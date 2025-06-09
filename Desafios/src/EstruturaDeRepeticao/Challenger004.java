package EstruturaDeRepeticao;

import java.util.Scanner;

public class Challenger004 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int beer = 0;
        int lipstick = 0;
        int deodorant = 0;
        int product;
        double payment;

        double valueBeer = 5.9;
        double valueLipstick = 4.9;
        double valueDeodorant = 6.9;

        double totalValue = 0;
        double change = 0;

        String f4 = "";

        do {

            System.out.println("----------------------------------------------------");
            System.out.println("           --= Produtos Disponíveis =--       ");
            System.out.println("1- Batom         -         R$ 4,90");
            System.out.println("2- Cerveja       -         R$ 5,90");
            System.out.println("3- Desodorante   -         R$ 6,90");
            System.out.println("------------ Digite 0 para encerrar ----------------");

            product = scanner.nextInt();

            if (product < 0 || product > 3) {
                System.out.println("Escolha uma opção valida ( 1, 2, 3).");
                return;
            }

            if (product == 1) {
                lipstick++;
            }
            if (product == 2) {
                beer++;
            }
            if (product == 3) {
                deodorant++;
            }

            if (product == 0) {

                double calcLipstick = valueLipstick * lipstick;
                double calcBeer = valueBeer * beer;
                double calcDeodorant = valueDeodorant * deodorant;

                do {
                    System.out.println("----------------------------------------------------");
                    System.out.println("Valor em dinheiro senhor: ");
                    System.out.println("----------------------------------------------------");

                    payment = scanner.nextDouble();

                    totalValue = calcLipstick + calcBeer + calcDeodorant;

                    if (payment < totalValue) {
                        System.out.println("Valor menor que o total da compra!");
                    }
                } while (payment < totalValue);

                change = payment - totalValue;

                System.out.println("---------------- Lojas Tabajara -------------------");
                if (lipstick >= 1) System.out.println("Produto 1: R$" + valueLipstick);
                if (beer >= 1) System.out.println("Produto 2: R$" + valueBeer);
                if (deodorant >= 1) System.out.println("Produto 3: R$" + valueDeodorant);
                System.out.printf("\nTotal: R$%.2f", totalValue);
                System.out.printf("\nDinheiro: R$%.2f", payment);
                System.out.printf("\nTroco: R$%.2f\n", change);
                System.out.println("------------ Digite F4 para encerrar --------------");

                f4 = scanner.next();
            }

            if (!f4.equalsIgnoreCase("f4")) {
                continue;
            }
        } while (true);
    }
}
