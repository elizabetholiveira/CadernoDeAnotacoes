package TreinamentoDaLoiane.DControlesDecisoesLoops.Exercicios15;

import java.util.Scanner;

public class Exer09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite três números diferentes:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        boolean menor1 = num1 < num2 && num1 < num3;
        boolean maior1 = num1 > num2 && num1 > num3;
        boolean menor2 = num2 < num1 && num2 < num3;
        boolean maior2 = num2 > num1 && num2 > num3;
        boolean menor3 = num3 < num1 && num3 < num2;
        boolean maior3 = num3 > num1 && num3 > num2;

        if (menor1 && maior3){
            System.out.println(num3 + ", " + num2 + ", " + num1);
        } if (menor1 && maior2){
            System.out.println(num2 + ", " + num3 + ", " + num1);
        } if (menor2 && maior1){
            System.out.println(num1 + ", " + num3 + ", " + num2);
        } if (menor2 && maior3){
            System.out.println(num3 + ", " + num1 + ", " + num2);
        } if (menor3 && maior1){
            System.out.println(num1 + ", " + num2 + ", " + num3);
        } if (menor3 && maior2){
            System.out.println(num2 + ", " + num1 + ", " + num3);
        }
    }
}
