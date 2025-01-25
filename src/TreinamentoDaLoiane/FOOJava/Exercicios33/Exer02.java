package TreinamentoDaLoiane.FOOJava.Exercicios33;

public class Exer02 {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente(100, false);

        conta.especialAtivo();

        conta.realizarSaque(30);

        conta.consultarSaldo();

        conta.depositar(10);

        conta.consultarSaldo();

    }

}
