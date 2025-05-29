package EstruturaDeDecisao;

import java.util.Scanner;

public class Challenger027 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String exit;

        int apple = 0;
        int strawberry = 0;

        do {
            System.out.println("---------------------------------");
            System.out.println("   --= Frutas disponíveis =--    ");
            System.out.println("Maçã");
            System.out.println("Morango");
            System.out.println("----- Digite Exit para sair -----");

            exit = scanner.nextLine();

            if (exit.equalsIgnoreCase("morango")){
                strawberry = 1;
            }
            if (exit.equalsIgnoreCase("maçã")){
                apple = 1;
            }
        } while (!exit.equalsIgnoreCase("exit"));

        int appleKilos = 0;
        int strawberryKilos = 0;

        if (apple == 1){
            System.out.print("Quantos KG de maçãs: ");
            appleKilos = scanner.nextInt();
        }
        if (strawberry == 1){
            System.out.print("Quantos KG de morangos: ");
            strawberryKilos = scanner.nextInt();
        }

        double priceApple = 1.80;
        double overPriceApple = 1.50;
        double priceStrawberry = 2.50;
        double overPriceStrawberry = 2.20;

        double totalKilos = appleKilos + strawberryKilos;
        double tenPercent = (double) (100 - 10) / 100;         /*Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00*/

        double resultApples, resultStrawberry;
        double finalResult = 0;

        if (appleKilos > 5){
            resultApples = (appleKilos * overPriceApple);
        } else {
            resultApples = (appleKilos * priceApple);
        }

        if (strawberryKilos > 5){
            resultStrawberry = (strawberryKilos * overPriceStrawberry);
        } else {
            resultStrawberry = (strawberryKilos * priceStrawberry);
        }

        double totalPrice = resultApples + resultStrawberry;

        if (totalPrice > 25 || totalKilos > 8){
            finalResult = (resultApples + resultStrawberry) * tenPercent;
        } else {
            finalResult = totalPrice;
        }

        System.out.println("=============== Nota Fiscal ===================");
        if(resultApples > 0)System.out.printf("Maçãs: R$ %.2f\n", resultApples);
        if(resultStrawberry > 0)System.out.printf("Morangos: R$ %.2f\n", resultStrawberry);
        System.out.printf("Valor total a ser pago: R$ %.2f\n", finalResult);
        System.out.println("===============================================");
    }
}
