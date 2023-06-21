package POO.xx1;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel; //capacidade do tanque de combustível
    double consumoCombustivel; //consumo de combustível por km

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
    };
}
