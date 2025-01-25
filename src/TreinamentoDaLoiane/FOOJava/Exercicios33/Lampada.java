package TreinamentoDaLoiane.FOOJava.Exercicios33;

public class Lampada {

    private String modelo;
    private String tensao;
    private int potencia;
    private String cor;
    private int garantiaMeses;
    private String[] tipos;
    private boolean ligada;

    // constructor

    public Lampada() {
    }

    public Lampada(String modelo, String tensao, int potencia, String cor, int garantiaMeses, String[] tipos, boolean ligada) {
        this.modelo = modelo;
        this.tensao = tensao;
        this.potencia = potencia;
        this.cor = cor;
        this.garantiaMeses = garantiaMeses;
        this.tipos = tipos;
        this.ligada = ligada;
    }

    // getters and setters

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    // methods

    public void ligar(){setLigada(true);}

    public void desligar(){setLigada(false);}

    public void estado(){
        if (isLigada()) {
            System.out.println("A lâmpada está ligada");
        } else {
            System.out.println("A lâmpada está desligada");
        }
    }

    public void mudarEstado(){
        if (isLigada()) {
            desligar();
        } else {
            ligar();
        }
    }

}
