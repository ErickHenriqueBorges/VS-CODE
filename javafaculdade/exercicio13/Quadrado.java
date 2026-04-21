package exercicio13;

public class Quadrado extends FiguraGeometrica {

    public Quadrado(float lado) {
        super(lado, lado);
    }

    @Override
    public double calcularArea() {
        float l = getAlturaRaio();
        return Math.pow(l, 2);
    }
}