import jogo.armas.Arma;

public class Funcoes {
    public static void descarregarArma(Arma arma) {
        while (arma.disparar()) ;
    }
}
