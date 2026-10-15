package listadefixacao;

public class ProdutoFisico extends Produto{
    private Double pesoKg;

    public ProdutoFisico(String nome, Double preco, Double pesokg){
        super(nome,preco);
        this.pesoKg=pesokg;
    }
    public Double calcularFrete(){
        return ( this.pesoKg*5);
    }
    public Double getPesokg(){
        return  this.pesoKg;  
    }
   
    public Double getFrete(){
        return this.pesoKg*5;}
    @Override
    public void descricao(){
        System.out.println("Nome : "+super.getNome());
        System.out.println("Preço : "+super.getPreco());
        System.err.println("Peso KG : "+this.pesoKg);
        System.out.println("frete : " +this.getFrete());
    }
    
}
