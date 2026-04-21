package exercicio11;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        System.out.print("informe o Usuario : ");
        String usuario=ler.nextLine();
        System.out.print("informe o CPF : ");
        String cpf = ler.nextLine();
        System.out.print("iforme o numero de registro : ");
        int numeroRegistro=ler.nextInt();
        ler.nextLine();
        System.out.print("informe o Escritor: ");
        String escritor=ler.nextLine();
        System.out.print("informe a tag do livro :");
        int tag=ler.nextInt();
        Pessoa cliente=new Pessoa(usuario, cpf, numeroRegistro);
        Livro livroEmprestado= new Livro(escritor, tag);
        ler.nextLine();
        System.out.print("informe a  data de hoje : ");
        String dataEmprestimo=ler.nextLine();
        Emprestimo emprestimoFeito=new Emprestimo(cliente, livroEmprestado, dataEmprestimo);
        emprestimoFeito.getEmprestimo();
        

        
    }
    
}
