package exercicio15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("\n--- MENU DE FIGURAS GEOMÉTRICAS ---");
            System.out.println("1. Criar Retângulo");
            System.out.println("2. Criar Triângulo");
            System.out.println("3. Criar Círculo");
            System.out.println("4. Criar Quadrado");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = leitor.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite a cor da figura: ");
                String cor = leitor.next();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o lado 1: ");
                        double l1 = leitor.nextDouble();
                        System.out.print("Digite o lado 2: ");
                        double l2 = leitor.nextDouble();
                        Retangulo ret = new Retangulo(l1, l2, cor);
                        System.out.println(ret.toString());
                        System.out.println("Área: " + ret.area());
                        break;

                    case 2:
                        System.out.print("Digite a base: ");
                        double base = leitor.nextDouble();
                        System.out.print("Digite a altura: ");
                        double altura = leitor.nextDouble();
                        Triangulo tri = new Triangulo(base, altura, cor);
                        System.out.println(tri.toString());
                        System.out.println("Área: " + tri.area());
                        break;

                    case 3:
                        System.out.print("Digite o raio: ");
                        double raio = leitor.nextDouble();
                        Circulo circ = new Circulo(raio, cor);
                        System.out.println(circ.toString());
                        System.out.println("Área: " + circ.area());
                        System.out.println("Diâmetro: " + circ.getDiametro());
                        break;

                    case 4:
                        System.out.print("Digite o lado do quadrado: ");
                        double ladoQ = leitor.nextDouble();
                        Quadrado quad = new Quadrado(ladoQ, cor);
                        System.out.println(quad.toString());
                        System.out.println("Área: " + quad.area());
                        break;
                }
            } else if (opcao != 5) {
                System.out.println("Opção inválida!");
            }
        }

        System.out.println("Programa encerrado.");
        leitor.close();
    }
}