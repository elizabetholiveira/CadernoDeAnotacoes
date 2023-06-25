package TreinamentoDaLoiane.CProgramacaoBasica.TiposPrimitivos;

public class VariaveisChar {

    public static void main(String[] args) {

        char o = 'o';
        char i = 'i';

        System.out.println(o + i);
        System.out.println(o);
        System.out.println(i);
        System.out.println("" + o + i);

        char oi = 111;
        char io = 105;
        char interrogacao = 0x00E1; //Confirmar depois qual é a interrogação atual, porque tá dando diferente do da Loiane

        System.out.println(oi + io + interrogacao);
        System.out.println(oi);
        System.out.println(io);
        System.out.println("" + oi + io + interrogacao);

        //char oie = '111';  <--- Não permite

    }
}
