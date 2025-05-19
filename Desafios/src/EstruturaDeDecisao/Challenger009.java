package EstruturaDeDecisao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Challenger009 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe 3 números diferentes:");
        ArrayList<Integer> number = new ArrayList<>();

        while (number.size() < 3) {
            int storage = input.nextInt();

            if (number.contains(storage)) {
                System.out.println("Número repetido! Digite um número diferente:");
            } else {
                number.add(storage);
            }
        }
        number.sort(Collections.reverseOrder());
        System.out.println("Números em ordem decrescente: " + number);
    }
}

/* .contais usado para verificar determinado se algum valor esta presente na lista */
/* .size usado para obter a quantidade de elementos em uma lista */