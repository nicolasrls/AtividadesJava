package Prova1;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro("Fiat Mobi", 2023);
		carro.adicionarQuilometragem(50.0);
		System.out.println("Quilometragem atual: " + carro.obterQuilometragem() + " km");
		carro.adicionarQuilometragem(10.3);
		System.out.println("Quilometragem atual: " + carro.obterQuilometragem() + " km");
	}
}
