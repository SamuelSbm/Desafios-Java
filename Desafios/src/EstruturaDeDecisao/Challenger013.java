package EstruturaDeDecisao;

import java.util.Scanner;

public class Challenger013 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int number = sc.nextInt();

        String[] days = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado"};

        if (number >= 1 && number <= 7){
            System.out.println(days[number - 1]);
        } else{
            System.out.println("Valor inválido!");
        }
    }
}

