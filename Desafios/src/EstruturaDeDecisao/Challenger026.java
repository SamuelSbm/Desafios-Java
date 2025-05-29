package EstruturaDeDecisao;

import java.util.Scanner;

public class Challenger026 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos litros gostaria de abastecer? ");
        double quantityLiters = scanner.nextDouble();

        System.out.println("A-álcool ou G-gasolina?");
        String typeSupply = scanner.next();

        if(!typeSupply.equalsIgnoreCase("a") && !typeSupply.equalsIgnoreCase("g")){
            System.out.print("Escolha inválida! por favor escolha entre: (A ou G): ");
            return;
        }

        double valueAlcohol = 1.9;
        double threePercent = (double) (100 - 3) / 100;          /* Até 20L */
        double fivePercent = (double) (100 - 5) / 100;           /* acima de 20L */

        double valueGasoline = 2.5;
        double fourPercent = (double) (100 - 4) / 100;           /* Até 20L */
        double sixPercent = (double) (100 - 6) / 100;            /* acima de 20L */

        double alcoholPay = 0.0;
        double gasolinePay = 0.0;

        if(typeSupply.equalsIgnoreCase("a")){

            if(quantityLiters > 20){
                alcoholPay = (valueAlcohol * quantityLiters) * fivePercent;
            } else {
                alcoholPay = (valueAlcohol * quantityLiters) * threePercent;
            }
        }

        if(typeSupply.equalsIgnoreCase("g")){

            if(quantityLiters > 20){
                gasolinePay = (valueGasoline * quantityLiters) * sixPercent;
            } else {
                gasolinePay = (valueGasoline * quantityLiters) * fourPercent;
            }
        }

        if(typeSupply.equalsIgnoreCase("a"))System.out.print("Valor total para pagamento R$ " + alcoholPay);
        if(typeSupply.equalsIgnoreCase("g"))System.out.print("Valor total para pagamento R$ " + gasolinePay);
    }
}
