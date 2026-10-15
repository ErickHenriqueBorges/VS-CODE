package listadefixacao;
public class ProdutoDigital extends Produto{
    private Double tamanhoMB;

    public ProdutoDigital(double  tamanhoMB,String nome,Double preco){
        super(nome, preco);
        this.tamanhoMB=tamanhoMB; 
    }

    public Double getTamanhoMB(){
        return this.tamanhoMB;
    }
    @Override
    public void descricao(){
        System.out.println("Nome : "+super.getNome());
        System.out.println("Preço : "+super.getPreco());
        System.err.println("tamahoMB : "+this.tamanhoMB);
    }
}