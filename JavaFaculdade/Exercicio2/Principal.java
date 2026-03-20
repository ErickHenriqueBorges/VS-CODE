package Exercicio2;

public class Principal {
public static void main(String[] args) {
    Retangulo meuretangulo = new Retangulo(23, 2); 
    System.out.println(meuretangulo.calcularArea());
    System.out.println(meuretangulo.calcularPerimetro());
    System.out.println("altura = "+meuretangulo.getAltura());
    
}
}
