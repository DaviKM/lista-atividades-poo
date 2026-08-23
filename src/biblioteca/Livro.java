package biblioteca;

public class Livro extends Publicacao {
    private boolean disponivel;

    public Livro(String titulo){
        super(titulo);
        this.disponivel = true;
    }
    public Livro(String titulo, boolean disponivel){
        super(titulo);
        this.disponivel = disponivel;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void switchDisponivel(){
        disponivel = !disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
