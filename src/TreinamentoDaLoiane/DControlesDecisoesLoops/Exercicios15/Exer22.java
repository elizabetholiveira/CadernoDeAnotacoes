package TreinamentoDaLoiane.DControlesDecisoesLoops.Exercicios15;

import java.util.Scanner;

public class Exer22 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade (kg) de morango:");
        double qtdMorango = scan.nextDouble();

        System.out.println("Entre com a quantidade (kg) de maçã:");
        double qtdMaca = scan.nextDouble();

        double precoKg = 0;
        if (qtdMorango <= 5){
            precoKg = 2.5;
        } else {
            precoKg = 2.2;
        }
        double precoTotalMorango = qtdMorango * precoKg;
        if (qtdMaca <= 5){
            precoKg = 1.8;
        } else {
            precoKg = 1.5;
        }
        double precoTotalMaca = qtdMaca * precoKg;

        double precoTotal = precoTotalMorango + precoTotalMaca;

        System.out.println("Preço sem desconto: " + precoTotal);

        if (qtdMorango + qtdMaca > 8 || precoTotal > 25){
            double desconto = (precoTotal * 10) / 100;
            precoTotal = precoTotal - desconto;
        }

        System.out.println("O valor final é: " + precoTotal);
    }
}
