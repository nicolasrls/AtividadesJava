package Lista02;
public class TestaVeiculo {
    public static void main(String[] args) {

        VeiculoMoto moto = new VeiculoMoto();
        moto.ligar();
        moto.colocarCapacete();
        moto.ligar();
        moto.acelerar();
        moto.frear();
        moto.desligar();

        System.out.println("-------------------------------------------------------------");

        VeiculoCarro carro = new VeiculoCarro();
        carro.abrirPortas();
        carro.ligar();
        carro.fecharPortas();
        carro.ligar();
        carro.acelerar();
        carro.frear();
        carro.desligar();

    }
}
