package TreinamentoDaLoiane.FOOJava.Exercicios33;

public class Aluno {

    private String nome;
    private int matricula;
    private String nomeCurso;
    private String[] nomesDisciplinas = new String[3];
    private double[][] notasDisciplinas;

    // constructors

    public Aluno() {
    }

    public Aluno(String nome, int matricula, String nomeCurso, String[] nomesDisciplinas, double[][] notasDisciplinas) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
        this.nomesDisciplinas = nomesDisciplinas;
        this.notasDisciplinas = notasDisciplinas;
    }

    // getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String[] getNomesDisciplinas() {
        return nomesDisciplinas;
    }

    public void setNomesDisciplinas(String[] nomesDisciplinas) {
        this.nomesDisciplinas = nomesDisciplinas;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }

    // methods

     public void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Número de matrícula: " + matricula);
        System.out.println("Curso: " + nomeCurso);

        verNotas(1);
    }

    public void verNotas(int verificar){
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

    public void verificarAprovado(double[] notas) {
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

    public void setNomeDisciplinaPos(int pos, String nomeDisciplina){
        this.nomesDisciplinas[pos] = nomeDisciplina;
    }

    public void setNotaDisciplinaPos(int posNome, int posNota, double nota){
     this.notasDisciplinas[posNome][posNota] = nota;
    }

    public void setNotaDisciplinaTam(int tam) {
        this.notasDisciplinas = new double[nomesDisciplinas.length][tam];
    }
}
