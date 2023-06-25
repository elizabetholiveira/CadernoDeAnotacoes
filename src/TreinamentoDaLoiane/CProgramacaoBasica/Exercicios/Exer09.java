package TreinamentoDaLoiane.CProgramacaoBasica.Exercicios;

import java.util.Scanner;

public class Exer09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Farenheit:");
        double f = scan.nextDouble();

        double c = ( 5 * ( f - 32) / 9);

        System.out.println("A temperatura " + f + "ºF é igual a " + c + "ºC");
    }
}
