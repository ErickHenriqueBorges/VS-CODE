package exercicio13;

public class Circulo extends FiguraGeometrica {
   

    public Circulo(float raio){
        super(raio,0);
        
    }

    @Override
    public double calcularArea(){
        float raio= getAlturaRaio();
        double area=(Math.PI * (raio * raio));
        return area;
    }


    
}
