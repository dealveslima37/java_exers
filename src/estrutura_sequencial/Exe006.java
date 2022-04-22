package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
 * mostre:
 * a) a área do triângulo retângulo que tem A por base e C por altura.
 * b) a área do círculo de raio C. (pi = 3.14159)
 * c) a área do trapézio que tem A e B por bases e C por altura.
 * d) a área do quadrado que tem lado B.
 * e) a área do retângulo que tem lados A e B
 */

public class Exe006 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        var scanner = new Scanner(System.in);

        try {
            System.out.println("Digite três valores com ponto flutuante");
            var a = scanner.nextDouble();
            var b = scanner.nextDouble();
            var c = scanner.nextDouble();

            System.out.printf("Triângulo: %.3f%n", a * c / 2.0);
            System.out.printf("Circulo: %.3f%n", Math.PI * c * c);
            System.out.printf("Trapezio: %.3f%n", (a + b) / 2.0 * c);
            System.out.printf("Quadrado: %.3f%n", b * b);
            System.out.printf("Retangulo: %.3f%n", a * b);

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Refaça a operação digitando valores válidos");
        }

        scanner.close();
    }
}
