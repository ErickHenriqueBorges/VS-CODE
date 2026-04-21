package exercicio10;
import java.util.Scanner;

public class Primaria {
    public static void main(String[] args) {
    Scanner ler= new Scanner(System.in);  
    System.out.print("informe o valor que deseja investir todo mes:");
    float investimentoMensal= ler.nextFloat();
    System.out.print("informe o valor do juros que sera aplicado:");
    float juros=ler.nextFloat();
    Sistema retorno= new Sistema(investimentoMensal,juros);
    String opcao;
     do {
            retorno.resultado(); 
            retorno.getSaldo(); 
            System.out.print("Deseja processar mais um ano? (S/N): ");
            opcao = ler.next();// usado para ler caracter pq nao pega o \n 
            
        } while (opcao.equalsIgnoreCase("s"));// faz a verificaçao de S s
        
        System.out.println("Programa encerrado.");
        ler.close();

    }
}
