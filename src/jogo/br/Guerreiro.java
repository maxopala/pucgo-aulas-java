package jogo.br;

import jogo.armas.Arma;

public class Guerreiro {
    private String nome;
    private int vida;
    private Arma arma;

    /**
     * Esse método utiliza a arma deste objeto para atacat o alvo.
     * Caso este objeto {@link Guerreiro} não tenha {@link Arma}, então não causa dano ao alvo.
     * Caso este objeto tenha uma arma mas ela esteja sem munição, também
     * não causa dano ao alvo.
     * Caso a arma tenha munição, o disparo acontece e o alvo terá 5 pontos de vida reduzidos.
     * O método retornará a quanrtidade de pontos de vida retirados do alvo.
     *
     * @return A quantidade de pontos de vida removidos do alvo
     */
    public int atacar(Guerreiro alvo) {
        if (arma == null) {
            return 0;
        }

        if (!arma.disparar()) {
            return 0;
        }

        if (alvo.vida < arma.getDano()) {
            alvo.vida = 0;
        } else {
            alvo.vida -= arma.getDano();
        }

        return 5;
    }

    public boolean recarregarArma() {
        if (arma == null) {
            return false;
        } else {
            arma.recarregar();
            return true;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}
