package EstruturaDeDecisao;

import java.util.Scanner;

public class Challenger025 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Faremos algumas perguntas. Por favor responda somente com  " + "sim" + "ou" +  "não.");

        String firstQuestion, secondQuestion, thirdQuestion, fourthQuestion, fifthQuestion;
        int yes = 0;

        System.out.print("Telefonou para a vítima? ");
        firstQuestion = scanner.nextLine();
        if(firstQuestion.equalsIgnoreCase("sim")){
            yes++;
        }

        System.out.print("Esteve no local do crime? ");
        secondQuestion = scanner.nextLine();
        if(secondQuestion.equalsIgnoreCase("sim")){
            yes++;
        }

        System.out.print("Mora perto da vítima? ");
        thirdQuestion = scanner.nextLine();
        if(thirdQuestion.equalsIgnoreCase("sim")){
            yes++;
        }

        System.out.print("Devia para a vítima? ");
        fourthQuestion = scanner.nextLine();
        if(fourthQuestion.equalsIgnoreCase("sim")){
            yes++;
        }

        System.out.print("Já trabalhou com a vítima? ");
        fifthQuestion = scanner.nextLine();
        if(fifthQuestion.equalsIgnoreCase("sim")){
            yes++;
        }

        if (yes == 2) System.out.print("Você é um suspeito.");
        if (yes == 3 || yes == 4)System.out.print("Você está preso por ser cúmplice de um assassinato. Tudo o que disser poderá e será usado contra você no tribunal!");
        if (yes == 5) {
            System.out.print("Você está preso por assassinato. Tudo o que disser poderá e será usado contra você no tribunal!");
        } else {
            System.out.print("Você é inocente!");
        }
    }
}
