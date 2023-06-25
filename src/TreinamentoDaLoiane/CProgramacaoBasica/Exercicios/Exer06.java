package TreinamentoDaLoiane.CProgramacaoBasica.Exercicios;

import java.util.Scanner;

public class Exer06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o raio do círculo:");
        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio,2); //Pi vezes raio ao quadrado

        System.out.println("A área é: " + area);
    }
}
