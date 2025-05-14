package EstruturaDeDecisao;

import java.util.Scanner;

public class Challenger004 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String alphabet;

        System.out.print("Insira uma letra: ");
        alphabet = sc.nextLine();

        if (alphabet.equalsIgnoreCase("a"))
            System.out.println("vogal");
        else if (alphabet.equalsIgnoreCase("e"))
            System.out.println("vogal");
        else if (alphabet.equalsIgnoreCase("i"))
            System.out.println("vogal");
        else if (alphabet.equalsIgnoreCase("o"))
            System.out.println("vogal");
        else if (alphabet.equalsIgnoreCase("u"))
            System.out.println("vogal");
        else
            System.out.println("Consoante");
    }
}



