package Prova1;

public class Carro {
	private String modelo;
	private int ano;
	private double quilometragem;

	public Carro(String modelo, int ano) {
		this.modelo = modelo;
		this.ano = ano;
		this.quilometragem = 0.0;
	}
	public void adicionarQuilometragem(double distancia) {
		if (distancia >= 0) {
			this.quilometragem += distancia;
		}
	}
	public double obterQuilometragem() {
		return this.quilometragem;
	}
}
