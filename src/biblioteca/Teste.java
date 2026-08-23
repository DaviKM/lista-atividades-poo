package biblioteca;

public class Teste {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis");
        Livro livro2 = new Livro("Harry Potter", false);
        Periodico periodico1 = new Periodico("Revista Científica", 5);

        System.out.println("Livro 1: " + livro1.getTitulo() + ", Disponível: " + livro1.isDisponivel());
        System.out.println("Livro 2: " + livro2.getTitulo() + ", Disponível: " + livro2.isDisponivel());
        System.out.println("Periódico 1: " + periodico1.getTitulo() + ", Volume: " + periodico1.getN_volume());

        // Alterando a disponibilidade do livro 2
        livro2.switchDisponivel();
        System.out.println("Livro 2 após alteração de disponibilidade: " + livro2.getTitulo() + ", Disponível: " + livro2.isDisponivel());
    }
}
