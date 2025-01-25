package TreinamentoDaLoiane.FOOJava.Exercicios33;

import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        JogoDaVelha jogoDaVelha = new JogoDaVelha();

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;

        while (!ganhou) {

            if (jogoDaVelha.getJogada() % 2 == 1) {
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

            jogoDaVelha.validarJogada(linha, coluna, sinal);

            ganhou = jogoDaVelha.verificarGanhador(jogoDaVelha.getJogoVelha(), sinal);

            if (ganhou) {
                System.out.println("Parabéns! Jogador " + sinal + " ganhou!");
            } else if (jogoDaVelha.verificarEmpate(jogoDaVelha.getJogoVelha())) {
                System.out.println("Que pena! Deu velha!");
                ganhou = true;
            }

            jogoDaVelha.imprimirTabuleiro();

        }
    }

}
