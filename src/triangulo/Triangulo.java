package triangulo;

public class Triangulo {
    private Ponto a;
    private Ponto b;
    private Ponto c;

    public Triangulo(Ponto a, Ponto b, Ponto c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double ladoAB() {
        double d = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
        return d;
    }

    public double ladoAC() {
        double d = Math.sqrt(Math.pow(a.getX() - c.getX(), 2) + Math.pow(a.getY() - c.getY(), 2));
        return d;
    }

    public double ladoBC() {
        double d = Math.sqrt(Math.pow(b.getX() - c.getX(), 2) + Math.pow(b.getY() - c.getY(), 2));
        return d;
    }

    public int tipoTriangulo() {
        double ab = this.ladoAB();
        double ac = this.ladoAC();
        double bc = this.ladoBC();

        if (ab == ac && ab == bc) {
            return 1;
        }
        if (ab == ac || ab == bc || ac == bc) {
            return 2;
        }
        return 3;
    }

    public Ponto getA() {
        return a;
    }

    public Ponto getB() {
        return b;
    }

    public Ponto getC() {
        return c;
    }
}
