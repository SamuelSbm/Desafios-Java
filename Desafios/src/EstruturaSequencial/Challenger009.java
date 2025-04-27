package EstruturaSequencial;

import java.util.Scanner;

public class Challenger009 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a temperatura em Farenheit: ");

        float farenheit = sc.nextFloat();
        float celcius = (5 * (farenheit - 32 ) / 9);

        System.out.printf("A temperatura em celcius é : %.4f °C" , celcius);


    }
}
