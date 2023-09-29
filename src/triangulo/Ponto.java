package triangulo;

public class Ponto {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean equals(Ponto p) {
        if (this.x != p.x || this.y != p.y) {
            return false;
        } else {
            return true;
        }
    }
}
