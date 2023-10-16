import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ('F - 32) * 5/9 = 'C
        Scanner entrada = new Scanner(System.in);
        final int x = 32;
        final double y = 5/9.0;

        double F;
        double C;

        System.out.println("digite valor em °F");
        F = entrada.nextInt();

        C = (F - x) * y;

        System.out.printf("o valor de " + F + " em °F é igual a " + C + " em °C");
    }
}
