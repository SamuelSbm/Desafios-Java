package EstruturaDeDecisao;

import java.util.Scanner;

public class Challenger019 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número entre 1 e 999: ");
        String console = scanner.nextLine();

        int number = Integer.parseInt(console);

        if(number < 1 || number > 999){
            System.out.println("Valor digitado inválido.");
            return;
        }

        if (number > 99){
            System.out.println("O número tem " + console.charAt(0) + " centenas.");
            System.out.println("O número tem " + console.charAt(1) + " dezenas.");
            System.out.println("O número tem " + console.charAt(2) + " unidades.");
        } else if (number > 9){
            System.out.println("O número tem " + console.charAt(0) + " dezenas.");
            System.out.println("O número tem " + console.charAt(1) + " unidades.");
        } else {
            System.out.println("O número tem " + console.charAt(0) + " unidades.");
        }
    }
}
