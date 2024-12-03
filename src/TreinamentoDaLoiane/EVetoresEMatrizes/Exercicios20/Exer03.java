package TreinamentoDaLoiane.EVetoresEMatrizes.Exercicios20;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] numeros = new int[3][3];

        int qtdPares = 0;
        int qtdImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Digite o valor de: " + i + "x" + j);
                numeros[i][j] = scan.nextInt();

                if (numeros[i][j] % 2 == 0) {
                    qtdPares++;
                } else {
                    qtdImpares++;
                }

            }
        }

        System.out.println();
        System.out.println("Matriz final:");

//        Original:
//        for (int i = 0; i<numeros.length; i++){
//            for (int j = 0; j<numeros[i].length; j++){
//                System.out.printf("%4d | ", numeros[i][j]);
//            }
//            System.out.println();
//        }

//        Sugestão do IntelliJ
        for (int[] linha : numeros) {
            for (int valor : linha) {
                System.out.printf("%4d | ", valor);
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Quantidade de números pares: " + qtdPares);
        System.out.println("Quantidade de números ímpares: " + qtdImpares);

    }

}
