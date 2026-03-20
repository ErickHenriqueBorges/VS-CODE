package exerciciodefixar.ex001;

public class ContaBancaria {
    private final String titular;//uma vez que eu colocar algo dentro de titular nao tera como ser alterado 
    private Double saldo;

    public ContaBancaria(String titular, Double saldo){
        this.titular=titular;
        this.saldo=saldo;
    }
    public void depositar(Double valor){
        this.saldo+=valor;
        System.out.println(this.titular);
        System.out.println("Saldo atual= "+this.saldo);
    }
    public void sacar(Double valor){
        if(this.saldo>=valor){
            this.saldo-=valor;
            System.out.println("Saldo atual= "+this.saldo);
        }
        else{
            System.out.println("Saldo insuficiente \nSaldo atual= "+this.saldo);
        }
        
    }
    
    public void getsaldo(){
        System.out.println("Saldo = "+ saldo);

    }


}
