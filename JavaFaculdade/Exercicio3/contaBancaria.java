package Exercicio3;

public class contaBancaria {
    private String titular="Erick";
    private Double saldo=0.0;
    
    public void verificar(String usuario){
        if ( usuario.equals(this.titular)){// equals e para comparar strings;
            System.out.println("seja bem vindo!");
        }
        else{
            System.out.println("Acesso negado: titular desconhecido.");
        }
    }
    public double depositar(double valor){
        this.saldo+=valor;
        return this.saldo;
        
    }

    public double sacar(double valor){
        if(saldo>=valor){
            this.saldo-=valor;
            System.out.println("Saque efetuado com Sucesso");
            System.out.println("Valor do saque ="+valor);
            System.out.println("Saldo atual ="+this.saldo);
            return this.saldo;
        }
        else{
            System.out.println("Saldo insuficiente");
            System.out.println("Saldo atual ="+ this.saldo);
            System.out.println("Valor do saque ="+valor);
            return this.saldo;
            
        }
    }

    public void exibirSaldo(){
        System.out.println("Saldo atual ="+this.saldo);
    }
}
