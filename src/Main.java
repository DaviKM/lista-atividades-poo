public class Main {
    public static void main(String[] args) {
        Estudante[] e = new Estudante[3];
        for (Estudante estudante : e) {
            estudante = new Estudante("A");
            estudante.insereNotas();
        }
        System.out.println(Estudante.aprovados(e));
    }
}