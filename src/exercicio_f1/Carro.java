package exercicio_f1;

public class Carro {
    private int numero, posicao;
    private Equipe equipe;
    private Piloto piloto;
    private Engenheiro engenheiro;

    public Carro(Equipe equipe, int numero) {
        this.numero = numero;
        this.equipe = equipe;
    }

    public Carro(Equipe equipe, int numero, Piloto piloto, int posicao) {
        this.equipe = equipe;
        this.numero = numero;
        this.piloto = piloto;
        this.posicao = posicao;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public int getNumero() {
        return numero;
    }

    public int getPosicao() {
        return posicao;
    }

    public Piloto getPiloto() {
        return piloto;
    }

}
