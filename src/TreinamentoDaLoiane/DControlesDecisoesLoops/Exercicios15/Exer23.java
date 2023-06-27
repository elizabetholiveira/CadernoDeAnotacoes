package TreinamentoDaLoiane.DControlesDecisoesLoops.Exercicios15;

import java.util.Scanner;

public class Exer23 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o tipo da carne");
        System.out.println("1) Filé duplo");
        System.out.println("2) Alcatra");
        System.out.println("3) Picanha");
        int tipo = scan.nextInt();

        System.out.println("Entre com a quantidade (kg):");
        double qtd = scan.nextDouble();

        double precokg = 0;

        if (tipo == 1){
            if (qtd < 5){
                precokg = 4.9;
            } else {
                precokg = 5.8;
            }
        } if (tipo == 2){
            if (qtd < 5){
                precokg = 5.9;
            } else {
                precokg = 6.8;
            }
        } if (tipo == 3){
            if (qtd < 5){
                precokg = 6.9;
            } else {
                precokg = 7.8;
            }
        }

        double precoFinal = qtd * precokg;

        System.out.println("Você usou o cartão Tabajara? (S / N)");
        String cartao = scan.next();

        if (cartao.equalsIgnoreCase("S")){
            double desconto = (precoFinal * 5) / 100;
            precoFinal -= desconto;
        }

        System.out.println("O valor a ser pago é: " + precoFinal);
    }
}
