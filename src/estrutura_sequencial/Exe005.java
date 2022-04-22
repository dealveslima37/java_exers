package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
 * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */

public class Exe005 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        var scanner = new Scanner(System.in);

        try {
            System.out.print("Código da peça 1: ");
            var codigoDaPeca1 = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Número de peças: ");
            var numeroDePecas = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Valor da peça: ");
            var valorDaPeca = scanner.nextDouble();

            var totalPeca1 = numeroDePecas * valorDaPeca;

            System.out.print("Código da peça 2: ");
            var codigoDaPeca2 = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Número de peças: ");
            numeroDePecas = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Valor da peça: ");
            valorDaPeca = scanner.nextDouble();

            var totalPeca2 = numeroDePecas * valorDaPeca;

            var total = totalPeca1 + totalPeca2;

            System.out.println("Detalhe da compra");
            System.out.println("Peça " + codigoDaPeca1 + " Valor R$: " + String.format("%.2f", totalPeca1));
            System.out.println("Peça " + codigoDaPeca2 + " Valor R$: " + String.format("%.2f", totalPeca2));
            System.out.printf("Valor Total R$: %.2f%n", total);

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Refaça a operação digitando valores válidos");
        }


        scanner.close();
    }
}
