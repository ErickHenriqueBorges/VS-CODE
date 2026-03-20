package exerciciodefixar.ex002;
import java.util.Scanner;

public class Primaria {
    public static void main(String[] args) {
        Scanner ler= new Scanner(System.in);
        System.out.println("iforme qual porduto: ");
        String produto= ler.nextLine();
        System.out.println("iforme qual quantidade: ");
        int quantidade= ler.nextInt();
        System.out.println("iforme o preço: ");
        Double preco= ler.nextDouble();
        Produtos compra=new Produtos(produto, preco, quantidade);
        compra.calcularValortotal();
        compra.getinfo();
        ler.close();
    }
}
