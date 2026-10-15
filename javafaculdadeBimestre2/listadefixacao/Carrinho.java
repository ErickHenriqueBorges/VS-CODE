package listadefixacao;
import java.util.ArrayList;
import java.util.List;     

public class Carrinho {
    private List<Produto> carrinho;

    public Carrinho(){
        this.carrinho= new ArrayList<>();
    }
    public void adicionarPf(ProdutoFisico produto){
        this.carrinho.add(produto);
        System.out.println(produto.getNome() + " adicionado ao carrinho.");
    }
    public void adicionarPv(ProdutoDigital produto){
        this.carrinho.add(produto);
        System.out.println(produto.getNome() + " adicionado ao carrinho.");
    }
    public void resumo(){
        double valortotal=0.0;
        double totalfrete=0.0;
        System.err.println("---Resumo Carrinho---");
            for (Produto p : carrinho) {
                p.descricao();
                valortotal+=p.getPreco();
                if (p instanceof ProdutoFisico) {
                    ProdutoFisico pf = (ProdutoFisico) p; 
                totalfrete += pf.getFrete();    
                }
                
            }
        System.out.println(">>>> TOTAIS DO PEDIDO <<<<");
        System.out.println("Valor total dos produtos: R$ " + valortotal);
        System.out.println("Total de frete          : R$ " + totalfrete);
        System.out.println("Valor final da compra   : R$ " + (valortotal + totalfrete));
    }
    


}
