package exercicio07;

import java.util.Scanner;

public class Primaira {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("--- Sistema de Cadastro de Veículos ---");
        System.out.println("Digite (1) para Carro ou (2) para Moto:");
        int opcao = ler.nextInt();
        ler.nextLine(); // Limpa o buffer (boa prática que o Guanabara sempre ensina!)

        System.out.print("Marca: ");
        String marca = ler.nextLine();

        System.out.print("Ano: ");
        int ano = ler.nextInt();

        System.out.print("Preço: ");
        float preco = ler.nextFloat();
        ler.nextLine(); // Limpa o buffer novamente

        if (opcao == 1) {
            System.out.print("Quantidade de portas: ");
            int nportas = ler.nextInt();
            
            
            Carros meuCarro = new Carros(marca,preco,ano,nportas);
            System.out.println("\n--- Dados do Carro Cadastrado ---");
            meuCarro.exibirInfo();

        } else if (opcao == 2) {
            System.out.print("Modelo do Guidão: ");
            String guidon = ler.nextLine();

           
            Moto minhaMoto = new Moto(ano, preco, marca, guidon);
            System.out.println("\n--- Dados da Moto Cadastrada ---");
            minhaMoto.exibirInfo();
            
        } else {
            System.out.println("Opção inválida!");
        }

        ler.close();
    }
}