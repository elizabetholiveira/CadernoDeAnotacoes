package TreinamentoDaLoiane.DControlesDecisoesLoops.Exercicios15;

import java.util.Scanner;

public class Exer07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite três números diferentes:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("O primeiro é o maior: " + num1);
        }else if (num2 > num1 && num2 > num3){
            System.out.println("O segundo é o maior: " + num2);
        } else {
            System.out.println("O terceiro é o maior: " + num3);
        }

        if (num1 < num2 && num1 < num3){
            System.out.println("O primeiro é o menor: " + num1);
        }else if (num2 < num1 && num2 < num3){
            System.out.println("O segundo é o maior: " + num2);
        } else {
            System.out.println("O terceiro é o maior: " + num3);
        }
    }
}
