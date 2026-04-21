package exercicio16;

public class Onibus extends Veiculos {
    private int assentos;

    public Onibus(int assentos, String placa , int ano){
        super(placa, ano);
        this.assentos=assentos;
    }
    public void setAssentos(int assentos){
        this.assentos=assentos;
    }
    public int getAssentos(){
        return this.assentos;
    }
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Numero de assentos : "+this.assentos);
    }
}
