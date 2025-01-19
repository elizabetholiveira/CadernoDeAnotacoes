package TreinamentoDaLoiane.FOOJava.Exercicios27;

public class Aluno {

    String nome;
    int matricula;
    String nomeCurso;
    String[] nomesDisciplinas = new String[3];
    double[][] notasDisciplinas;

    void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Número de matrícula: " + matricula);
        System.out.println("Curso: " + nomeCurso);

        verNotas(1);
    }

    void verNotas(int verificar){
        System.out.println("Notas:");
        for (int i=0; i< notasDisciplinas.length; i++){
            System.out.println("Disciplina: " + nomesDisciplinas[i]);
            for (double nota : notasDisciplinas[i] ){
                System.out.println(nota);
            }
            if (verificar == 1) {
                verificarAprovado(notasDisciplinas[i]);
            }
        }
    }

    void verificarAprovado(double[] notas) {
        double somaNotas = 0;
        for (double nota : notas){
            somaNotas+=nota;
        }
        double resultado = (somaNotas)/4;
        System.out.println("Média da matéria: " + resultado );
        if (resultado >= 7){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }

}
