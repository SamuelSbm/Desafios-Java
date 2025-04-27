package EstruturaSequencial;

public class Challenger013 {
    public static void main(String[] args) {

        double heigthMan = 1.70;
        double heigtWoman = 1.55;

        double resultMan = (72.7 * heigthMan) - 58;
        double resultWoman = (62.1 * heigtWoman) - 47.7;

        System.out.printf("Peso ideal para o homem: %.0f \n", resultMan);
        System.out.printf("Peso ideal para a mulher: %.0f \n", resultWoman);
    }
}
