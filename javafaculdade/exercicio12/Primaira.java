package exercicio12;
import java.util.Scanner;

public class Primaira {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("--- DADOS DO PAI ---");
        System.out.print("Nome do Pai: ");
        String nPai = ler.nextLine();
        System.out.print("Idade do Pai: ");
        int iPai = ler.nextInt();
        ler.nextLine(); // Limpa o buffer
        Pessoa pai = new Pessoa(nPai, iPai, null, null);

        System.out.println("\n--- DADOS DA MÃE ---");
        System.out.print("Nome da Mãe: ");
        String nMae = ler.nextLine();
        System.out.print("Idade da Mãe: ");
        int iMae = ler.nextInt();
        ler.nextLine(); 
        Pessoa mae = new Pessoa(nMae, iMae, null, null);

        System.out.println("\n--- SEU CADASTRO ---");
        System.out.print("Seu Nome: ");
        String seuNome = ler.nextLine();
        System.out.print("Sua Idade: ");
        int suaIdade = ler.nextInt();
        ler.nextLine(); 
        Pessoa eu = new Pessoa(seuNome, suaIdade, pai, mae);


        System.out.println("\n=========================");
        System.out.println("ÁRVORE GENEALÓGICA:");
        eu.exibirArvore();
    }
}