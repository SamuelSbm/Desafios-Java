package EstruturaSequencial;

import java.util.Scanner;

public class Challenger007 {
    public static void main(String[] args) {

        System.out.println("Digite a área: ");
        Scanner sc = new Scanner(System.in);

        float area;
        area = sc.nextFloat();
        area = area * area;

        System.out.println("O dobro da área é :" + (area * 2));
    }
}
