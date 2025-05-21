package EstruturaDeDecisao;

import java.util.Scanner;

public class Challenger016 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        double valueA = sc.nextDouble();

        if (valueA == 0){
            System.out.print("Não corresponde a uma equação de segundo grau!");
            return;
        }
        System.out.print("Digite o valor de B: ");
        double valueB = sc.nextDouble();
        System.out.print("Digite o valor de C: ");
        double valueC = sc.nextDouble();

        double delta = Math.pow(valueB , 2) - 4 * valueA * valueC;

        if (delta < 0){
            System.out.println("A equação não tem raízes reais.");
            return;
        } else if (delta == 0) {
            double valueX = -valueB / (2 * valueA);
            System.out.println("A equação tem uma raiz real (duas raízes reais e iguais): " + Math.round(valueX));
        } else {
            double x1 = (-valueB + Math.sqrt(delta)) / (2 * valueA);
            double x2 = (-valueB - Math.sqrt(delta)) / (2 * valueA);
            System.out.println("A equação tem duas raízes reais distintas: " + Math.round(x1) + " e " + Math.round(x2));
        }
    }
}
