package TreinamentoDaLoiane.CProgramacaoBasica.Operadores;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado += 2;
        System.out.println(resultado);

        resultado /= 2;
        System.out.println(resultado);

        resultado += 8;
        System.out.println(resultado);

        resultado %= 7;
        System.out.println(resultado);

        double resultado1 = 35.0 % 6.0;
        System.out.println(resultado1);

        String primeiroNome = "Esta é";
        String segundoNome = " uma String concatenada.";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);

        resultado = resultado + 1;
        System.out.println(resultado);

        resultado++;
        System.out.println(resultado);

        System.out.println(resultado++);
        System.out.println(++resultado);
        System.out.println(resultado--);
        System.out.println(resultado);
    }
}
