package TreinamentoDaLoiane.CProgramacaoBasica.Operadores;

public class CurtoCircuito {

    public static void main(String[] args) {

        boolean verdadeiro = true;
        boolean falso = false;
        boolean resultado1 = falso &
                verdadeiro;
        boolean resultado2 = falso &&
                verdadeiro; //Quando vê que o primeiro é falso ele nem olha o segundo, porque && com falso é sempre falso
        System.out.println(resultado1);
        System.out.println(resultado2);
    }
}
