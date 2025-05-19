package EstruturaDeDecisao;

import java.util.Scanner;

public class Challenger007 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int firstNumber = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int secondNumber = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int thirdNumber = sc.nextInt();

        int bigger = firstNumber;
        int smaller = firstNumber;

        if (secondNumber > thirdNumber) {
            bigger = secondNumber;
        }
        if (thirdNumber > secondNumber) {
            bigger = thirdNumber;
        }
        if (secondNumber < thirdNumber) {
            smaller = secondNumber;
        }
        if (thirdNumber < secondNumber){
            smaller = thirdNumber;
        }
        if (firstNumber == secondNumber && firstNumber == thirdNumber){
            System.out.print("Os valores são equivalentes!");
        } else {
            System.out.println("Esse é o maior número: " + bigger + " e esse é o menor " + smaller);
        }
    }
}
