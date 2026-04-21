package exercicio13;

public class FiguraGeometrica {
    private float alturaRaio;
    private float baseLargura;

    public FiguraGeometrica(float alturaRaio, float baseLargura) {
        this.alturaRaio = alturaRaio;
        this.baseLargura = baseLargura;
    }

    
    public float getAlturaRaio() {
        return alturaRaio;
    }

    public float getBaseLargura() {
        return baseLargura;
    }

    public double calcularArea() {
        return this.baseLargura * this.alturaRaio;
    }
}