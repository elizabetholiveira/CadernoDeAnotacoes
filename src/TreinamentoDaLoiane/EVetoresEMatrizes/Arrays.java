package TreinamentoDaLoiane.EVetoresEMatrizes;

//#Arrays
//
//        - Estrutura de dados mais simples, existente na maioria das linguagens de programação
//        - Lista ordenada de dados

public class Arrays {

    public static void main(String[] args) {

        double tempDia001 = 31.3;
        double tempDia002 = 32;

        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;

        System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[0]);

        System.out.println("O tamanho do array: " + temperaturas.length);

        System.out.println("Valores do array: ");

//        for (int i = 0; i < temperaturas.length; i++) {
//            System.out.println("Dia: " + (i + 1) + " temperatura: " + temperaturas[i]);
//        }
//
        for (double temp : temperaturas) {
            System.out.println(temp);
        }

    }

}
