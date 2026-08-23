package lampada;

public class Main {
    public static void main(String[] args){
        Lampada l = new Lampada(true) ;
        l.estadoAtual();
        l.interruptor();
        l.estadoAtual();
        System.out.println(l.getPotencia());
        l.setPotencia(1001);
        System.out.println(l.getPotencia());
    }
}
