package exercicio13;

public class Triangulo extends FiguraGeometrica {

    public Triangulo(float altura, float base) {
        super(altura, base);
    } 

    @Override
    public double calcularArea() {
        return (getAlturaRaio() * getBaseLargura()) / 2;
    }
}