package TreinamentoDaLoiane.DControlesDecisoesLoops.Exercicios15;

import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salário que receberá o aumento:");
        double salario = scan.nextDouble();

        boolean aumento20 = salario <= 280.0;
        boolean aumento15 = salario > 280.0 && salario < 700.0;
        boolean aumento10 = salario >= 700.0 && salario < 1500.0;
        boolean aumento5 = salario >= 1500.00;

        System.out.println("Salário antigo: " + salario);

        double aumento;
        double salarioNovo;

        if (aumento20){
            aumento = (salario * 20) / 100;
            salarioNovo = salario + aumento;
            System.out.println("Aumento de 20%");
            System.out.println("Valor do aumento: " + aumento);
            System.out.println("Salário novo: " + salarioNovo);
        }if (aumento15){
            aumento = (salario * 15) / 100;
            salarioNovo = salario + aumento;
            System.out.println("Aumento de 15%");
            System.out.println("Valor do aumento: " + aumento);
            System.out.println("Salário novo: " + salarioNovo);
        }if (aumento10){
            aumento = (salario * 10) / 100;
            salarioNovo = salario + aumento;
            System.out.println("Aumento de 10%");
            System.out.println("Valor do aumento: " + aumento);
            System.out.println("Salário novo: " + salarioNovo);
        }if (aumento5){
            aumento = (salario * 5) / 100;
            salarioNovo = salario + aumento;
            System.out.println("Aumento de 5%");
            System.out.println("Valor do aumento: " + aumento);
            System.out.println("Salário novo: " + salarioNovo);
        }
    }
}
