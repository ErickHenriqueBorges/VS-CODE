package exercicio002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
	Scanner ler=new Scanner(System.in);
	Vaga vagas[]= new Vaga[15];
	System.out.println("informe a quantidade de alunos que deseja cadastrar");
	int nAlunos=ler.nextInt(); 
	for(int i=0;i<nAlunos;i++){
        if (i >= 15) {
                    System.out.println("Limite de vagas atingido!");
                    break;
        }
            
        else{
                System.out.println("Cadastro do Aluno " + (i + 1));
                System.out.print("Nome: ");
                String nome = ler.nextLine();
                System.out.print("Curso: ");
                String curso = ler.nextLine();
                System.out.print("Placa do Carro: ");
                String placa = ler.nextLine();
                System.out.println("informe o numero da vaga que o aluno deseja ocupar");
                int nVaga=ler.nextInt();
                while(vagas[nVaga].verificarVaga()){
                System.out.print("Vaga ocupada");
                System.out.print(" iforme outra vaga");
                nVaga=ler.nextInt();	
            }

            

                Aluno aluno = new Aluno(nome, curso, placa);
                vagas[nVaga].ocuparVaga(aluno);
                
                System.out.println("Vaga " + (i + 1) + " ocupada com sucesso!\n");
        }
	
	
	
    }
    ler.close();



}

    
}
