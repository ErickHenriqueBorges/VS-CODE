package exercicio15;

public class Circulo extends Figura{
    private double raio;
    
    public Circulo(Double raio,String cor){
        super(cor);
        this.raio=raio;
    }
    public void setRaio(double raio){
        this.raio=raio;
    }
    public double getRaio(){
        return this.raio;
    }
    public double area(){
        return Math.PI * Math.pow(this.raio, 2);
    }
    public double getDiametro(){
        return this.raio*2;
    }
    public String  toString(){
        return "Sucesso";
    }

    
}
