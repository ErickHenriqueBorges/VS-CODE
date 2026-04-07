package exercicio05;

public class Retangulo {
    private double altura;
    private double largura;

    //  método para construtor às variáveis da classe
    public Retangulo(double altura, double largura) {
        this.altura = altura; 
        this.largura = largura;}

    public double calcularArea() {
        return this.altura * this.largura;}

    public double calcularPerimetro() {
        return (this.altura + this.largura) * 2;}
    public double getAltura(){
        return this.altura;
    }

}