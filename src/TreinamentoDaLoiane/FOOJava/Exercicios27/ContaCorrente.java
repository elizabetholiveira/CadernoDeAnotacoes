package TreinamentoDaLoiane.FOOJava.Exercicios27;

public class ContaCorrente {

    int numero;
    double saldo;
    boolean especial;
    double limite;

    void realizarSaque(double saque) {
        if (saquePossivel(saque)) {
            saldo = saldo - saque;
            System.out.println(saque + " sacados com sucesso");
        } else if (especial && saqueEspecial(saque)) {
            limite = limite - saque;
            System.out.println("Foram sacados " + saque + " do seu limite");
        } else {
            System.out.println("Não é possível sacar");
        }

    }

    void especialAtivo(){
        if (especial){
            System.out.println("Você está com o saldo especial atvio. Atualmente seu limite é: " + limite + "E seu saldo normal é: " + saldo);
        } else {
            System.out.println("Seu saldo especial não está ativo");
        }
    }

    boolean saquePossivel(double saque) {
        return saldo > saque;
    }

    boolean saqueEspecial(double saque) {
        return limite > saque;
    }

    void depositar(double deposito) {
        saldo = saldo + deposito;
    }

    void consultarSaldo(){
        System.out.println("Seu saldo atual é de: R$" + saldo );
    }

}
