package estrutura_sequencial;

import java.util.Scanner;

/**
 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
 * de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */

public class Exe003 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        try {
            System.out.println("Digite 4 valores inteiros");
            var a = scanner.nextInt();
            var b = scanner.nextInt();
            var c = scanner.nextInt();
            var d = scanner.nextInt();
            var diferenca = (a * b - c * d);

            System.out.println("Direfença: " + diferenca);
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Refaça a operação digitando valores inteiros");
        }


        scanner.close();
    }
}
