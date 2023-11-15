package TreinamentoDaLoiane.DControlesDecisoesLoops.Exercicios17;

import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean valido = false;
        double populacaoA, populacaoB;
        double taxaA, taxaB;

        do {
            System.out.println("Entre com a população A:");
            populacaoA = scanner.nextDouble();

            if (populacaoA > 0) {
                valido = true;
            } else {
                System.out.println("População precisa ser maior que 0");
            }

        } while (!valido);

        valido = false;

        do {
            System.out.println("Entre com a população B:");
            populacaoB = scanner.nextDouble();

            if (populacaoB > 0 && populacaoB > populacaoA) {
                valido = true;
            } else {
                System.out.println("População precisa ser maior que 0 e maior do que a população A");
            }

        } while (!valido);

        valido = false;

        do {
            System.out.println("Entre com a taxa de crescimento da população A:");
            taxaA = scanner.nextDouble();

            if (taxaA > 0) {
                valido = true;
            } else {
                System.out.println("Taxa precisa ser maior que 0");
            }

        } while (!valido);

        valido = false;

        do {
            System.out.println("Entre com a taxa de crescimento da população B:");
            taxaB = scanner.nextDouble();

            if (taxaB > 0 && taxaB < taxaA) {
                valido = true;
            } else {
                System.out.println("Taxa precisa ser maior que 0 e menor do que a taxa da população A");
            }

        } while (!valido);

        int cont = 0;

        while (populacaoA < populacaoB) {

            populacaoA += (populacaoA / 100) * taxaA;
            populacaoB += (populacaoB / 100) * taxaB;
            cont++;

        }

        System.out.println("População A: " + Math.round(populacaoA));
        System.out.println("População B: " + Math.round(populacaoB));
        System.out.println("Anos necessários: " + cont);

    }

}
