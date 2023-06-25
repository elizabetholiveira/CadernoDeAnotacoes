package TreinamentoDaLoiane.CProgramacaoBasica.Exercicios;

import java.util.Scanner;

public class Exer13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor/hora:");
        double valorHora = scan.nextDouble();

        System.out.println("Digite quantas horas foram trabalhadas:");
        double horasTrabalhadas = scan.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;

        System.out.println("O seu salário bruto é: " + salarioBruto);

        double inss = (salarioBruto/100) * 8;
        double impostoDeRenda = (salarioBruto/100) * 11;
        double sindicato = (salarioBruto/100) * 5;

        double totalDescontos = inss + impostoDeRenda + sindicato;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("INSS: " + inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.println("Imposto de Renda: " + impostoDeRenda);
        System.out.println("Total descontos: " + totalDescontos);
        System.out.println("Salário líquido: " + salarioLiquido);
    }
}
