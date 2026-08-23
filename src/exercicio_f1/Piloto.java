package exercicio_f1;

public class Piloto extends Pessoa {
    private int nVitorias ;

    public Piloto(String nome, int idade, String nacionalidade, int nVitorias) {
        super(nome, idade, nacionalidade);
        this.nVitorias = nVitorias ;

    }
}
