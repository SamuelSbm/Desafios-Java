package EstruturaDeRepeticao;

public class Challenger003 {
    public static void main(String[] args) {

        int valueA = 0;
        int valueB = 1;

        System.out.print(valueA + ", " + valueB);

        while (valueB < 500) {

            int nextValue = (valueA + valueB);
            valueA = valueB;
            valueB = nextValue;

            System.out.print(", " + nextValue);
        }
    }
}
