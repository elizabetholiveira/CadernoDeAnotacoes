package TreinamentoDaLoiane.FOOJava.Exercicios33;

public class ContaCorrente {

    private int numero;
    private double saldo;
    private boolean especial;
    private double limite;

    // constructors

    public ContaCorrente() {
    }

    public ContaCorrente(int numero, double saldo, boolean especial, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.especial = especial;
        this.limite = limite;
    }

    public ContaCorrente(double saldo, boolean especial) {
        this.saldo = saldo;
        this.especial = especial;
    }

    // getter and setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    // methods

    public void realizarSaque(double saque) {
        if (saquePossivel(saque)) {
            setSaldo(getSaldo() - saque);
            System.out.println(saque + " sacados com sucesso");
        } else if (especial && saqueEspecial(saque)) {
            limite = limite - saque;
            System.out.println("Foram sacados " + saque + " do seu limite");
        } else {
            System.out.println("Não é possível sacar");
        }

    }

    public void especialAtivo(){
        if (especial){
            System.out.println("Você está com o saldo especial atvio. Atualmente seu limite é: " + limite + "E seu saldo normal é: " + saldo);
        } else {
            System.out.println("Seu saldo especial não está ativo");
        }
    }

    public boolean saquePossivel(double saque) {
        return saldo > saque;
    }

    public boolean saqueEspecial(double saque) {
        return limite > saque;
    }

    public void depositar(double deposito) {
        saldo = saldo + deposito;
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo atual é de: R$" + saldo );
    }

}
