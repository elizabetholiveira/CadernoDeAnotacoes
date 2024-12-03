package TreinamentoDaLoiane.EVetoresEMatrizes.Exercicios20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // [mês][dia][hora]
        String[][][] compromissos = new String[12][31][8];

        Map<Integer, String> nomeDoMes = new HashMap<>();
        nomeDoMes.put(1, "janeiro");
        nomeDoMes.put(2, "fevereiro");
        nomeDoMes.put(3, "março");
        nomeDoMes.put(4, "abril");
        nomeDoMes.put(5, "maio");
        nomeDoMes.put(6, "junho");
        nomeDoMes.put(7, "julho");
        nomeDoMes.put(8, "agosto");
        nomeDoMes.put(9, "setembro");
        nomeDoMes.put(10, "outubro");
        nomeDoMes.put(11, "novembro");
        nomeDoMes.put(12, "dezembro");

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

            boolean mesValido = false;
            int mes = 0;

            switch (opcao) {
                case 0:
                    sair = true;
                    break;
                case 1:
                    System.out.println("Adicionar compromisso:");

                    while (!mesValido) {
                        System.out.println("Digite o mês(em números):");
                        mes = scan.nextInt();

                        if (mes > 0 && mes <= 12) {
                            mesValido = true;
                        } else {
                            System.out.println("O mês não é válido!");
                        }
                    }

                    while (!diaValido) {
                        System.out.println("Digite o dia:");
                        dia = scan.nextInt();

                        if (mes == 2) {
                            if (dia > 0 && dia <= 28) {
                                diaValido = true;
                            } else {
                                System.out.println("O dia não é válido!");
                            }
                        } else if (mes % 2 != 0 || mes == 8) {
                            if (dia > 0 && dia <= 31) {
                                diaValido = true;
                            } else {
                                System.out.println("O dia não é válido!");
                            }
                        } else {
                            if (dia > 0 && dia <= 30) {
                                diaValido = true;
                            } else {
                                System.out.println("O dia não é válido!");
                            }
                        }
                    }

                    boolean horaValida = false;
                    int hora = 0;

                    while (!horaValida) {
                        System.out.println("Digite a hora (inteira entre 8 e 16):");
                        hora = scan.nextInt();

                        if (hora >= 8 && hora <= 16) {
                            horaValida = true;
                        } else {
                            System.out.println("A hora não é válida!");
                        }
                    }

                    System.out.println("Digite o compromisso:");
                    scan.nextLine();
                    compromissos[mes - 1][dia - 1][hora - 8] = scan.nextLine();

                    System.out.println("Seu compromisso de " + hora + "h do dia " + dia + " de " + nomeDoMes.get(mes) + " é: " + compromissos[mes - 1][dia - 1][hora - 8]);

                    break;
                case 2:

                    System.out.println("Qual data você quer ver seus compromissos?");

                    while (!mesValido) {
                        System.out.println("Digite o mês(em números):");
                        mes = scan.nextInt();

                        if (mes > 0 && mes <= 12) {
                            mesValido = true;
                        } else {
                            System.out.println("O mês não é válido!");
                        }
                    }

                    while (!diaValido) {
                        System.out.println("Digite o dia:");
                        dia = scan.nextInt();

                        if (mes == 2) {
                            if (dia > 0 && dia <= 28) {
                                diaValido = true;
                            } else {
                                System.out.println("O dia não é válido!");
                            }
                        } else if (mes % 2 != 0 || mes == 8) {
                            if (dia > 0 && dia <= 31) {
                                diaValido = true;
                            } else {
                                System.out.println("O dia não é válido!");
                            }
                        } else {
                            if (dia > 0 && dia <= 30) {
                                diaValido = true;
                            } else {
                                System.out.println("O dia não é válido!");
                            }
                        }
                    }

                    System.out.println();

                    System.out.println("Seus compromissos do dia " + dia + " de " + nomeDoMes.get(mes) + " são:");

                    boolean temCompromissos = false;

                    // i = hora
                    for (int i = 0; i < compromissos[mes - 1][dia - 1].length; i++) {
                        if (compromissos[mes - 1][dia - 1][i] != null) {
                            System.out.println((i + 8) + "h: " + compromissos[mes - 1][dia - 1][i]);
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
