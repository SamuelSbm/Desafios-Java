package EstruturaDeDecisao;

import java.util.Scanner;

public class Challenger022 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int number = scanner.nextInt();

        int result = number % 2;

        if (result > 0){
            System.out.println(number + " Número impar.");
        } else {
            System.out.println(number + " Número par.");
        }
    }
}
