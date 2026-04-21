package exercicio13;

public class Retangulo extends FiguraGeometrica {
    
    public Retangulo( float altura,float largura) {
        super(altura, largura);
    }
    
    @Override
    public double calcularArea() {
        return getBaseLargura() * getAlturaRaio();
    }
}