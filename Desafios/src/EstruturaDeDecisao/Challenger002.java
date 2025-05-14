package EstruturaDeDecisao;

import java.util.Scanner;

public class Challenger002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dígite um número: ");
        int console = sc.nextInt();

        int number = 0;

        if (console > number)
            System.out.println("Seu número, " + console + " é um número positivo!");
        else
            System.out.println("Seu número, " + console + " é um número negativo! ");
    }
}