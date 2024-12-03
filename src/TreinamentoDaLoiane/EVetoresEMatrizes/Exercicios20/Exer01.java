package TreinamentoDaLoiane.EVetoresEMatrizes.Exercicios20;

import java.util.ArrayList;
import java.util.Random;

public class Exer01 {

    public static void main(String[] args) {

        int[][] numerosAleatorios = new int[4][4];

        Random numeroRandomico = new Random();

        //Preenchendo a matriz com números aleatórios
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroRandomico.nextInt(10);
            }
        }

        int maior = 0;
        ArrayList<Integer> linha = new ArrayList<>();
        ArrayList<Integer> coluna = new ArrayList<>();

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                if (numerosAleatorios[i][j] > maior) {
                    maior = numerosAleatorios[i][j];

                    // Limpando localização do maior valor anterior
                    linha.clear();
                    coluna.clear();

                    // Salvando localização do maior valor atual
                    linha.add(i);
                    coluna.add(j);
                } else if (numerosAleatorios[i][j] == maior) {
                    // Adicionando outra localização do maior valor
                    linha.add(i);
                    coluna.add(j);
                }

            }
        }

        System.out.println("Maior valor = " + maior);
        System.out.println("Nos campos:");
        for (int i = 0; i < linha.size(); i++) {
            System.out.println(linha.get(i) + " x " + coluna.get(i));
        }

        System.out.println();

        System.out.println("Matriz inteira:");
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.print(numerosAleatorios[i][j] + " | ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Estrutura da matriz:");
        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.print(j + " | ");
            }
            System.out.println(" <- Linha " + i);
        }

    }

}
