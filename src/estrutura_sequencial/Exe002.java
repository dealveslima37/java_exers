package estrutura_sequencial;

import java.util.Scanner;

/**
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
 * casas decimais conforme exemplos.
 * Fórmula da área: area = π . raio2
 * Considere o valor de π = 3.14159
 */

public class Exe002 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Valor do Raio: ");
        var raioStr = scanner.nextLine();

        try {
            var raio = Double.parseDouble(raioStr);
            var area = Math.PI * (raio * raio);
            System.out.printf("Area %.2f%n", raio);
        } catch (Exception e) {
            System.err.println(e);
            System.out.println("Error! Refaça a operação digitando valores válidos");
        }

        scanner.close();
    }
}
