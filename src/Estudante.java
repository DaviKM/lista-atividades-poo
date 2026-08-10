import java.util.ArrayList;
import java.util.Scanner;

public class Estudante {
        private String nome;
        private double[] notas;

        public Estudante(String nome) {
            this.nome = nome;
            this.notas = new double[5];
        }

        public void insereNotas(){
            Scanner sc = new Scanner(System.in);
            for(int i = 0; i<this.notas.length; i++){
                System.out.printf("Insira a %dª nota:\t", i + 1);
                this.notas[i] = sc.nextDouble();
            }
        }

        public double calculaMedia(){
            double total = 0;
            for (double nota : this.notas) {
                total = total + nota;
            }
            return total/this.notas.length;
        }

        public double menorNota(){
            double menor = this.notas[0];
            for (double nota : this.notas) {
                if (nota < menor){
                    menor = nota;
                }
            }
            return menor;
        }
    public double[] getNotas() {
        return notas;
    }

    public String getNome() {
        return nome;
    }
}
