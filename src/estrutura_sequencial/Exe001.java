package estrutura_sequencial;

import java.util.Scanner;

/**
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
 * mensagem explicativa, conforme exemplos.
 */

public class Exe001 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Digite dois valores inteiros");
        var valor1 = scanner.nextLine();
        var valor2 = scanner.nextLine();

        if (valor1.chars().allMatch(Character::isDigit) && valor2.chars().allMatch(Character::isDigit)) {
            var numero1 = Integer.parseInt(valor1);
            var numero2 = Integer.parseInt(valor2);
            var soma = numero1 + numero2;

            System.out.println("Soma = " + soma);
        } else {
            System.out.println("Refaçã a operação digitando número inteiros");
        }


        scanner.close();
    }
}
