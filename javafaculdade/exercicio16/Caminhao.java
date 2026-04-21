package exercicio16;

public class Caminhao extends Veiculos {
    private int eixos;
    
    public Caminhao(int eixos, String placa, int ano){    
        super(placa, ano);
        this.eixos=eixos;
    }
    public void setEixos(int eixos){
        this.eixos=eixos;
    }
    public int getEixos(){
        return this.eixos;
    }
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Quantidade de eixos : "+this.eixos);
    }
}
