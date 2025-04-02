//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, num1;
        double valor1;
        int cod2, num2;
        double valor2;

        cod1 = sc.nextInt();
        num1 = sc.nextInt();
        valor1 = sc.nextDouble();
        cod2 = sc.nextInt();
        num2 = sc.nextInt();
        valor2 = sc.nextDouble();

        double valorfinal;

        valorfinal = num1 * valor1 + num2 * valor2;

        System.out.printf("valor a ser pago R$: %.2f%n", valorfinal);

        sc.close();

    }
}
