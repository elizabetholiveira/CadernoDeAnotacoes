package TreinamentoDaLoiane.FOOJava.Exercicios27;

public class Exer02 {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.saldo = 100;
        conta.especial = false;

        conta.especialAtivo();

        conta.realizarSaque(30);

        conta.consultarSaldo();

        conta.depositar(10);

        conta.consultarSaldo();

    }

}
