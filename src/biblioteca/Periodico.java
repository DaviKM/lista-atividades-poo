package biblioteca;

public class Periodico extends Publicacao {
    private int n_volume;

    public Periodico(String titulo, int n_volume){
        super(titulo);
        this.n_volume = n_volume;
    }

    public int getN_volume() {
        return n_volume;
    }

    public void setN_volume(int n_volume) {
        this.n_volume = n_volume;
    }
}
