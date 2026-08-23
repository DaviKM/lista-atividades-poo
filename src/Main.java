public class Main {
    public static void main(String[] args) {
        Estudante e = new Estudante("Aluno");
        double[] peso = {1, 1, 2, 3, 3};
        e.insereNotas();
        System.out.println(e.calculaMedia(peso));
    }
}