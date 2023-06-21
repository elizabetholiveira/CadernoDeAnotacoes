package POO.xx1;

//Aula 24 do curso de POO em Java da Loiane Groner no YouTube

public class Main {

    public static void main(String[] args) { //Não esquecer de colocar o psvm, ele não funciona o new Carro sem isso

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van); //mostra a locação de memória
        System.out.println(van.marca);
        System.out.println(van.modelo);

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 30;
        fusca.consumoCombustivel = 0.15;
    }
}
