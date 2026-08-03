//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estudante e = new Estudante("Davi");
        e.insereNotas();
        System.out.println(e.calculaMedia());
        System.out.println(e.menorNota());

    }
}