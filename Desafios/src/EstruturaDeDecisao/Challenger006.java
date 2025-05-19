package EstruturaDeDecisao;

import java.util.Scanner;

public class Challenger006 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int fistNumber = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int secondNumber = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        int thirdNumber = sc.nextInt();

        if (fistNumber > secondNumber && fistNumber > thirdNumber)
            System.out.print("Esse é o maior número: " + fistNumber);
        else if(secondNumber > fistNumber && secondNumber > thirdNumber)
            System.out.print("Esse é o maior número: " + secondNumber);
        else if (thirdNumber > fistNumber && thirdNumber > secondNumber)
            System.out.print("Esse é o maior número: " + thirdNumber);
        else
            System.out.println("Os valores são equivalentes!");
    }
}
