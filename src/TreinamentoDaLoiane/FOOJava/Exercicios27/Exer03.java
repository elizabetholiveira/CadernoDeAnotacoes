package TreinamentoDaLoiane.FOOJava.Exercicios27;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno");
        aluno.nome = scan.next();

        System.out.println("Entre com o nome do curso");
        aluno.nomeCurso = scan.next();

        System.out.println("Entre com o número da matrícula");
        aluno.matricula = scan.nextInt();

        for (int i = 0; i<aluno.nomesDisciplinas.length; i++) {
            System.out.println("Entre com o nome da " + (i+1) + "ª disciplina");
            aluno.nomesDisciplinas[i] = scan.next();
        }

        aluno.notasDisciplinas = new double[3][4];
        for (int i = 0; i<aluno.notasDisciplinas.length; i++){
            for (int j=0; j<aluno.notasDisciplinas[i].length; j++){
                System.out.println("Digite a " + (j+1) + "ª nota da disciplina: " + aluno.nomesDisciplinas[i]);
                aluno.notasDisciplinas[i][j] = scan.nextDouble();
            }
        }

        aluno.mostrarInfo();

    }

}
