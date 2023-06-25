package TreinamentoDaLoiane.CProgramacaoBasica.Exercicios;

import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de metros:");
        double metros = scan.nextDouble();

        double centimetros = metros * 100;

        System.out.println("Em centímetros é: " + centimetros + " cm");
    }
}
