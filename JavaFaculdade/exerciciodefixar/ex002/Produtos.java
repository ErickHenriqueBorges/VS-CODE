package exerciciodefixar.ex002;

public class Produtos {
    private final String produto;
    private Double preco;
    private int quantidade;

    public Produtos(String produto, Double preco, int quantidade){
        this.produto=produto;
        this.preco=preco;
        this.quantidade=quantidade;
    }
    public Double calcularValortotal(){
        double valortotal=this.preco*this.quantidade;
        return valortotal;
    }
    public void getinfo(){
        System.out.println("Produto ="+this.produto);
        System.out.println("Preço ="+this.preco);
        System.out.println("Quantidade ="+this.quantidade);
        System.out.println("valor total ="+calcularValortotal());
    }
    public void setpreco(Double preco){
        this.preco=preco;
    }
    public void setquantidade(int quantidade){
        this.quantidade=quantidade;
    }
    
}
