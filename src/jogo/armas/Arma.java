package jogo.armas;

/**
 * Esta classe representa uma arma do jogo.
 * O nome se refere ao nome da arma.
 * A capacidade se refere a quanta munição ela pode ter no máximo.
 * A qtde se refere a quantidade de munição restante.
 * O barulhinho se refere ao som que a arma faz ao disparar tendo munição.
 */
public class Arma {
    private String nome;
    private int capacidade;
    private int qtde;
    private String barulhinho;
    private int dano;

    public Arma() {
    }

    public Arma(String nome, int capacidade, int qtde, String barulhinho, int dano) {
        if (nome == null || barulhinho == null) {
            throw new NullPointerException("Tem que informar o nome e o barulhinho");
        }
        this.nome = nome;
        if (capacidade <= 0) {
            throw new IllegalArgumentException("AAAAIII! Torci meu tornozelo.");
        }
        this.capacidade = capacidade;
        this.qtde = qtde;
        this.barulhinho = barulhinho;
        this.dano = dano;
    }

    public boolean disparar() {
        if (qtde > 0) {
            qtde--;
            System.out.println(barulhinho);
            return true;
        } else {
            System.out.println("CLICK");
            return false;
        }
    }

    public void recarregar() {
        qtde = capacidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        if (capacidade >= 0) {
            this.capacidade = capacidade;
            this.qtde = 0;
        }
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        if (qtde <= capacidade && qtde >= 0) {
            this.qtde = qtde;
        }
    }

    public String getBarulhinho() {
        return barulhinho;
    }

    public void setBarulhinho(String barulhinho) {
        this.barulhinho = barulhinho;
    }

    public int getDano() {
        return dano;
    }
}
