package EstruturaDeDecisao;

import java.util.Scanner;

public class Challenger023 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double number = scanner.nextDouble();

        if (number % 1 == 0){
            System.out.println(number + " É um número inteiro.");
        } else{
            System.out.printf(number + " É um número decimal");
        }
    }
}
