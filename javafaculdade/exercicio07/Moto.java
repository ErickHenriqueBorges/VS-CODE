package exercicio07;

public class Moto extends Veiculos {
    private String modeloGuidon;

    public Moto(int ano, float preco, String marca, String modeloGuidon ){
        super(marca, ano, preco);
        this.modeloGuidon=modeloGuidon;

    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("modelo de guidon :"+this.modeloGuidon);
    }
}
