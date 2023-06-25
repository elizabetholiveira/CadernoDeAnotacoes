package TreinamentoDaLoiane.CProgramacaoBasica.LendoDadosUsandoScanner;

import java.util.Scanner;

public class LeituraDadosTeclado2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimação");
        String primeiroNome = scan.next(); //Só 1 nome
        int idade = scan.nextInt(); //Número sem vírgula
        byte qtdFilhos = scan.nextByte();
        float altura = scan.nextFloat(); //Número decimal usando vírgula
        boolean temPet = scan.nextBoolean(); //true ou false

        System.out.println("Você digitou os seguintes valores:");
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Idade: " + idade);
        System.out.println("Quantidade de filhos: " + qtdFilhos);
        System.out.println("Altura: " + altura);
        System.out.println("Tem bichinho de estimação? " + temPet);
    }
}
