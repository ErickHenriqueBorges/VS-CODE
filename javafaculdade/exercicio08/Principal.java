package exercicio08;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("iforme o Nome do aluno:");
        String nome=ler.nextLine();
        System.out.println("Informe o numero de matricula do aluno:");
        int nMatricula=ler.nextInt();
        System.out.println("informe as notas na seguinte ordem Prova1,Prova2,trabalho");
        float prova1=ler.nextFloat();
        float prova2=ler.nextFloat();
        float trabalho=ler.nextFloat();
        Escola aluno=new Escola(nMatricula, nome, prova1, prova2, trabalho);
        aluno.media();
        aluno.notaFinal();
        ler.close();

        
    }
}
