package exercicio03;
import java.util.Scanner;

public class Primaria {
     public static void main(String[] args){
         
     Scanner ler= new Scanner(System.in);
     System.out.println("iforme seu nome :");
     String nome=ler.nextLine();
     System.out.println("iforme sua idade:");
     int idade=ler.nextInt();
     Pessoa identidade=new Pessoa(nome,idade);
     identidade.getdados();
     identidade.verificador();
     ler.close();
     
     }

    
        
}
