package TreinamentoDaLoiane.CProgramacaoBasica.Exercicios;

import java.util.Scanner;

public class Exer08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor/hora:");
        double valorHora = scan.nextDouble();

        System.out.println("Digite quantas horas foram trabalhadas:");
        double horasTrabalhadas = scan.nextDouble();

        double salario = valorHora * horasTrabalhadas;

        System.out.println("O seu salário final é: " + salario);
    }
}
