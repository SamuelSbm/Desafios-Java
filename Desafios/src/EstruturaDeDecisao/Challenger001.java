package EstruturaDeDecisao;

import java.util.Scanner;

public class Challenger001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberOne;
        int numberTwo;

        do {
            System.out.println("Digite o primeiro número: ");
            numberOne = sc.nextInt();
            System.out.println("Digite o segundo número: ");
            numberTwo = sc.nextInt();

            if (numberOne > numberTwo)
            System.out.println("O maior valor é : " + numberOne);
            else if (numberTwo > numberOne)
            System.out.println("O maior valor é : " + numberTwo);
            else if (numberOne == numberTwo)
            System.out.println("Os valores são equivalentes!");
        } while (numberOne == numberTwo);
    }
}

