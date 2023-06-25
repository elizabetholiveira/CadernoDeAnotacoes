package TreinamentoDaLoiane.CProgramacaoBasica.Exercicios;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva dois números");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma desses números é: " + soma);
    }
}
