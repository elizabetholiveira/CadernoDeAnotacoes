package TreinamentoDaLoiane.EVetoresEMatrizes.Exercicios20;

import java.util.Scanner;

public class Exer06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char[][] jogoVelha = new char[3][3];

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0, coluna = 0;

        while (!ganhou) {

            if (jogada % 2 == 1) {
                System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
                sinal = 'X';
            } else {
                System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3)");
                sinal = 'O';
            }

            boolean linhaValida = false;
            while (!linhaValida) {
                System.out.println("Entre com a linha (1, 2 ou 3)");
                linha = scan.nextInt();
                if (linha >= 1 && linha <= 3) {
                    linhaValida = true;
                } else {
                    System.out.println("Entrada inválida, tente novamente");
                }
            }

            boolean colunaValida = false;
            while (!colunaValida) {
                System.out.println("Entre com a coluna (1, 2 ou 3)");
                coluna = scan.nextInt();
                if (coluna >= 1 && coluna <= 3) {
                    colunaValida = true;
                } else {
                    System.out.println("Entrada inválida, tente novamente");
                }
            }

            linha--;
            coluna--;

            if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
                System.out.println("Posição já usada, tente novamente");
            } else {
                jogoVelha[linha][coluna] = sinal;
                jogada++;
            }

            ganhou = verificarGanhador(jogoVelha, sinal);

            if (ganhou) {
                System.out.println("Parabéns! Jogador " + sinal + " ganhou!");
            } else if (verificarEmpate(jogoVelha)) {
                System.out.println("Que pena! Deu velha!");
                ganhou = true;
            }

            //imprimir tabuleiro
            for (char[] chars : jogoVelha) {
                for (char aChar : chars) {
                    System.out.print(aChar + " | ");
                }
                System.out.println();
            }

        }

    }

    public static boolean verificarGanhador(char[][] jogoVelha, char sinal) {
        // Verifica linhas
        for (char[] linha : jogoVelha) {
            if (linha[0] == sinal && linha[1] == sinal && linha[2] == sinal) {
                return true;
            }
        }

        // Verifica colunas
        for (int i = 0; i < jogoVelha.length; i++) {
            if (jogoVelha[0][i] == sinal && jogoVelha[1][i] == sinal && jogoVelha[2][i] == sinal) {
                return true;
            }
        }

        // Verifica diagonais
        if (jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal) {
            return true;
        }

        return jogoVelha[0][2] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][0] == sinal;
    }

    public static boolean verificarEmpate(char[][] jogoVelha) {
        //para cada linha em jogoVelha
        for (char[] linha : jogoVelha) {
            //para cada item dentro da coluna da linha jogoVelha
            for (char item : linha) {
                if (item == '\0') { // Verifica se há espaços vazios
                    return false;
                }
            }
        }
        return true;
    }

}
