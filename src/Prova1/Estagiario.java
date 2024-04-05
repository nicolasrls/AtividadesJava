package Prova1;

public class Estagiario extends Funcionario {

    private double bonusAprendizado;

    public Estagiario(String nome, double salario, double bonusAprendizado) {
        super(nome, salario);
        this.bonusAprendizado = bonusAprendizado;
    }

    public double getBonusAprendizado() {
        return bonusAprendizado;
    }

    public double calcularSalarioTotal() {
        return this.getSalario() + bonusAprendizado;
    }
}

