package POO.xx2.Livro;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;

        System.out.println("Nome do livro = " + livro.nome);

        //-----

        LivroLivraria livroLivraria = new LivroLivraria();
        livroLivraria.nome = "Livro da Amazon";
        livroLivraria.autor = "Sr. Exemplo";
        livroLivraria.anoLancamento = 2023;
        livroLivraria.preco = 63.39;

        System.out.println("Nome do livro = " + livroLivraria.nome);

        //-----

        LivroDeBiblioteca livroDeBiblioteca = new LivroDeBiblioteca();
        livroDeBiblioteca.emprestado = true;
        livroDeBiblioteca.dataEntrega = new Date();
        livroDeBiblioteca.emprestadoA = "Loiane";
    }
}
