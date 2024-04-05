package Prova1;

public class Empresa{
	public static void main(String[] args) {
		Estagiario estagiario = new Estagiario("Ana Costa", 1500.0, 500.0);
        System.out.println("Estagiário: " + estagiario.getNome() + " - Salário Base: R$" + estagiario.getSalario() + " - Bônus Aprendizado: R$" + estagiario.getBonusAprendizado() + " - Salário Total: R$" + estagiario.calcularSalarioTotal());
	}
}
