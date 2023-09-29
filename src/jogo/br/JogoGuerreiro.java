package jogo.br;

import jogo.armas.Arma;

import java.util.Scanner;

public class JogoGuerreiro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Capacidade: ");
        int c = s.nextInt();

        try {
            Arma arma1 = new Arma(
                    null, c, 8, "BANG", 1
            );
            Arma arma2 = new Arma(
                    "Rifle", c, 2, "BANG MAIS ALTO!", 1
            );
            Arma arma3 = new Arma(
                    "Bazuca", c, 2, "KABUM!", 1
            );

            Guerreiro a = new Guerreiro();
            a.setNome("Leonardo");
            a.setVida(15);
            a.setArma(arma1);

            Guerreiro b = new Guerreiro();
            b.setNome("Davi");
            b.setVida(23);
            b.setArma(arma3);

            while (true) {
                System.out.println(a.getNome() + " ataca " + b.getNome());
                int pv = a.atacar(b);
                System.out.println(b.getNome() + " perde " + pv + " pontos de vida e fica com " + b.getVida() + " pontos de vida.");
                if (b.getVida() == 0) {
                    break;
                }
                if (pv == 0) {
                    a.recarregarArma();
                    System.out.println(a.getNome() + " recarregou a arma " + a.getArma().getNome() + " com municao = " + a.getArma().getQtde());
                }

                System.out.println(b.getNome() + " ataca " + a.getNome());
                pv = b.atacar(a);
                System.out.println(a.getNome() + " perde " + pv + " pontos de vida e fica com " + a.getVida() + " pontos de vida.");
                if (a.getVida() == 0) {
                    break;
                }
                if (pv == 0) {
                    b.recarregarArma();
                    System.out.println(b.getNome() + " recarregou a arma " + b.getArma().getNome() + " com municao = " + b.getArma().getQtde());
                }
            }

            if (a.getVida() > 0) {
                System.out.println(a.getNome() + " venceu");
            } else {
                System.out.println(b.getNome() + " venceu");
            }
        } catch (IllegalArgumentException | NullPointerException e) {
            System.out.println("Capacidade Invalida. Exceção capturada.");
            System.out.println(e.getMessage());
        }
    }
}
