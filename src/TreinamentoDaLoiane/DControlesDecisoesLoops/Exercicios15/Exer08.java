package TreinamentoDaLoiane.DControlesDecisoesLoops.Exercicios15;

import java.util.Scanner;

public class Exer08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite três preços diferentes:");
        double preco1 = scan.nextDouble();
        double preco2 = scan.nextDouble();
        double preco3 = scan.nextDouble();

        if (preco1 < preco2 && preco1 < preco3){
            System.out.println("O primeiro é o menor: " + preco1);
        }else if (preco2 < preco1 && preco2 < preco3){
            System.out.println("O segundo é o maior: " + preco2);
        } else {
            System.out.println("O terceiro é o maior: " + preco3);
        }
    }
}
