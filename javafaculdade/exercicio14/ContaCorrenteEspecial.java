package exercicio14;

public class ContaCorrenteEspecial extends ContaCorrente {
    
    @Override
    public void sacar(float valorSaque){
         float saldo = getSaldo();
         saldo-=valorSaque+(valorSaque*0.01f);
         setSaldo(saldo);
         System.out.println("Valor do Saldo atual :"+getSaldo());
    }
    
}
 