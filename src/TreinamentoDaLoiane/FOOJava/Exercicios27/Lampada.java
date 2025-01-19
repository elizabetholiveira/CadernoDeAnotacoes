package TreinamentoDaLoiane.FOOJava.Exercicios27;

public class Lampada {

    String modelo;
    String tensao;
    int potencia;
    String cor;
    int garantiaMeses;
    String[] tipos;
    boolean ligada;

    void ligar(){
        ligada = true;
    }

    void desligar(){
        ligada = false;
    }

    void estado(){
        if (ligada) {
            System.out.println("A lâmpada está ligada");
        } else {
            System.out.println("A lâmpada está desligada");
        }
    }

    void mudarEstado(){
        if (ligada) {
            desligar();
        } else {
            ligar();
        }
    }

}
