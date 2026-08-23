package exercicio_f1;

public class Equipe {
    private String nome;
    private int ano_fundacao;
    private Patrocinador[] patrocinadores;

    public Equipe(String nome, int ano_fundacao, Patrocinador[] patrocinadores) {
        this.nome = nome;
        this.ano_fundacao = ano_fundacao;
        this.patrocinadores = patrocinadores;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAno_fundacao(int ano_fundacao) {
        this.ano_fundacao = ano_fundacao;
    }

    public void setPatrocinadores(Patrocinador[] patrocinadores) {
        this.patrocinadores = patrocinadores;
    }

    public String getNome() {
        return nome;
    }

    public int getAno_fundacao() {
        return ano_fundacao;
    }

    public Patrocinador[] getPatrocinadores() {
        return patrocinadores;
    }
}
