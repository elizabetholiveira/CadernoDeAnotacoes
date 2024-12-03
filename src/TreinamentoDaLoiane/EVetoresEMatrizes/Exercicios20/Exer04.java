package TreinamentoDaLoiane.EVetoresEMatrizes.Exercicios20;

import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] compromissos = new String[24][31];

        boolean sair = false;
        byte opcao;

        while (!sair) {

            System.out.println("Selecione opção:");
            System.out.println("0 - sair");
            System.out.println("1 - adicionar compromisso");
            System.out.println("2 - ver compromisso");

            opcao = scan.nextByte();

            boolean diaValido = false;
            int dia = 0;

            switch (opcao) {
                case 0:
                    sair = true;
                    break;
                case 1:
                    System.out.println("Adicionar compromisso:");

                    while (!diaValido) {
                        System.out.println("Digite o dia:");
                        dia = scan.nextInt();

                        if (dia > 0 && dia <= 31) {
                            diaValido = true;
                        } else {
                            System.out.println("O dia não é válido!");
                        }
                    }

                    boolean horaValida = false;
                    int hora = 0;

                    while (!horaValida) {
                        System.out.println("Digite a hora (inteira entre 0 e 23):");
                        hora = scan.nextInt();

                        if (hora >= 0 && hora <= 23) {
                            horaValida = true;
                        } else {
                            System.out.println("A hora não é válida!");
                        }
                    }

                    System.out.println("Digite o compromisso:");
                    scan.nextLine();
                    compromissos[hora][dia - 1] = scan.nextLine();

                    System.out.println("Seu compromisso de " + hora + "h do dia " + dia + " é: " + compromissos[hora][dia - 1]);

                    break;
                case 2:

                    System.out.println("Qual dia você quer ver seus compromissos?");

                    while (!diaValido) {
                        System.out.println("Digite o dia:");
                        dia = scan.nextInt();

                        if (dia > 0 && dia <= 31) {
                            diaValido = true;
                        } else {
                            System.out.println("O dia não é válido!");
                        }
                    }

                    System.out.println();

                    System.out.println("Seus compromissos do dia " + dia + " são:");

                    boolean temCompromissos = false;

                    // i = hora
                    for (int i = 0; i < compromissos.length; i++) {
                        if (compromissos[i][dia - 1] != null) {
                            System.out.println(i + "h: " + compromissos[i][dia - 1]);
                            temCompromissos = true;
                        }
                    }

                    if (!temCompromissos) {
                        System.out.println("Nenhum!");
                    }

                    System.out.println();

                    break;
                default:
                    System.out.println("Opção inválida");
            }

        }

    }

}
