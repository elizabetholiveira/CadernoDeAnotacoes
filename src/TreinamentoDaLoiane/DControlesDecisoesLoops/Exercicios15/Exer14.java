package TreinamentoDaLoiane.DControlesDecisoesLoops.Exercicios15;

import java.util.Scanner;

public class Exer14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite suas duas notas:");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        boolean A = media >= 9.0;
        boolean B = media >= 7.5 && media < 9.0;
        boolean C = media < 7.5 && media >= 6.0;
        boolean D = media < 6.0 && media >= 4.0;
        boolean E = media < 4.0;

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Média: " + media);

        if (A){
            System.out.println("Conceito A");
        } if (B){
            System.out.println("Conceito B");
        } if (C){
            System.out.println("Conceito C");
        } if (D){
            System.out.println("Conceito D");
        } if (E){
            System.out.println("Conceito E");
        }

        if (A || B || C){
            System.out.println("APROVADO");
        } if (D || E){
            System.out.println("REPROVADO");
        }
    }
}
