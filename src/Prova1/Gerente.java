package Prova1;
import java.util.*;

public class Gerente extends Funcionario{
	
	private String Departamento;

	public String getDepartamento() {
		return Departamento;
	}

	public Gerente(String nome, double salario, String departamento) {
		super(nome, salario);
		this.Departamento = departamento;
	}
}

