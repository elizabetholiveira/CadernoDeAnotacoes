package POO.xx2.ContaCorrente;

public class Main {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.agencia = "1234";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;

        System.out.printf("Saldo da conta " + conta.numero + " = R$%,.2f", conta.saldo);
    }
}
