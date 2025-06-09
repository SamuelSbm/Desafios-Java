package EstruturaDeRepeticao;

import java.util.Scanner;

public class Challenger002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base: ");
        int base = scanner.nextInt();
        System.out.print("Digite o expoente: ");
        int exponent = scanner.nextInt();

        if (base < 0 || exponent < 0){
            System.out.println("Erro: A base e o expoente devem ser números inteiros não negativos.");
            return;
        }


        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        System.out.println("Resultado: " + result);
    }
}
