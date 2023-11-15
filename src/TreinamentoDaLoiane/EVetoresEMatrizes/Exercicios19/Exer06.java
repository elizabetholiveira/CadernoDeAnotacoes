package TreinamentoDaLoiane.EVetoresEMatrizes.Exercicios19;

import java.util.Scanner;

public class Exer06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do vetorA da posição " + i);
            vetorA[i] = scanner.nextInt();

            System.out.println("Entre com o valor do vetorB da posição " + i);
            vetorB[i] = scanner.nextInt();

            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.print("Valores do vetorA: ");

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.print("Valores do vetorB: ");

        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.println();

        System.out.print("Valores do vetorC: ");

        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }

    }

}
