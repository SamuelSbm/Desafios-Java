package EstruturaSequencial;

import java.util.Scanner;

public class Challenger011 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numberOne = sc.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int numberTwo = sc.nextInt();
        System.out.println("Digite um número real: ");
        double realNumber = sc.nextDouble();

        int a = (numberOne * 2) + (numberTwo /2);
        int b = (int) ((numberOne * 3) + (realNumber));
        double c = Math.pow(realNumber , 3);

        System.out.println("Resultado: " + a);
        System.out.println("Resultado: " + b);
        System.out.println("Resultado: " + c);
    }
}
