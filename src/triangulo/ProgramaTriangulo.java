package triangulo;

public class ProgramaTriangulo {
    public static void main(String[] args) {
        Ponto a = new Ponto();
        a.setX(0);
        a.setY(0);

        Ponto b = new Ponto();
        b.setX(0);
        b.setY(4);

        Ponto c = new Ponto();
        c.setX(4);
        c.setY(0);

        Triangulo t = new Triangulo(a, b, c);

        System.out.println("Lado A/B: " + t.ladoAB());
        System.out.println("Lado A/C: " + t.ladoAC());
        System.out.println("Lado B/C: " + t.ladoBC());
        System.out.println("Tipo Triangulo: " + t.tipoTriangulo());
    }
}
