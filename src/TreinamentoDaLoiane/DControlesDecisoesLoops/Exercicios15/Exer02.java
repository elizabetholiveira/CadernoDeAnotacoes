package TreinamentoDaLoiane.DControlesDecisoesLoops.Exercicios15;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = scan.nextInt();

        if (num >= 0){
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }
    }
}
