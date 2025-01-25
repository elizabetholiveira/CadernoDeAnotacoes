package TreinamentoDaLoiane.FOOJava.Exercicios33;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno");
        aluno.setNome(scan.next());

        System.out.println("Entre com o nome do curso");
        aluno.setNomeCurso(scan.next());

        System.out.println("Entre com o número da matrícula");
        aluno.setMatricula(scan.nextInt());

        for (int i = 0; i<aluno.getNomesDisciplinas().length; i++) {
            System.out.println("Entre com o nome da " + (i+1) + "ª disciplina");
            aluno.setNomeDisciplinaPos(i, scan.next());
        }

        aluno.setNotaDisciplinaTam(4);
        for (int i = 0; i<aluno.getNomesDisciplinas().length; i++){
            for (int j=0; j<aluno.getNotasDisciplinas()[i].length; j++){
                System.out.println("Digite a " + (j+1) + "ª nota da disciplina: " + aluno.getNomesDisciplinas()[i]);
                aluno.setNotaDisciplinaPos(i, j, scan.nextDouble());
            }
        }

        aluno.mostrarInfo();

    }

}
