package TreinamentoDaLoiane.DControlesDecisoesLoops.Exercicios15;

import java.util.Scanner;

public class Exer12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salário que receberá o aumento:");
        double salario = scan.nextDouble();

        boolean isento = salario <= 900.0;
        boolean desconto5 = salario > 900.0 && salario <= 1500.0;
        boolean desconto10 = salario > 1500.0 && salario <= 2500.0;
        boolean desconto20 = salario > 2500.00;

        double ir = 0;
        if (isento){
            ir = 0;
        } if (desconto5){
            ir = (salario * 5)/100;
        }if (desconto10){
            ir = (salario * 10)/100;
        }if (desconto20){
            ir = (salario * 20)/100;
        }

        double inss = (salario * 10) / 100;
        double fgts = (salario * 11) / 100;

        double salarioNovo = salario - ir - inss;

        System.out.println("Salário bruto: " + salario);
        System.out.println("Imposto de renda: " + ir);
        System.out.println("INSS: " + inss);
        System.out.println("FGTS: " + fgts);
        System.out.println("Total de descontos: " + (ir + inss));
        System.out.println("Salário novo: " + salarioNovo);

    }
}
