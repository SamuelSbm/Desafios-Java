package EstruturaDeRepeticao;

import java.util.Scanner;

public class Challenger001 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("Ambos os numeros são iguais.");
            return;
        }

        int minor = Math.min(firstNumber, secondNumber);
        int bigger = Math.max(firstNumber, secondNumber);

        for (int counter = minor + 1; counter < bigger; counter++) {
            System.out.println(counter);
        }
    }
}
/*três partes do for (inicialização, condição e incremento)*/