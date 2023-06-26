package TreinamentoDaLoiane.DControlesDecisoesLoops.Exercicios15;

import java.util.Scanner;

public class Exer15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite três lados de um triângulo");
        int lado1 = scan.nextInt();
        int lado2 = scan.nextInt();
        int lado3 = scan.nextInt();

        boolean trianguloValido1 = (lado1 + lado2) > lado3;
        boolean trianguloValido2 = (lado1 + lado3) > lado2;
        boolean trianguloValido3 = (lado2 + lado3) > lado1;

        boolean equilatero = lado1 == lado2 && lado2 == lado3;
        boolean isosceles = lado1 == lado2 || lado1 == lado3 || lado2 == lado3;
        boolean escaleno = lado1 != lado2 && lado2 != lado3 && lado1 != lado3;

        if (trianguloValido1 || trianguloValido2 || trianguloValido3){
            if (equilatero){
                System.out.println("Esse é um triângulo equilátero");
            } else if (isosceles){
                System.out.println("Esse é um triângulo isósceles");
            } else if (escaleno){
                System.out.println("Esse é um triângulo escaleno");
            }
        } else {
            System.out.println("Esse não é um triângulo válido!");
        }
    }
}
