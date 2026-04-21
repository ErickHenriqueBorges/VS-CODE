package exercicio09;
import java.util.Scanner;

public class Primaria {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        System.out.print("informe o nome do produto: ");
        String nome=ler.nextLine();
        System.out.print("iforme a quantidade do produto: ");
        int quantidade= ler.nextInt();
        System.out.print("informe o valor do  produto: ");
        float preco=ler.nextFloat();
        SistemaMercado produto= new SistemaMercado(nome, preco, quantidade);
        System.out.println("preço final = "+produto.calcularTotal());
        ler.close();
    }
    
}
