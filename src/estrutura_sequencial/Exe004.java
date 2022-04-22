package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
 * hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
 * decimais
 */

public class Exe004 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        var scanner = new Scanner(System.in);

        try {
            System.out.print("Número do funcionário: ");
            var numero = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Horas trabalhadas: ");
            var horasTrabalhadas = scanner.nextDouble();
            System.out.print("Valor da hora R$: ");
            var valorDaHora = scanner.nextDouble();
            var salario = horasTrabalhadas * valorDaHora;

            System.out.println("Número: " + numero);
            System.out.printf("Salário R$ %.2f%n", salario);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Refaça a operação digitando valores válidos");
        }


        scanner.close();
    }
}
