package Prova1;
import java.util.*;

public class Desenvolvedor extends Funcionario{
	
	private String Linguagem;

	public String getLinguagem() {
		return Linguagem;
	}

	public Desenvolvedor(String nome, double salario, String linguagem) {
		super(nome, salario);
		this.Linguagem = linguagem;
	}	
}
