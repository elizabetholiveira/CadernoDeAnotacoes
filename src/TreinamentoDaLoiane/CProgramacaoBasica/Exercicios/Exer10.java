package TreinamentoDaLoiane.CProgramacaoBasica.Exercicios;

import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius:");
        double c = scan.nextDouble();

        double f = c * 1.8 + 32;

        System.out.println("A temperatura " + c + "ºC é igual a " + f + "ºF");
    }
}
