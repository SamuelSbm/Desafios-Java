package EstruturaDeDecisao;

import java.util.Arrays;
import java.util.Scanner;

public class Challenger004 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String alphabet;

        do {
            System.out.print("Insira uma letra: ");
            alphabet = sc.nextLine();

            if (alphabet.equalsIgnoreCase("a") || alphabet.equalsIgnoreCase("e") || alphabet.equalsIgnoreCase("i") || alphabet.equalsIgnoreCase("o") || alphabet.equalsIgnoreCase("u"))
                System.out.println("vogal");
            else{
                System.out.println("Consoante");
            }
        }while (!alphabet.equalsIgnoreCase("a") || alphabet.equalsIgnoreCase("e") || alphabet.equalsIgnoreCase("i") || alphabet.equalsIgnoreCase("o") || alphabet.equalsIgnoreCase("u"));
    }
}



