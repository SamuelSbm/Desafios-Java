package EstruturaDeDecisao;

import java.util.Scanner;

public class Challenger021 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor para saque: ");
        String console = scanner.nextLine();

        int withdrawal = Integer.parseInt(console);

        if(withdrawal < 10 || withdrawal > 999){
            System.out.println("Valor inválido para saque!");
            return;
        }

        int oneNote = 0;
        int fiveNote = 0;
        int tenNote = 0;
        int fiftyNote = 0;
        int humdredNote = 0;

        int hundred = 0;
        int dozen = 0;
        int unit = 0;

        if (console.length() == 3){

            hundred++;

            int characterOne = Integer.parseInt(String.valueOf(console.charAt(0)));
            int characterTwo = Integer.parseInt(String.valueOf(console.charAt(1)));
            int characterThree = Integer.parseInt(String.valueOf(console.charAt(2)));

            humdredNote = characterOne * hundred;

            if (characterTwo >= 5){
                fiftyNote++;
                tenNote = (characterTwo - 5);
            } else{
                tenNote = characterTwo;
            }
            if (characterThree >= 5){
                fiveNote++;
                oneNote = (characterThree - 5);
            } else{
                oneNote = characterThree;
            }

            if (humdredNote > 0) {
                System.out.println(humdredNote + " Nota(s) de cem.");
            }
            if (fiftyNote > 0){
                System.out.println(fiftyNote + " Nota(s) de cinquenta.");
            }
            if (tenNote > 0){
                System.out.println(tenNote + " Nota(s) de dez.");
            }
            if (fiveNote > 0){
                System.out.println(fiveNote + " Nota(s) de cinco.");
            }
            if (oneNote > 0){
                System.out.println(oneNote + " Nota(s) de um.");
            }
        } else if (console.length() == 2){

            dozen++;
            unit++;

            int characterOne = Integer.parseInt(String.valueOf(console.charAt(0)));
            int characterTwo = Integer.parseInt(String.valueOf(console.charAt(1)));

            if (characterOne >= 5){
                fiftyNote++;
                tenNote = (characterTwo - 5);
            } else{
                tenNote = characterOne;
            }
            if (characterTwo >= 5){
                fiveNote++;
                oneNote = (characterTwo - 5);
            } else{
                oneNote = characterTwo;
            }

            if (fiftyNote > 0){
                System.out.println(fiftyNote + " Nota(s) de cinquenta.");
            }
            if (tenNote > 0){
                System.out.println(tenNote + " Nota(s) de dez.");
            }
            if (fiveNote > 0){
                System.out.println(fiveNote + " Nota(s) de cinco.");
            }
            if (oneNote > 0){
                System.out.println(oneNote + " Nota(s) de um.");
            }
        } else if(console.length() == 1) {

            unit++;

            int characterOne = Integer.parseInt(String.valueOf(console.charAt(0)));

            if (characterOne >= 5){
                fiveNote++;
                oneNote = (fiveNote - 5);
            } else {
                oneNote = characterOne;
            }
            if (fiveNote > 0){
                System.out.println(fiveNote + " Nota(s) de cinco.");
            }
            if (oneNote > 0){
                System.out.println(oneNote + " Nota(s) de um.");
            }
        }
    }
}

/* .length retorna o número de elementos da array.
/* .length() retorna o número de caracteres na string. */

