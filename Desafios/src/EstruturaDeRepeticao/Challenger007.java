package EstruturaDeRepeticao;

import java.util.Scanner;

public class Challenger007 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hundred = 0;
        int hundredOne = 0;
        int hundredTwo = 0;
        int hundredTheree = 0;
        int hundredFour = 0;
        int hundredFive = 0;

        int product = 0;
        double totalValue = 0;

        double hotDog = 1.20;
        double simpleBauru = 1.30;
        double bauruWithEgg = 1.50;
        double hamburger = 1.20;
        double cheeseBurger = 1.30;
        double refrigerator = 1.0;

        double calcHotDog = 0;
        double calcSimpleBauru = 0;
        double calcBauruWithEgg = 0;
        double calcHamburger = 0;
        double calcCheeseBurger = 0;
        double calcRefrigerator = 0;

        System.out.println("=====================================");
        System.out.println("============= Cardapio ==============");
        System.out.println("Especificação      Código      Preço");

        do {
            System.out.println("Cachorro quente      100      R$ 1,20");
            System.out.println("Bauru simples        101      R$ 1,30");
            System.out.println("Bauru com ovo        102      R$ 1,50");
            System.out.println("Hamburguer           103      R$ 1,20");
            System.out.println("Cheeseburguer        104      R$ 1,30");
            System.out.println("Refrigerante         105      R$ 1,00");
            System.out.println("======== Digite 0 para sair =========");

            product = scanner.nextInt();

            if(product == 0) break;

            if (product != 100 && product != 101 && product != 102 && product != 103 && product != 104 && product != 105) {
                System.out.println("Por favor insira um código valido!");
                continue;
            }

            if (product == 100) {
                hundred++;
            }
            if (product == 101) {
                hundredOne++;
            }
            if (product == 102) {
                hundredTwo++;
            }
            if (product == 103) {
                hundredTheree++;
            }
            if (product == 104) {
                hundredFour++;
            }
            if (product == 105) {
                hundredFive++;
            }

            calcHotDog = hotDog * hundred;
            calcSimpleBauru = simpleBauru * hundredOne;
            calcBauruWithEgg = bauruWithEgg * hundredTwo;
            calcHamburger = hamburger * hundredTheree;
            calcCheeseBurger = cheeseBurger * hundredFour;
            calcRefrigerator = refrigerator * hundredFive;

            totalValue = calcHotDog + calcSimpleBauru + calcBauruWithEgg + calcHamburger + calcCheeseBurger + calcRefrigerator;
        } while (true);

        System.out.println("====================================");
        if(hundred > 0) System.out.printf("Cachorro quente %8d x R$%6.2f" ,hundred ,hotDog);
        if(hundredOne > 0) System.out.printf("\nBauru simples %10d x R$%6.2f" ,hundredOne ,simpleBauru);
        if(hundredTwo > 0) System.out.printf("\nBauru com ovo  %9d x R$%6.2f" ,hundredTwo ,bauruWithEgg);
        if(hundredTheree > 0) System.out.printf("\nHamburguer  %12d x R$%6.2f" ,hundredTheree ,hamburger);
        if(hundredFour > 0) System.out.printf("\nCheeseBurger  %10d x R$%6.2f" ,hundredFour ,cheeseBurger);
        if(hundredFive > 0) System.out.printf("\nRefrigerante  %10d x R$%6.2f" ,hundredFive ,refrigerator);
        System.out.printf("\nTotal R$%27.2f\n" ,totalValue);
        System.out.println("====================================");
    }
}
