package TreinamentoDaLoiane.EVetoresEMatrizes.Exercicios20;

import java.util.Random;

public class Exer02 {

    public static void main(String[] args) {

        int[][] numerosAleatorios = new int[10][10];

        Random numeroRandomico = new Random();

        //Preenchendo a matriz com números aleatórios
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandomico.nextInt(10);
            }
        }

        int maiorLinha5 = 0;
        int menorLinha5 = 10;
        int maiorColuna7 = 0;
        int menorColuna7 = 10;

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                if (i == 5) {
                    if (numerosAleatorios[i][j] > maiorLinha5) {
                        maiorLinha5 = numerosAleatorios[i][j];
                    }
                    if (numerosAleatorios[i][j] < menorLinha5) {
                        menorLinha5 = numerosAleatorios[i][j];
                    }
                }

                if (j == 7) {
                    if (numerosAleatorios[i][j] > maiorColuna7) {
                        maiorColuna7 = numerosAleatorios[i][j];
                    }
                    if (numerosAleatorios[i][j] < menorColuna7) {
                        menorColuna7 = numerosAleatorios[i][j];
                    }
                }
            }
        }

        System.out.println("Maior valor da linha 5 = " + maiorLinha5);
        System.out.println("Menor valor da linha 5 = " + menorLinha5);
        System.out.println("Maior valor da coluna 7 = " + maiorColuna7);
        System.out.println("Menor valor da coluna 7 = " + menorColuna7);

        System.out.println();

        System.out.println("Matriz inteira:");
        for (int j = 0; j < numerosAleatorios[0].length; j++) {
            System.out.print("C" + j + " | ");
        }
        System.out.println();
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.printf("%2d | ", numerosAleatorios[i][j]);
            }
            System.out.println(" L" + i);
        }
    }

}
