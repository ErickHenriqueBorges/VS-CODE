package exercicio07;

public class Veiculos {
    private String marca;
    private int ano;
    private float preco;

    public Veiculos(String marca, int ano, float preco){
        this.preco=preco;
        this.ano=ano;
        this.marca=marca;
    }

    public void exibirInfo(){
        System.out.println("marca :"+this.marca);
        System.out.println("preço :"+this.preco);
        System.out.println("Ano :"+this.ano);

    }

    public void setPreco(Float preco){
        this.preco=preco;
    }
    public void setAno(int ano){
        this.ano=ano;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }
}
