package exercicio16;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner ler=new Scanner(System.in);
        int opcao;
        do{System.out.println("informe qual veiculo deseja cadastrar: 1-Onibus 2-Caminhao ");
        opcao=ler.nextInt();}while(opcao!=1 && opcao !=2);
        if (opcao==1){
            System.out.println("qual o ano do Onibus :");
            int ano=ler.nextInt();
            ler.nextLine();
            System.out.println("Qual a placa do Onibus : ");
            String placa=ler.nextLine();
            System.out.println("Qual a quantidade de assentos : ");
            int assentos=ler.nextInt();
            Onibus onibusX=new Onibus(assentos, placa, ano);
            onibusX.exibirDados();

        }
        else{
            System.out.println("Qual o ano do Caminhao : ");
            int ano=ler.nextInt();
            ler.nextLine();
            System.out.println("Qual a placa do Caminhao : ");
            String placa=ler.nextLine();
            System.out.println("Qual a quantidade de Eixos : ");
            int eixos=ler.nextInt();
            Caminhao caminhaoX=new Caminhao(eixos, placa, ano);
            caminhaoX.exibirDados();
        }

    ler.close();
    }
}
