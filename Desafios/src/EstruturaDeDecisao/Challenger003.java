package EstruturaDeDecisao;

import java.util.Scanner;

public class Challenger003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letter;

        do {
            System.out.print("Digite uma letra: ");
            letter = sc.nextLine();

            if (letter.equalsIgnoreCase("f"))
                System.out.println("Sexo feminino!");
            else if (letter.equalsIgnoreCase("m"))
                System.out.println("Sexo masculino!");
            else
                System.out.println("Sexo inválido");
        } while (!letter.equalsIgnoreCase("f") && !letter.equalsIgnoreCase("m"));
    }
}

/* equalsIgnoreCase para ignorar
letras maiúsculas ou minúsculas.*/


