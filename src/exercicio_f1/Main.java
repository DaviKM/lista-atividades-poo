package exercicio_f1;

public class Main {
    public static void main(String[] args) {
        // Declaração das variaveis/objetos
        Patrocinador[] patrocinadores = new Patrocinador[3];
        Equipe equipe;
        Piloto piloto;
        Carro carro;

        // Inicialização dos objetos
        patrocinadores[0] = new Patrocinador("Shell", 3000000);
        patrocinadores[1] = new Patrocinador("Shoppee", 500000);
        patrocinadores[2] = new Patrocinador("Santander", 2500000);

        equipe = new Equipe("Grêmio FBPA", 1903, patrocinadores);
        piloto = new Piloto("Max Verstappen", 26, "Brasileño", 67);
        carro = new Carro(equipe, 25, piloto, 1);

        // Printando tudo
        System.out.printf("--- Carro ---\nPiloto: %s\nEquipe: %s\nNúmero: %d\nPosição: %d\n", carro.getPiloto().getNome(), carro.getEquipe().getNome(), carro.getNumero(), carro.getPosicao());

        System.out.printf("\n--- Piloto ---\nNome: %s\nIdade: %d\nNacionalidade: %s\n", carro.getPiloto().getNome(), carro.getPiloto().getIdade(), carro.getPiloto().getNacionalidade());

        System.out.printf("\n--- Equipe ---\nNome: %s\nAno de fundação: %d\n", equipe.getNome(), equipe.getAno_fundacao());
        for (int i = 0; i < patrocinadores.length; i++) {
            System.out.printf("Patrocinador %d:\nNome: %s\nValor:%f\n", i + 1, equipe.getPatrocinadores()[i].getNome(), equipe.getPatrocinadores()[i].getValor());
        }

    }
}
