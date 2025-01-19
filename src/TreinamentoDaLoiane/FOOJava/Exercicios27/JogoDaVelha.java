package TreinamentoDaLoiane.FOOJava.Exercicios27;

public class JogoDaVelha {

    char[][] jogoVelha = new char[3][3];
    int jogada = 1;

    void validarJogada(int linha, int coluna, char sinal) {
        if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
            System.out.println("Posição já usada, tente novamente");
        } else {
            jogoVelha[linha][coluna] = sinal;
            jogada++;
        }
    }

    void imprimirTabuleiro() {
        for (char[] chars : jogoVelha) {
            for (char aChar : chars) {
                System.out.print(aChar + " | ");
            }
            System.out.println();
        }
    }

    boolean verificarGanhador(char[][] jogoVelha, char sinal) {
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

    boolean verificarEmpate(char[][] jogoVelha) {
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
