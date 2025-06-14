package EstruturaDeDecisao;

import java.util.Scanner;

public class Challenger028 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------------------");
        System.out.println("             --= Carnes Disponíveis =--       ");
        System.out.println("File Duplo -      R$ 4,90 KG -   Acima de 5KG R$ 5,80");
        System.out.println("Alcatra -         R$ 5,90 KG -   Acima de 5KG R$ 6,80");
        System.out.println("Picanha -         R$ 6,90 KG -   Acima de 5KG R$ 7,80");
        System.out.println("------------ Somente um Tipo de Carne! -------------");

        String meat = scanner.nextLine();

        if (!meat.equalsIgnoreCase("file duplo") && !meat.equalsIgnoreCase("alcatra") && !meat.equalsIgnoreCase("picanha")){
            System.out.println("Escolha um tipo valído de carne!");
            return;
        }

        System.out.print("Quantos KG de carne?:");
        double totalKiles = scanner.nextDouble();

        double valueDobleFile = 4.9;
        double overValueDoubleFile = 5.8;
        double valueRump = 5.9;
        double overValueRump = 6.8;
        double valueFiletSteak = 6.9;
        double overValueFileSteak = 7.8;

        double cardTabajara = (double) (100 - 5) / 100;

        double priceDobleFile = 0;
        double priceRump = 0;
        double priceFileSteak = 0;

        if(meat.equalsIgnoreCase("file duplo")){
            if(totalKiles > 5){
                priceDobleFile = (totalKiles * overValueDoubleFile);
            } else {
                priceDobleFile = (totalKiles * valueDobleFile);
            }
        }

        if(meat.equalsIgnoreCase("alcatra")){
            if(totalKiles > 5) {
                priceRump = (totalKiles * overValueRump);
            } else {
                priceRump = (totalKiles * valueRump);
            }
        }

        if(meat.equalsIgnoreCase("picanha")) {
            if (totalKiles > 5) {
                priceFileSteak = (totalKiles * overValueFileSteak);
            } else {
                priceFileSteak = (totalKiles * valueFiletSteak);
            }
        }

        double discountFile = (priceDobleFile * cardTabajara);
        double discountRump = (priceRump * cardTabajara);
        double discountSteak = (priceFileSteak * cardTabajara);

        double percentFile = priceDobleFile * 0.05;
        double percentRump = priceRump * 0.05;
        double percentSteak = priceFileSteak * 0.05;

        System.out.println("-------------------------------------------------------------------");
        System.out.println("                      --= Cumpom fiscal =--                       ");
        if(priceDobleFile > 0)System.out.printf("\nFile Duplo R$ %.2f -- %.0fKG\n", priceDobleFile, totalKiles);
        if(priceRump > 0)System.out.printf("\nAlcatra R$ %.2f -- %.0fKG\n", priceRump, totalKiles);
        if(priceFileSteak > 0)System.out.printf("\nPicanha R$ %.2f -- %.0fKG\n", priceFileSteak, totalKiles);

        int selection ;

        do {

        System.out.println("---------------------- Forma de pagamento? ------------------------");
        System.out.println("1- Pagamento em dinheiro?");
        System.out.println("2- Pagamento no cartão Tabajara (5%) de desconto sobre valor total!");
        System.out.println("-------------------------------------------------------------------");

        selection = scanner.nextInt();

        } while (!(selection == 1) && !(selection == 2));

        System.out.println("---------------------- Total a Pagar ------------------------");
        if(selection == 1) {
            if(priceDobleFile > 0)System.out.println("Valor a pagar: R$ " + priceDobleFile);
        }
        if(selection == 1){
            if(priceRump > 0)System.out.println("Valor a pagar: R$ " + priceRump);
        }
        if(selection == 1){
            if(priceFileSteak > 0)System.out.println("Valor a pagar: R$ " + priceFileSteak);
        }
        if(selection == 2){
            if(priceDobleFile > 0) {
                System.out.printf("\nValor do desconto R$ %.2f", percentFile);
                System.out.printf("\nValor com desconto R$ %.2f\n", discountFile);
                System.out.println("------- Obrigado por comprar com o cartão Tabajara! ---------");
            }
        }
        if(selection == 2){
            if(priceRump > 0) {
                System.out.printf("\nValor do desconto R$ %.2f", percentRump);
                System.out.printf("\nValor com desconto R$ %.2f\n", discountRump);
                System.out.println("------- Obrigado por comprar com o cartão Tabajara! ---------");
            }
        }
        if(selection == 2){
            if(priceFileSteak > 0) {
                System.out.printf("\nValor do desconto R$ %.2f", percentSteak);
                System.out.printf("\nValor com desconto R$ %.2f\n", discountSteak);
                System.out.println("------- Obrigado por comprar com o cartão Tabajara! ---------");
            }
        }
        System.out.println("-------------------------------------------------------------");
    }
}
