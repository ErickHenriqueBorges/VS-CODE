package Exercicio2;

public class Retangulo {
    private double altura;
    private double largura;

    //  método para dar valor às variáveis da classe
    public void setValores(double altura, double largura) {
        this.altura = altura; 
        this.largura = largura;}

    public double calcularArea() {
        return this.altura * this.largura;}

    public double calcularPerimetro() {
        return (this.altura + this.largura) * 2;}

    public void exibirInfo() {
        
        System.out.println("Area = " + calcularArea());
        System.out.println("Perimetro = " + calcularPerimetro());}
}