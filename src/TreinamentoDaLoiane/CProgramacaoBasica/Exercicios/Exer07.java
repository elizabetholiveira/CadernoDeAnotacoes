package TreinamentoDaLoiane.CProgramacaoBasica.Exercicios;

import java.util.Scanner;

public class Exer07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado do quadrado:");
        double lado = scan.nextByte();

        double area = Math.pow(lado,2);

        System.out.println("A área é: " + area);
        System.out.println("O dobro da área é: " + (area * 2));
    }
}
