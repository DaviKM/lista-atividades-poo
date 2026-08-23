package exercicio_f1;

public class Engenheiro extends Pessoa {
    private Piloto piloto ;

    public Engenheiro(String nome, int idade, String nacionalidade, Piloto piloto){
        super(nome, idade, nacionalidade) ;
        this.piloto = piloto ;
    }
}
