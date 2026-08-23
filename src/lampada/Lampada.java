package lampada;

public class Lampada {
    private boolean estado;
    private float potencia ;

    public Lampada(boolean estado) {
        this.estado = estado;
        potencia = 60 ;
    }

    public Lampada(boolean estado, float potencia){
        this.estado = estado;
        this.potencia = potencia ;
    }

    public void estadoAtual(){
        if (estado){
            System.out.println("A lâmpada está ligada") ;
        }
        else {
            System.out.println("A lâmpada está desligada");
        }
    }

    public void interruptor() {
        if (estado){
            estado = false ;
            System.out.println("Você desligou a lâmpada");
        }
        else{
            estado = true ;
            System.out.println("Você ligou a lâmpada");
        }
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setPotencia(float potencia){
        if (potencia >= 1 && potencia <= 1000){
            this.potencia = potencia ;
        }
    }

    public float getPotencia(){
        return potencia ;
    }
}
