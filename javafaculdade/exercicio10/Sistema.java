package exercicio10;

public class Sistema {
    private Float investimentoMensal;
    private Float saldo=0f;
    private Float juros=0f;
    
    
    public Sistema(float investimentoMensal, float juros){
        this.investimentoMensal=investimentoMensal;
        this.juros=juros;
    }
    public void resultado(){
        for(int i=0;i<12;i++){
            this.saldo+=this.investimentoMensal;
            this.saldo+=this.saldo*(this.juros/100);
        }
    }
    public void getSaldo(){
        System.out.println("Saldo do investimento apos 1 ano: "+ this.saldo);
    }
}
 