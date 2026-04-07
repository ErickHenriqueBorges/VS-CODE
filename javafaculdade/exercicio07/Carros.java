package exercicio07;

public class  Carros extends Veiculos {
    private int nportas;

    public Carros(String marca, float preco, int ano, int nportas ){
        super(marca, ano, preco);
        this.nportas=nportas;
    }
    @Override// aqui eu estou mostrando que somente estou implementado um metodo existente na class super;
    public void exibirInfo(){
        super.exibirInfo();//chamo o metodo da super exibirInfo
        System.out.println("Numero de portas:"+this.nportas);

    }


    
}
