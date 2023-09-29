import jogo.armas.Arma;

public class Programa {
    public static void main(String[] args) {
        Arma a = new Arma();
        a.setNome("AK47");
        a.setBarulhinho("RATATA");
        a.setCapacidade(30000);
        a.setQtde(5);
        a.setCapacidade(3);

        Funcoes.descarregarArma(a);

    }
}
