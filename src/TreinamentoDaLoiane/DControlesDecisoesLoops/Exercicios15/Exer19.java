package TreinamentoDaLoiane.DControlesDecisoesLoops.Exercicios15;

import java.util.Scanner;

public class Exer19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois números:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("O que você deseja fazer? (+ - * /)");
        System.out.println("A - adição");
        System.out.println("S - subtração");
        System.out.println("M - multiplicação");
        System.out.println("D - divisão");
        String selecao = scan.next();

        System.out.println();

        int resultado = 0;
        boolean valido = true;

        switch (selecao){
            case "A":
            case "a":
            case "+":
                System.out.println("A - adição");
                resultado = num1 + num2;
                break;
            case "S":
            case "s":
            case "-":
                System.out.println("S - subtração");
                resultado = num1 - num2;
                break;
            case "M":
            case "m":
            case "*":
                System.out.println("M - multiplicação");
                resultado = num1 * num2;
                break;
            case "D":
            case "d":
            case "/":
                System.out.println("D - divisão");
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Entrada inválida");
                valido = false;
        }

        if (valido) {
            System.out.println("Resultado: " + resultado);

            System.out.println();

            if (resultado % 2 == 0) {
                System.out.println("O resultado é par");
            }
            if (resultado % 2 != 0) {
                System.out.println("O resultado é ímpar");
            }

            if (resultado >= 0) {
                System.out.println("O resultado é positivo");
            }
            if (resultado < 0) {
                System.out.println("O resultado é negativo");
            }
        }
    }
}
