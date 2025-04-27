package EstruturaSequencial;

import java.util.Scanner;

public class Challenger010 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a temperatura em Celcius: ");
        double celcius = sc.nextDouble();
        double farenheit = ((celcius * 1.8 ) + 32);
        System.out.printf("A temperatura em farenheit é : %.0f °C" , farenheit);
    }
}
