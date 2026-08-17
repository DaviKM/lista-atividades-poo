public class Main {
    public static void main(String[] args) {
        Estudante[] e = new Estudante[3];
        for (int i = 0; i<e.length; i++) {
            e[i] = new Estudante("Aluno " + i);
            e[i].insereNotas();
        }
        System.out.println(Estudante.aprovados(e));
    }
}