package TreinamentoDaLoiane.DControlesDecisoesLoops.Exercicios15;

import java.util.Scanner;

public class Exer20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para a vítima? (S / N)");
        String resp1 = scan.next();

        System.out.println("Esteve no local do crime? (S / N)");
        String resp2 = scan.next();

        System.out.println("Mora perto da vítima? (S / N)");
        String resp3 = scan.next();

        System.out.println("Devia para a vítima? (S / N)");
        String resp4 = scan.next();

        System.out.println("Já trabalhou com a vítima? (S / N)");
        String resp5 = scan.next();

        int cont = 0;

        if (resp1.equalsIgnoreCase("S")){
            cont++;
        }
        if (resp2.equalsIgnoreCase("S")){
            cont++;
        }
        if (resp3.equalsIgnoreCase("S")){
            cont++;
        }
        if (resp4.equalsIgnoreCase("S")){
            cont++;
        }
        if (resp5.equalsIgnoreCase("S")){
            cont++;
        }

        if (cont == 2){
            System.out.println("Suspeito");
        } else if (cont == 3 || cont == 4){
            System.out.println("Cúmplice");
        } else if (cont == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }
    }
}
