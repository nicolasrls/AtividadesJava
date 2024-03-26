package Lista02;
public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void aumentarPreco(double aumento) {
        preco += preco * aumento / 100;
    }

    public void diminuirPreco(double reducao) {
        preco -= preco * reducao / 100;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

}
