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

        int doubleFistPlusHalfSecond = (numberOne * 2) + (numberTwo /2);
        int sumThreeFistThird = (int) ((numberOne * 3) + (realNumber));
        double thirdCube = Math.pow(realNumber , 3);

        System.out.println("Resultado: " + doubleFistPlusHalfSecond);
        System.out.println("Resultado: " + sumThreeFistThird);
        System.out.println("Resultado: " + thirdCube);
    }
}
