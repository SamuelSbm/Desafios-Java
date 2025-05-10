package EstruturaSequencial;

import java.util.Scanner;

public class Challenger018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tamanho do arquivo (em MB): ");
        double fileSize = sc.nextDouble();
        System.out.println("Informe a velocidade da internet (em Mbps): ");
        double internetSpeed = sc.nextDouble();

        double sizeBits = ((fileSize * 8) * 1024) * 1024;
        double speedBits = ((internetSpeed * 1024) * 1024);

        double downloadInSeconds = sizeBits / speedBits;
        double downloadInMinutes = downloadInSeconds / 60;

        System.out.printf("\nO Download levará %.2f minutos." , downloadInMinutes);
    }
}
