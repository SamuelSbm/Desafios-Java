package EstruturaDeDecisao;
import java.util.Scanner;

public class Challenger010 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Em qual turno você estuda? (M-matutino, V-vespertino ou N-noturno)");
        String shift = sc.nextLine().toLowerCase();

        if (shift.equals("matutino") || shift.equals("m")) {
            System.out.print("Bom dia!");
        } else if (shift.equals("vespertino") || shift.equals("v")) {
            System.out.print("Boa tarde!");
        } else if(shift.equals("noturno") || shift.equals("n")){
            System.out.print("Boa noite!");
        } else {
            System.out.println("Valor invalido!");
        }
    }
}

/* .toLowerCase() lê e converte para letras minuscula */