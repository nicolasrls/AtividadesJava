package Lista02;
public class TestaProduto{

    public static void main(String[] args) {
        // Criação de uma instância da classe Produto
        Produto produto = new Produto("Camisa", 50.0);

        // Aumento do preço em 10%
        produto.aumentarPreco(10.0);

        // Diminuição do preço em 5%
        produto.diminuirPreco(5.0);

        // Exibição do preço final do produto
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço final: R$ " + String.format("%.2f", produto.getPreco()));
    }

}
