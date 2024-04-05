package Prova1;
import java.util.*;

public class Funcionario {

	private String Nome;
	private double Salario;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario = salario;
	}
	
	public Funcionario(String nome, double salario) {
        this.Nome = nome;
        this.Salario = salario;
    }
		
}
