package exercicio08;

public class Escola {
    private int nMatricula;
    private String nome;
    private Float prova1;
    private Float prova2;
    private Float trabalho;
    
    public Escola(int nMatricula,String nome, float prova1, float prova2,Float trabalho ){
        this.nMatricula=nMatricula;
        this.nome=nome;
        this.prova1=prova1;
        this.prova2=prova2;
        this.trabalho=trabalho;
    }
    public float media(){
        return (float)((this.prova1*2.5+this.prova2*2.5+this.trabalho*2.0)/7.0);
    } 
    public void notaFinal(){
        float mediaAtual=media();
            
            if(mediaAtual<100){
                float necessario=100-mediaAtual;
                System.out.println("Nota necessaria:"+necessario);
            }
            else{
                System.out.println("0");
            }
    }


}
