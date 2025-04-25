package EstruturaSequencial;

import java.util.Scanner;

public class Challenger006 {
    public static void main(String[] args) {

        double ray;
        double area;
        final double pi = Math.PI;

        System.out.println("Escreva o raio do círculo: ");
        Scanner sc = new Scanner(System.in);

        ray = sc.nextFloat();
        area = pi * (ray * ray);

        System.out.println("O valor da area é: " + area);
    }
}
