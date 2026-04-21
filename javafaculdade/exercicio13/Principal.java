package exercicio13;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        System.out.println("Informe qual figura Geometrica voce deseja calcular a area : 1-Circulo 2-Quadrado 3-Retangulo 4-Tringulo ");
        int opcao=ler.nextInt();

        switch (opcao) {
            case 1: {
                System.out.println("Informe o raio do Circulo : ");
                float raio=ler.nextFloat();
                Circulo circulo=new Circulo(raio);
                System.out.println("Area do circulo : "+circulo.calcularArea());
                break;}  
            case 2:{
                System.out.print("Informe o valor do lado do Quadrado : ");
                float lado=ler.nextFloat();
                Quadrado quadrado=new Quadrado(lado);
                System.out.println("Valor da area do quadrado :"+quadrado.calcularArea());
                break;}
            case 3:{
                System.out.print("Informe o valor do altura do retangulo : ");
                float altura=ler.nextFloat();
                System.out.print("Informe o valor a largura do retangulo : ");
                float largura=ler.nextFloat();
                Retangulo retangulo=new Retangulo(altura,largura);
                System.out.println("Valor da area do Retangulo : "+retangulo.calcularArea());
                break;}
            case 4:{
                System.out.print("Informe o valor do altura do triangulo : ");
                float altura=ler.nextFloat();
                System.out.print("Informe o valor a  vase do triangulo : ");
                float base=ler.nextFloat();
                Triangulo triangulo=new Triangulo(altura, base);
                System.out.println("Valor da area do Retangulo : "+triangulo.calcularArea());
                break;}
                
            default:
                throw new AssertionError();
        }

        
    }
    
}
