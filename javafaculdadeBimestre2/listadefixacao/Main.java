package listadefixacao;

public class Main {
    public static void main(String[] args) {

        Carrinho meuCarrinho = new Carrinho();
        
        ProdutoFisico p1 = new ProdutoFisico("Notebook", 3500.0, 2.5);   
        ProdutoFisico p2 = new ProdutoFisico("Mouse Gamer", 150.0, 0.3); 
        ProdutoDigital p3 = new ProdutoDigital(99.0, "Curso Java", 500.0);
        ProdutoDigital p4 = new ProdutoDigital(40.0, "E-book POO", 20.0);

       meuCarrinho.adicionarPf(p1);
       meuCarrinho.adicionarPf(p2);
       meuCarrinho.adicionarPv(p3);
       meuCarrinho.adicionarPv(p4);

        
        System.out.println(); 

        // 4. Executa o método que varre o ArrayList e calcula as somas finais
        meuCarrinho.resumo();
        
    }
    
}
