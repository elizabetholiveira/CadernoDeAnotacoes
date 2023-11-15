package TreinamentoDaLoiane.DControlesDecisoesLoops;

public class LoopWhile {

    public static void main(String[] args) {

        int i = 1; //count ou cont
        int max = 10;

        System.out.println("Contando até " + max);

        while (i <= max){
            System.out.println("Valor de i: " + i);
            i++; //i = i + 1; ou i+= 1;
        }

        System.out.println(i);

        //Comando do-while: Esse comando executa o bloco dentro do comando "do" e depois avalia a expressão. O bloco
        //deixa de ser executado após a expressão ficar falsa.

        do {
            i++;
            System.out.println("Valor de i: " + i);
        } while (i < 15);

        System.out.println(i);

    }
}
