package TreinamentoDaLoiane.DControlesDecisoesLoops.Exercicios17;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean igual = true;

        do {

            System.out.println("Entre com o nome do usuário(sem espaços):");
            String nome = scanner.next();

            System.out.println("Entre com a senha(sem espaços):");
            String senha = scanner.next();

            if (nome.equals(senha)) {
                System.out.println("Nome e senha não podem ser iguais!");
            } else {
                igual = false;
            }

        } while (igual);

    }
}
