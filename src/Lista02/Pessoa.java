package Lista02;
import java.util.HashMap;
import java.util.Map;

public class Pessoa {

    private String nome;
    private int idade;
    private Map<Integer, Livro> livrosEmprestados = new HashMap<>();

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emprestarLivro(Livro livro) {
        if (!livro.isEmprestado()) {
            livrosEmprestados.put(livro.getID(), livro);
            livro.emprestar();
        }
    }

    public void devolverLivro(Livro livro) {
        if (livrosEmprestados.containsKey(livro.getID())) {
            livrosEmprestados.remove(livro.getID());
            livro.devolver();
        }
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Map<Integer, Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

}
