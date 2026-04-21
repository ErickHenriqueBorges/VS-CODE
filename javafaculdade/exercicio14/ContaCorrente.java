package exercicio14;

public class ContaCorrente {
    private float saldo;

    public ContaCorrente(){
        this.saldo=1000;
    }

    public void depositar(float valorDeposito){
        this.saldo+= valorDeposito;
        System.out.println("Valor atual do saldo : "+this.saldo);
    }
    public void sacar( float valorSaque){
        this.saldo-=valorSaque+(valorSaque*0.05f);
        System.out.println("Valor atual do saldo : "+this.saldo);
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float saldoAtual){
        this.saldo=saldoAtual;
    }
    
}
