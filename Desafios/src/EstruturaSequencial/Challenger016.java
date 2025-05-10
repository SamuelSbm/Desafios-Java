package EstruturaSequencial;

import java.util.Scanner;

public class Challenger016 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tamanho em m² da área a ser pintada: ");
        double area = sc.nextDouble();

        double liters = area / 3;
        int litersGallon = (int) Math.ceil(liters / 18);
        double price = litersGallon * 80;

        System.out.println("\nQuantidade de latas necessarias: " + litersGallon);
        System.out.println("Preço: R$" + price);
    }
}
