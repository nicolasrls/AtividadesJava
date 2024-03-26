package Lista02;
public class SistemaBiblioteca {

    public static void main(String[] args) {

        Livro livro1 = new Livro(1, "A Revolução dos Bichos", "George Orwell", 1945);
        Livro livro2 = new Livro(2, "O Senhor dos Anéis", "J. R. R. Tolkien", 1954);
        Livro livro3 = new Livro(3, "1984", "George Orwell", 1949);


        Pessoa pessoa1 = new Pessoa("João", 25);
        Pessoa pessoa2 = new Pessoa("Maria", 30);


        pessoa1.emprestarLivro(livro1);
        pessoa2.emprestarLivro(livro2);
        pessoa1.emprestarLivro(livro3);


        pessoa1.devolverLivro(livro1);
//        pessoa2.devolverLivro(livro2);


        System.out.println("**Pessoa 1:**");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Livros emprestados:");
        for (Livro livro : pessoa1.getLivrosEmprestados().values()) {
            System.out.println(" - " + livro.getTitulo());
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("**Pessoa 2:**");
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade());
        System.out.println("Livros emprestados:");
        for (Livro livro : pessoa2.getLivrosEmprestados().values()) {
            System.out.println(" - " + livro.getTitulo());
        }
    }
}