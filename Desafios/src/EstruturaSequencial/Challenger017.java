package EstruturaSequencial;

import java.util.Scanner;

public class Challenger017 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tamanho em m² da área a ser pintada: ");
        double area = sc.nextDouble();

        double areaClearance = area * 1.1;
        double liters = areaClearance / 6;

        int cans = (int) Math.ceil(liters / 18);
        double priceCans = cans * 80;

        int gallon = (int) Math.ceil(liters / 3.6);
        double priceGallon = gallon * 25;

        int mixerCans = (int) (liters / 18);
        double remainder = liters - (mixerCans * 18);
        int mixerGallon = (int) Math.ceil(remainder / 3.6);
        double priceMixer = (mixerCans * 80) + (mixerGallon * 25);

        System.out.println("Quantidade de latas necessarias: " + cans);
        System.out.printf("R$ %.2f" , priceCans);
        System.out.println("\nQuantidade de galões necessarios: " + gallon);
        System.out.printf("R$ %.2f" , priceGallon);
        System.out.println("\nMistura de latas e galões (mais econômica): ");
        System.out.println("Latas de 18 litros: " + mixerCans);
        System.out.println("Galões de 3,6 litros: " + mixerGallon);
        System.out.printf("Preço total: R$ %.2f" , priceMixer);
    }
}
