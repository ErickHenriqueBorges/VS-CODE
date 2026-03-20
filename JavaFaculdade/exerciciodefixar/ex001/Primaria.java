package exerciciodefixar.ex001;
import java.util.Scanner;

public class Primaria {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o nome do titular: ");
        String nome = ler.nextLine();
        System.out.print("Digite o saldo inicial: ");
        double valor = ler.nextDouble();

        ContaBancaria conta = new ContaBancaria(nome, valor);

        int opcao = 0;

        
        while (opcao != 4) {// Loop para o menu não fechar sozinho
            System.out.println("\nInforme a opção que deseja utilizar:");
            System.out.println("1 = Sacar | 2 = Depositar | 3 = Ver Saldo | 4 = Finalizar");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor para sacar: ");
                    double valorsaque = ler.nextDouble();
                    conta.sacar(valorsaque);
                    break;
                case 2:
                    System.out.print("Valor para depósito: ");
                    double valordeposito = ler.nextDouble();
                    conta.depositar(valordeposito);
                    break;
                case 3:
                    conta.getsaldo();
                    break;
                case 4:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        ler.nextLine();// limpando buffer;
        ler.close();// fechameto da funçao de leitura;
    }
}