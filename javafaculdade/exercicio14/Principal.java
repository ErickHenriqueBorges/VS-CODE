package exercicio14;
import java.util.Scanner;

public interface Principal {
    public static void main(String[] args){
        Scanner ler= new Scanner(System.in);
        System.out.println("Informe quanto tempo e cliente do banco erick em anos");
        int tempo=ler.nextInt();
        if( tempo>=10){
            ContaCorrenteEspecial contaEspecial=new ContaCorrenteEspecial();
            System.out.println("1- Saque 2-deposito :");
            int opcao=ler.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Informe o valor que deseja sacar : ");
                    float valorSaque=ler.nextFloat();
                    contaEspecial.sacar(valorSaque);
                    System.out.println("Valor atual do saldo : "+contaEspecial.getSaldo());
                    
                    break;
                case 2:
                    System.out.println("Informe o valor que deseja depositar : ");
                    float valorDeposito=ler.nextFloat();
                    contaEspecial.depositar(valorDeposito);
                    System.out.println("Valor atual do saldo : "+contaEspecial.getSaldo());
                            
                    break;
                default:
                    throw new AssertionError();
            }
           
        }
        else {
            ContaCorrente contaNormal=new ContaCorrente();
            System.out.println("1- Saque 2-deposito :");
            int opcao=ler.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Informe o valor que deseja sacar : ");
                    float valorSaque=ler.nextFloat();
                    contaNormal.sacar(valorSaque);
                    System.out.println("Valor atual do saldo : "+contaNormal.getSaldo());
                    
                    break;
                case 2:
                    System.out.println("Informe o valor que deseja depositar : ");
                    float valorDeposito=ler.nextFloat();
                    contaNormal.depositar(valorDeposito);
                    System.out.println("Valor atual do saldo : "+contaNormal.getSaldo());
                            
                     break;
                default:
                    throw new AssertionError();
            }
        }
        ler.close();
    }
    
}
