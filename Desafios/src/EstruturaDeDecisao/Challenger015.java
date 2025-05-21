package EstruturaDeDecisao;

import java.util.Scanner;

public class Challenger015 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o parâmetros A: ");
        double n1, n2, n3;
        n1 = sc.nextDouble();
        System.out.print("Digite o parâmetro B: ");
        n2 = sc.nextDouble();
        System.out.print("Digite o parâmetro C: ");
        n3 = sc.nextDouble();

        if (n1<=0 || n2<=0 || n3<=0){
            System.out.println("Lados nulos ou negativos não são aceitos.");
        } else if (n1>=n2+n3 || n2>=n3+n1 || n3>=n1+n2){
            System.out.println("Triangulo inexistente.");
        } else if (n1==n2 && n2==n3){
            System.out.println("Triangulo equilatero.");
        } else if (n1==n2 || n2==n3 || n3==n1){
            System.out.println("Triangulo isósceles.");
        } else {
            System.out.println("Triângulo escaleno");
        }
    }
}
