package TreinamentoDaLoiane.DControlesDecisoesLoops.Exercicios15;

import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva as duas notas:");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media == 10){
            System.out.println("Aprovado com distinção");
        } else if (media >= 7){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
