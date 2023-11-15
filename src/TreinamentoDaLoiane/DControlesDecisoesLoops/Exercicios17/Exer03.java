package TreinamentoDaLoiane.DControlesDecisoesLoops.Exercicios17;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean infoValida = false;
        String nome;

        do {

            System.out.println("Entre com o nome:");

            nome = scanner.nextLine();

            if (nome.length() >= 3){
                infoValida = true;
            } else {
                System.out.println("Nome precisa ter no mínimo 3 caracteres.");
            }

        } while (!infoValida);

        infoValida = false;
        int idade;

        do {

            System.out.println("Entre com a idade:");

            idade = scanner.nextInt();

            if (idade >= 0 && idade <= 150){
                infoValida = true;
            } else {
                System.out.println("Idade precisa ser entre 0 e 150.");
            }

        } while (!infoValida);

        infoValida = false;
        double salario;

        do {

            System.out.println("Entre com o salário:");

            salario = scanner.nextDouble();

            if (salario > 0){
                infoValida = true;
            } else {
                System.out.println("Salário precisa ser maior do que 0.");
            }

        } while (!infoValida);

        infoValida = false;
        String sexo;

        do {

            System.out.println("Entre com o sexo ('F' ou 'M'):");

            sexo = scanner.next();

            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
                infoValida = true;
            } else {
                System.out.println("Por enquanto só aceitamos como alternativas 'F' ou 'M'.");
            }

        } while (!infoValida);

        infoValida = false;
        String estadoCivil;

        do {

            System.out.println("Entre com o estado civil:");

            estadoCivil = scanner.next();

            if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") ||
            estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")){
                infoValida = true;
            } else {
                System.out.println("Por enquanto só aceitamos como alternativas 'S', 'C', 'V' ou 'D'.");
            }

        } while (!infoValida);

        System.out.println("Dados:");
        System.out.println("Nome:" + nome);
        System.out.println("Idade:" + idade);
        System.out.println("Salário:" + salario);
        System.out.println("Sexo:" + sexo);
        System.out.println("Estado civil:" + estadoCivil);

    }
}
