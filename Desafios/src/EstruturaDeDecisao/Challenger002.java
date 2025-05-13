package EstruturaDeDecisao;

import java.util.Scanner;

public class Challenger002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dígite um número: ");

        int number = 0;
        int console = sc.nextInt();

        if (console > number)
            System.out.println("Seu número, " + console + " é um número positivo!");
        else if (console < number) {
            System.out.println("Seu número, " + console + " é um número negativo! ");
        }
    }
}