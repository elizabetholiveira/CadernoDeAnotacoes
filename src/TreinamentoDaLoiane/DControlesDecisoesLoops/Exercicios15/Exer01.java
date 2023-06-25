package TreinamentoDaLoiane.DControlesDecisoesLoops.Exercicios15;

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois números");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if ( num1 > num2){
            System.out.println("O maior número é: " + num1);
        } else {
            System.out.println("O maior número é: " + num2);
        }
    }
}
