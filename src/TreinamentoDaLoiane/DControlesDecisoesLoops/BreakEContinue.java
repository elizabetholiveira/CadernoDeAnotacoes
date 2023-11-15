package TreinamentoDaLoiane.DControlesDecisoesLoops;

import java.util.Scanner;

public class BreakEContinue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Break

//        System.out.println("Entre com um número");
//        int num = scanner.nextInt();
//
//        System.out.println("Entre com um limite");
//        int max = scanner.nextInt();
//
//        for (int i = num; i <= max; i++) {
//            if (i % 7 == 0) {
//                System.out.println("O valor de i é: " + i);
//                break;
//            }
//        }

        // Break com Rótulo - Goto (não é uma boa prática nem geralmente usado)

//        for (int i = 0; i <= 4; i++) {
//            rotulo1: {
//                rotulo2: {
//                    rotulo3: {
//                        if (i == 1) {
//                            break rotulo1;
//                        }
//                        if (i == 2) {
//                            break  rotulo2;
//                        } if (i == 3) {
//                            break rotulo3;
//                        }
//                        System.out.println("rotulo3");
//                    }
//                    System.out.println("rotulo2");
//            }
//                System.out.println("rotulo1");
//            }
//            System.out.println("i: " + i);
//        }

        // Continue

        System.out.println("Entre com um número");
        int num = scanner.nextInt();

        System.out.println("Entre com um limite");
        int max = scanner.nextInt();

        for (int i = num; i <= max; i++) {
            if (i % 7 == 0) {
                continue;
            }
            System.out.println("O valor de i é: " + i);
        }

    }

}
