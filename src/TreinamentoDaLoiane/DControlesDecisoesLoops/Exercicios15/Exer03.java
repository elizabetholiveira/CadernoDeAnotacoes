package TreinamentoDaLoiane.DControlesDecisoesLoops.Exercicios15;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite M ou F:");
        String input = scan.next();

        if (input.equalsIgnoreCase("f")){
            System.out.println("F - Feminino");
        } else if (input.equalsIgnoreCase("m")){
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo inválido");
        }
    }
}
